package com.vishal.springmvc.controller;

import com.vishal.springmvc.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(HttpServletRequest request) {
        userService.handleRegistration(request);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(HttpServletRequest request) {
        boolean isValid = userService.handleLogin(request);
        return isValid ? "success" : "login";
    }

}
