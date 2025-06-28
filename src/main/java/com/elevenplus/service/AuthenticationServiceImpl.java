package com.elevenplus.service;

import com.elevenplus.model.AuthSuccess;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.json.gson.GsonFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private static final JsonFactory jsonFactory = GsonFactory.getDefaultInstance();
    private static final HttpTransport transport = new NetHttpTransport();
    private static final String CLIENT_ID = "client-id";

    @Override
    public AuthSuccess authenticateWithGoogle(String idToken) throws IllegalArgumentException, GeneralSecurityException, IOException {
        if (idToken == null || idToken.isEmpty()) {
            throw new IllegalArgumentException("Invalid ID token");
        }

        // Simulate authentication logic (e.g., verify ID token with Google API)
        // Replace this with actual implementation
        boolean isValidToken = verifyIdTokenWithGoogle(idToken);

        if (!isValidToken) {
            throw new IllegalArgumentException("Invalid ID token");
        }

        // Return success response
        return new AuthSuccess("Authentication successful");
    }

    private boolean verifyIdTokenWithGoogle(String idToken) throws GeneralSecurityException, IOException {
         GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
                 .setAudience(Collections.singletonList(CLIENT_ID))
                 .build();
         GoogleIdToken googleIdToken = verifier.verify(idToken);
         if (googleIdToken == null) {
             return false;
         }
         GoogleIdToken.Payload payload = googleIdToken.getPayload();
         String userId = payload.getSubject(); // Use this to get the user's ID

        return true; // Assume token is valid for demonstration purposes
    }
}