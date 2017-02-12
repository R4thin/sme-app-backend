package com.me.sparta.repositories.customer;

import com.me.sparta.repositories.model.Response;

public interface CustomerInformationRepositoryDao {
    Response addCustomer(CustomerInformation customerInformation);
}
