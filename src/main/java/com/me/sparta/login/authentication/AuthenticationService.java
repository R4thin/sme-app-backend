package com.me.sparta.login.authentication;

public interface AuthenticationService {
    AuthenticationRespone authenticate(UserCredentials userCredentials);
}
