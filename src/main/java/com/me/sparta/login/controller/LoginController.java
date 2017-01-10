package com.me.sparta.login.controller;

import com.me.sparta.security.Authentication;
import com.me.sparta.security.AuthenticationService;
import com.me.sparta.security.UserCredentials;
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
    public ResponseEntity<Authentication> createTelephoneNumber(@RequestBody UserCredentials userCredentials) {

        Authentication authentication = authenticationService.authenticate(userCredentials);
        HttpStatus httpStatus = authentication == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK;

        return new ResponseEntity<Authentication>(authentication, httpStatus);
    }
}