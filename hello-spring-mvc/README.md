# Hello Spring MVC Example 🌐

The `hello-spring-mvc` project demonstrates a traditional Spring MVC setup using XML-based configuration, servlet dispatching, and JSP views to handle basic web requests.

---

## Key Features 

This project introduces core Spring MVC components and their interaction:

- 🛠 **Spring MVC Setup**: Configured with `web.xml` and Spring’s `dispatcher-servlet.xml`.
- 📄 **JSP View Resolution**: Uses JSPs with JSTL for rendering HTML responses.
- 🎯 **Controller Examples**: Supports both traditional `Controller` interface and modern annotation-based controllers (`@Controller` and `@RequestMapping`).

---

## MVC Flow

The `GreetingController` handles HTTP requests and routes to the `welcome.jsp` view.

### Endpoint

- `GET /welcome`  
  → Returns the greeting page rendered via JSP.

---

## View Layer

- The controller returns a logical view name.
- Spring’s `InternalResourceViewResolver` maps this name to a JSP located under `/WEB-INF/views/`.

---

## Controller Class (Annotation-based)

```java
package com.vishal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @RequestMapping("/welcome")
    public String viewGreetingPage() {
        return "welcome";  // Resolves to welcome.jsp
    }
}
