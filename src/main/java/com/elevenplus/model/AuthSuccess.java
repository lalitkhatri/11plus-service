package com.elevenplus.model;

public class AuthSuccess {
    private String message;
    String userId;
    String accessToken;

    public AuthSuccess(String message) {
        this.message = message;
    }

    public AuthSuccess(String userId, String accessToken) {
        this.userId = userId;
        this.accessToken = accessToken;
        this.message = "Authentication successful";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
