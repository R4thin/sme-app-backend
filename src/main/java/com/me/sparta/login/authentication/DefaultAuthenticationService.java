package com.me.sparta.login.authentication;

import com.me.sparta.repositories.authentication.AuthenticationData;
import com.me.sparta.repositories.authentication.AuthenticationRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DefaultAuthenticationService implements AuthenticationService {

    @Autowired
    private AuthenticationRepositoryDao authenticationRepositoryDao;

    @Override
    public AuthenticationRespone authenticate(UserCredentials userCredentials) {
        AuthenticationData authenticationData = authenticationRepositoryDao.findByUsernameOrEmailAndPassword(userCredentials.getPreference(), userCredentials.getPassword());
        if (authenticationData == null) {
            return null;
        }
        return new AuthenticationRespone(UUID.randomUUID().toString(),authenticationData.getUserId(),authenticationData.getUsername());
    }
}
