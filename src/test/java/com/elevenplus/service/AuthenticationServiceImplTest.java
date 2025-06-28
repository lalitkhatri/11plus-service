package com.elevenplus.service;

import com.elevenplus.model.AuthSuccess;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.security.GeneralSecurityException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AuthenticationServiceImplTest {

    private AuthenticationServiceImpl authenticationService;

    @Mock
    private GoogleIdTokenVerifier verifier;

    @Mock
    private GoogleIdToken googleIdToken;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        authenticationService = new AuthenticationServiceImpl(verifier);
    }

    @Test
    void testAuthenticateWithGoogle_ValidToken() throws GeneralSecurityException, IOException {
        // Mock valid token behavior
        when(verifier.verify("valid-id-token")).thenReturn(googleIdToken);
        when(googleIdToken.getPayload()).thenReturn(mock(GoogleIdToken.Payload.class));

        AuthSuccess result = authenticationService.authenticateWithGoogle("valid-id-token");

        assertNotNull(result);
        assertEquals("Authentication successful", result.getMessage());
    }

    @Test
    void testAuthenticateWithGoogle_InvalidToken() throws GeneralSecurityException, IOException {
        // Mock invalid token behavior
        when(verifier.verify("invalid-id-token")).thenReturn(null);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> authenticationService.authenticateWithGoogle("invalid-id-token"));

        assertEquals("Invalid ID token", exception.getMessage());
    }

    @Test
    void testAuthenticateWithGoogle_NullToken() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> authenticationService.authenticateWithGoogle(null));

        assertEquals("Invalid ID token", exception.getMessage());
    }

    @Test
    void testAuthenticateWithGoogle_EmptyToken() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> authenticationService.authenticateWithGoogle(""));

        assertEquals("Invalid ID token", exception.getMessage());
    }
}