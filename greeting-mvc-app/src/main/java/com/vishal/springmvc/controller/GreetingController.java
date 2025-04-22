package com.vishal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;

@Controller
public class GreetingController {

    @RequestMapping("/welcome")
    public String showGreetingPage() {
        return "welcome"; // returns welcome.jsp
    }
    @RequestMapping("/greeting")
    public String showGreetingPage(Model model) {
        model.addAttribute("message", getGreetingMessage());
        return "greeting"; // returns greeting.jsp
    }

    private String getGreetingMessage() {
        int hour = LocalTime.now().getHour();
        if (hour < 12) return "Good Morning!";
        else if (hour < 18) return "Good Afternoon!";
        else return "Good Evening!";
    }
}
