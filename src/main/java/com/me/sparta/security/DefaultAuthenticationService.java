package com.me.sparta.security;

import org.springframework.stereotype.Service;

@Service
public class DefaultAuthenticationService implements AuthenticationService{

    @Override
    public Authentication authenticate(UserCredentials userCredentials) {
        return new Authentication("123", "Successful authenication");
    }
}
