package com.me.sparta.repositories.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthenticationRepository implements AuthenticationRepositoryDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public AuthenticationData findByUsernameOrEmailAndPassword(String preference, String password) {
        Query query = new Query();
        query.addCriteria(Criteria.where("username").is(preference).and("password").is(password).orOperator(
                Criteria.where("email").is(preference).and("password").is(password)
        ));

        List<AuthenticationData> data = mongoTemplate.find(query, AuthenticationData.class);
        AuthenticationData authenticationData= (data== null || data.isEmpty()) ? null : data.get(0);

        return authenticationData;
    }
}
