package com.me.sparta.repositories.registration;

import com.me.sparta.repositories.authentication.AuthenticationData;
import com.me.sparta.repositories.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class RegistrationInformationRepository implements RegistrationInformationRepositoryDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Response register(RegistrationDetails registrationDetails) {

        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(registrationDetails.getUsername()).orOperator(Criteria.where("email").is(registrationDetails.getEmail())));
        List<RegistrationInformationData> registrationInformationDataList = mongoTemplate.find(query, RegistrationInformationData.class);

        if (registrationInformationDataList == null || registrationInformationDataList.isEmpty()) {
            createRegistration(registrationDetails);
            createAuthentication(registrationDetails);
            return new Response("Successful", registrationInformationDataList);
        }

        return new Response("Duplicate registration", registrationInformationDataList.get(0));
    }

    private void createAuthentication(RegistrationDetails registrationDetails) {
        mongoTemplate.save(new AuthenticationData(UUID.randomUUID().toString(), registrationDetails.getUsername(), registrationDetails.getEmail(), registrationDetails.getPassword()));
    }

    private void createRegistration(RegistrationDetails registrationDetails) {
        mongoTemplate.save(new RegistrationInformationData(UUID.randomUUID().toString(), registrationDetails.getUsername(), registrationDetails.getFirstName(), registrationDetails.getSurname(), registrationDetails.getEmail()));
    }
}
