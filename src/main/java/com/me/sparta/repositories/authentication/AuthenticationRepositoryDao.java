package com.me.sparta.repositories.authentication;

public interface AuthenticationRepositoryDao {
    AuthenticationData findByUsernameOrEmailAndPassword(String username, String password);
}
