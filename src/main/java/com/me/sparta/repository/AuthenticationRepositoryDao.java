package com.me.sparta.repository;

public interface AuthenticationRepositoryDao {
    AuthenticationData findByUsernameAndPassword(String username, String password);
}
