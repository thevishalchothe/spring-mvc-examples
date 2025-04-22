package com.vishal.springmvc.service;


import jakarta.servlet.http.HttpServletRequest;

public interface UserService {
    void handleRegistration(HttpServletRequest request);
    boolean handleLogin(HttpServletRequest request);
}
