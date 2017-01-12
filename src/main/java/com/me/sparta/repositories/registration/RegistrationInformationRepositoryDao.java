package com.me.sparta.repositories.registration;

import com.me.sparta.repositories.model.Response;

public interface RegistrationInformationRepositoryDao {
    Response register(RegistrationDetails registrationDetails);
}
