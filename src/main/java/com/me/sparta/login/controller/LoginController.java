package com.me.sparta.login.controller;

import com.me.sparta.login.authentication.AuthenticationResponse;
import com.me.sparta.login.authentication.AuthenticationService;
import com.me.sparta.login.authentication.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(path = "/login", consumes = "application/json")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody UserCredentials userCredentials) {

        AuthenticationResponse authentication = authenticationService.authenticate(userCredentials);
        HttpStatus httpStatus = authentication == null ? HttpStatus.NOT_ACCEPTABLE : HttpStatus.OK;

        return new ResponseEntity<AuthenticationResponse>(authentication, httpStatus);
    }
}