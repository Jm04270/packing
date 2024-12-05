package com.example.test3.service;

import com.example.test3.entity.User;
import com.example.test3.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @PostConstruct
    public void loadTestData() {
        List<User> users = userRepository.findAll();
        System.out.println("Users in database: " + users);
    }
}