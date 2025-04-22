package com.vishal.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @RequestMapping("/welcome")
    public String viewGreetingPage() {
        return "welcome"; // returns welcome.jsp
    }

}
