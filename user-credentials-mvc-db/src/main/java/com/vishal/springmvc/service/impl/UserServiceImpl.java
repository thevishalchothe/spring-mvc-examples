package com.vishal.springmvc.service.impl;

import com.vishal.springmvc.model.User;
import com.vishal.springmvc.repository.UserRepository;
import com.vishal.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Handle user registration
    @Override
    public boolean handleRegistration(User user) {
        // Check if the username already exists
        if (userRepository.existsByUsername(user.getUsername())) {
            return false; // Username already exists
        }

        try {
            userRepository.save(user);
            return true; // Registration successful
        } catch (Exception e) {
            return false; // Registration failed
        }
    }

    // Handle login
    @Override
    public User handleLogin(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
