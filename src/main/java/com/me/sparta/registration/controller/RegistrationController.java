package com.me.sparta.registration.controller;

import com.me.sparta.repositories.model.Response;
import com.me.sparta.repositories.registration.RegistrationDetails;
import com.me.sparta.repositories.registration.RegistrationInformationRepositoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationInformationRepositoryDao registrationRepositoryDao;

    @PostMapping(path = "/register", consumes = "application/json")
    public ResponseEntity<Response> register(@RequestBody() RegistrationDetails registrationDetails){

        Response response = registrationRepositoryDao.register(registrationDetails);
        HttpStatus httpStatus = "Successful".equals(response.getMessage())? HttpStatus.OK : HttpStatus.NOT_ACCEPTABLE;

        return new ResponseEntity<Response>(response, httpStatus);
    }
}
