package com.me.sparta.repositories.customer;

import com.me.sparta.repositories.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerInformationRepository implements CustomerInformationRepositoryDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Response addCustomer(CustomerInformation customerInformation) {
        Query query = new Query();
        query.addCriteria(Criteria.where("idNumber").is(customerInformation.getIdNumber()).orOperator(Criteria.where("email").is(customerInformation.getEmail())));
        boolean exist = mongoTemplate.exists(query, CustomerInformationData.class);

        if (exist) {
            return new Response("Error", customerInformation);
        }

        mongoTemplate.insert(new CustomerInformationData(customerInformation));

        return new Response("Successful", customerInformation);
    }

    @Override
    public List<CustomerInformationData> getCustomers() {
        List<CustomerInformationData> customers = mongoTemplate.findAll(CustomerInformationData.class);
        return customers;
    }
}
