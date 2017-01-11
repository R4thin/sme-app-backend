package com.me.sparta.login.authentication;

import com.me.sparta.repository.AuthenticationData;
import com.me.sparta.repository.AuthenticationRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DefaultAuthenticationService implements AuthenticationService {

    @Autowired
    private AuthenticationRepositoryDao authenticationRepositoryDao;

    @Override
    public AuthenticationRespone authenticate(UserCredentials userCredentials) {
        AuthenticationData authenticationData = authenticationRepositoryDao.findByUsernameAndPassword(userCredentials.getUsername(), userCredentials.getPassword());
        if (authenticationData == null) {
            return null;
        }
        return new AuthenticationRespone(UUID.randomUUID().toString(),authenticationData.getUserId(),authenticationData.getUsername());
    }
}
