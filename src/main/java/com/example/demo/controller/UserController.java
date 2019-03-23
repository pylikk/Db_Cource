package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PostMapping("saveUser")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
