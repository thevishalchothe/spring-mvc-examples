package com.vishal.springmvc.controller;

import com.vishal.springmvc.model.User;
import com.vishal.springmvc.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") User user, Model model) {
        boolean isRegistered = userService.handleRegistration(user);
        if (isRegistered) {
            model.addAttribute("message", "Registration successful! You can now log in.");
            model.addAttribute("registrationSuccess", true);
        } else {
            model.addAttribute("message", "Registration failed. Username might already be taken. Please try again.");
            model.addAttribute("registrationSuccess", false);
        }
        return "register";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {

        User user = userService.handleLogin(username, password);
        if (user != null) {
            session.setAttribute("username", user.getUname());
            return "redirect:/login-success";
        } else {
            model.addAttribute("message", "Invalid username or password!");
            return "login";
        }
    }

    @GetMapping("/login-success")
    public String showLoginSuccess(HttpSession session, Model model) {
        String username = (String) session.getAttribute("username");
        if (username != null) {
            model.addAttribute("username", username);
            return "login-success";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
