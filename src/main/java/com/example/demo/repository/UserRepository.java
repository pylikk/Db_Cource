package com.example.demo.repository;

import com.example.demo.model.User;

public interface UserRepository {
    void saveUser(User user);
    User getUser(int id);
}
