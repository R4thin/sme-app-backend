package com.me.sparta.login.authentication;

public interface AuthenticationService {
    AuthenticationResponse authenticate(UserCredentials userCredentials);
}
