package com.me.sparta.customer;

import com.me.sparta.repositories.customer.CustomerInformation;
import com.me.sparta.repositories.customer.CustomerInformationRepositoryDao;
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
public class CustomerController {

    @Autowired
    private CustomerInformationRepositoryDao customerInformationRepositoryDao;

    @PostMapping(path = "/customer/add", consumes = "application/json")
    public ResponseEntity<Response> addCustomer(@RequestBody() CustomerInformation customerInformation){

        Response response = customerInformationRepositoryDao.addCustomer(customerInformation);
        HttpStatus httpStatus = "Successful".equals(response.getMessage())? HttpStatus.OK : HttpStatus.NOT_ACCEPTABLE;

        return new ResponseEntity<Response>(response, httpStatus);
    }
}
