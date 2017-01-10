package com.me.sparta.security;

public class Authentication {

    private String token;
    private String message;

    public Authentication() {
    }

    public Authentication(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "token='" + token + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
