# spring-mvc-examples ⚙️🖼️

`spring-mvc-examples` demonstrating basic setup with traditional controllers, spring configuration, and JSP views for handling web requests and rendering responses. 

---

## Project Architecture 📂

- **hello-spring-mvc**  
    - `hello-spring-mvc` demonstrates a basic Spring MVC setup,  
    - Traditional controllers, Spring configuration, and JSP views for handling web requests and rendering responses.

- **greeting-mvc-app**  
    - `greeting-mvc-app` is a simple Spring MVC web application that greets users based on the time of day.  
    - It demonstrates request handling with a controller, view resolution using JSP, and user interaction via a greeting form.  
    - Features include:  
        - Redirect from `index.jsp` to a welcome page and a button to fetch a greeting  
        - Dynamic greeting message using server-side logic based on current time (morning/afternoon/evening)  
    - Ideal for beginners to understand Spring MVC flow using XML configuration and simple UI interaction.

- **user-credential-mvc**  
    - `user-credential-mvc` is a basic Spring MVC project to register and log in users using a controller and a service layer backed by an in-memory `Map` to store credentials.  
    - It demonstrates the MVC pattern without database interaction.  
    - Features include:  
        - JSP forms for user registration and login  
        - Spring controller to handle requests  
        - A service implementation that stores users in a `HashMap`  
        - Feedback messages for successful and failed login attempts  
    - A great stepping stone before integrating JDBC or databases in a Spring MVC application.
