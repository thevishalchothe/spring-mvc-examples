package com.vishal.springmvc.service;

import com.vishal.springmvc.model.User;

public interface UserService {
    boolean handleRegistration(User user);
    User handleLogin(String username, String password);
}
