package com.elevenplus.controller;

import com.elevenplus.model.AuthSuccess;
import com.elevenplus.model.Error;
import com.elevenplus.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth/google")
public class GoogleAuthController {

    private final AuthenticationService authenticationService;

    public GoogleAuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginWithGoogle(@RequestBody Map<String, String> requestBody) {
        String idToken = requestBody.get("idToken");
        if (idToken == null || idToken.isEmpty()) {
            return ResponseEntity.badRequest().body(new Error(400, "ID token is required"));
        }

        try {
            AuthSuccess authSuccess = authenticationService.authenticateWithGoogle(idToken);
            return ResponseEntity.ok(authSuccess);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(401).body(new Error(401, e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.status(500).body(new Error(500, "Internal server error"));
        }
    }
}