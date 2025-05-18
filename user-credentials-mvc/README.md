# User Credential MVC Example 🔐

The `user-credential-mvc` project is a basic Spring MVC application for user registration and login. It uses a controller and a service layer backed by an in-memory `Map` to manage user credentials, demonstrating the MVC pattern without database interaction.

---

## Key Features 

- 📝 **User Registration & Login**: Simple forms to register new users and login existing users.
- 🎯 **Spring MVC Controller**: `UserController` handles HTTP requests for registration and login.
- 🛠 **Service Layer**: `UserService` interface and `UserServiceImpl` implementation use an in-memory `HashMap` to store user credentials.
- 📄 **JSP Views**: Separate JSP pages for login, registration, and success feedback.
- ⚠️ **Validation & Feedback**: Displays messages for successful registration, login success, or login failure.

---

## MVC Flow

- `UserController` maps endpoints for:
  - Displaying registration and login forms
  - Processing form submissions
  - Showing success or error messages based on the service layer results

---

## Summary

- **user-credential-mvc**  
  - `user-credential-mvc` is a basic Spring MVC project to register and log in users using a controller and a service layer backed by an in-memory `Map` to store credentials.  
  - It demonstrates the MVC pattern without database interaction.  
  - Features include:  
    - JSP forms for user registration and login  
    - Spring controller to handle requests  
    - A service implementation that stores users in a `HashMap`  
    - Feedback messages for successful and failed login attempts  
  - A great stepping stone before integrating JDBC or databases in a Spring MVC application.
