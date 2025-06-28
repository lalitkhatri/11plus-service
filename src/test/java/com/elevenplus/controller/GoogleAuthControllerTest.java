package com.elevenplus.controller;

import com.elevenplus.model.AuthSuccess;
import com.elevenplus.model.Error;
import com.elevenplus.service.AuthenticationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GoogleAuthControllerTest {

    @Mock
    private AuthenticationService authenticationService;

    @InjectMocks
    private GoogleAuthController googleAuthController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoginWithGoogle_MissingIdToken() {
        Map<String, String> requestBody = new HashMap<>();
        ResponseEntity<?> response = googleAuthController.loginWithGoogle(requestBody);
        assertEquals(400, response.getStatusCode().value());
        assertInstanceOf(Error.class, response.getBody());
        Error error = (Error) response.getBody();
        assertEquals(400, error.getStatusCode());
        assertEquals("ID token is required", error.getMessage());
    }

    @Test
    void testLoginWithGoogle_Success() throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("idToken", "valid-token");
        AuthSuccess authSuccess = new AuthSuccess("userId", "accessToken");
        when(authenticationService.authenticateWithGoogle("valid-token")).thenReturn(authSuccess);

        ResponseEntity<?> response = googleAuthController.loginWithGoogle(requestBody);
        assertEquals(200, response.getStatusCode().value());
        assertInstanceOf(AuthSuccess.class, response.getBody());
        AuthSuccess result = (AuthSuccess) response.getBody();
        assertEquals("userId", result.getUserId());
        assertEquals("accessToken", result.getAccessToken());
    }

    @Test
    void testLoginWithGoogle_AuthenticationFails() throws Exception {
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("idToken", "invalid-token");
        when(authenticationService.authenticateWithGoogle("invalid-token")).thenThrow(new RuntimeException("Invalid token"));

        ResponseEntity<?> response = googleAuthController.loginWithGoogle(requestBody);
        assertEquals(401, response.getStatusCode().value());
        assertInstanceOf(Error.class, response.getBody());
        Error error = (Error) response.getBody();
        assertEquals(401, error.getStatusCode());
        assertEquals("Authentication failed", error.getMessage());
    }
}

