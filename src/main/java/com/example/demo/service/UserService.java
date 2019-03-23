package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    void saveUser(User user);
    User getUser(int id);
}
