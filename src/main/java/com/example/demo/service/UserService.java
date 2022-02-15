package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(long id);
    User change(User user);
    List<User> listUsers();
    User findUserById(long id);
}
