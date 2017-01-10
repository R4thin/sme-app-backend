package com.me.sparta.login.controller;

import com.me.sparta.security.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(path = "/login")
    public Map<String, String> createTelephoneNumber(@RequestParam("username") String username, @RequestParam("password") String password) {

        Map<String, String> map = new HashMap<>();

        map.put("userCredentials.getUsername()", "userCredentials.getPassword()");
        return  map;
    }
}