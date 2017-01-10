package com.me.sparta.security;

public interface AuthenticationService {
    Authentication authenticate(UserCredentials userCredentials);
}
