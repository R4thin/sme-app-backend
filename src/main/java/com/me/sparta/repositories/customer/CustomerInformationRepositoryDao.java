package com.me.sparta.repositories.customer;

import com.me.sparta.repositories.model.Response;

import java.util.List;

public interface CustomerInformationRepositoryDao {
    Response addCustomer(CustomerInformation customerInformation);

    List<CustomerInformationData> getCustomers();
}
