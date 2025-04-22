package com.vishal.springmvc.service.impl;

import com.vishal.springmvc.model.User;
import com.vishal.springmvc.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final Map<String, User> users = new HashMap<>();

    @Override
    public void handleRegistration(HttpServletRequest request) {
        String uname = request.getParameter("uname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String mobileNumber = request.getParameter("mobileNumber");

        User user = new User(uname, username, password, email, mobileNumber);
        users.put(username, user);
    }

    @Override
    public boolean handleLogin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            request.setAttribute("message", "Login successful! Welcome " + username);
            return true;
        } else {
            request.setAttribute("error", "Invalid credentials!");
            return false;
        }
    }
}
