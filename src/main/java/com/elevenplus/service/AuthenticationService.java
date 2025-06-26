package com.elevenplus.service;

import com.elevenplus.model.AuthSuccess;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface AuthenticationService {
    AuthSuccess authenticateWithGoogle(String idToken) throws IllegalArgumentException, GeneralSecurityException, IOException;
}
