# Greeting MVC App Example 🌐

The `greeting-mvc-app` project is a simple Spring MVC web application that greets users based on the time of day. It demonstrates request handling with annotation-based controllers, view resolution with JSP, and dynamic user interaction.

---

## Key Features 

- 🛠 **Spring MVC Setup**: Uses XML-based configuration for dispatcher servlet and view resolver.
- 🎯 **Annotation-based Controller**: `GreetingController` handles requests and binds model data.
- ⏰ **Dynamic Greeting**: Displays a greeting message (Good Morning/Afternoon/Evening) based on the current server time.
- 📄 **JSP Views**: Two JSP pages, `welcome.jsp` and `greeting.jsp`, render the UI.
- 🚦 **User Interaction**: Starts from `index.jsp` redirecting to welcome, with a button to fetch dynamic greetings.

---

## MVC Flow

The `GreetingController` maps two endpoints:

- `GET /welcome`  
  → Returns the static welcome page (`welcome.jsp`).

- `GET /greeting`  
  → Calculates a greeting message based on time and returns the `greeting.jsp` with the message.

---

## View Layer

- Logical view names from controller are resolved to JSPs in `/WEB-INF/views/` using Spring’s `InternalResourceViewResolver`.

---

## Controller Class

```java
package com.vishal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;

@Controller
public class GreetingController {

    @RequestMapping("/welcome")
    public String showGreetingPage() {
        return "welcome";  // returns welcome.jsp
    }

    @RequestMapping("/greeting")
    public String showGreetingPage(Model model) {
        model.addAttribute("message", getGreetingMessage());
        return "greeting";  // returns greeting.jsp
    }

    private String getGreetingMessage() {
        int hour = LocalTime.now().getHour();
        if (hour < 12) return "Good Morning!";
        else if (hour < 18) return "Good Afternoon!";
        else return "Good Evening!";
    }
}
```
---
## Summary - greeting-mvc-app

  -  greeting-mvc-app is a simple Spring MVC web application that greets users based on the time of day.
  -  It demonstrates request handling with a controller, view resolution using JSP, and user interaction via a greeting form.

Features include:
  -  Redirect from index.jsp to a welcome page and a button to fetch a greeting
  -  Dynamic greeting message using server-side logic based on current time (morning/afternoon/evening)
