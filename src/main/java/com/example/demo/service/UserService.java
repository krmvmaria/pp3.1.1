package com.example.demo.service;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user) {
        userRepository.save(user);
    }

    public void delete(long id){
        userRepository.delete(userRepository.getById(id));
    }

    public User findUserById(long id){
        return userRepository.getById(id);
    }

    public User change(User user) {
        return userRepository.save(user);
    }

    public List<User> listUsers () {
        return userRepository.findAll();
    }
}
