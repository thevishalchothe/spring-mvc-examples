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

- **user-credentials-mvc-db**  
    - `user-credentials-mvc-db` extends the `user-credential-mvc` example with real JDBC-based persistence using MySQL.  
    - It demonstrates full Spring MVC architecture using annotation-based configuration, DataSource for database access, and JSP views.  
    - Features include:  
        - User registration with validation and data storage in MySQL  
        - Login using username and password with session handling  
        - Spring `@Controller`, `@Service`, and `@Repository` layers  
        - JDBC integration using `DriverManagerDataSource`  
        - Clean separation of concerns and real-world MVC flow  
    - A great stepping stone for building more advanced Spring MVC applications with full database integration.

---

### **Technologies Used** 💻🔧

#### **Backend Technologies**
- **Java (JDK 21)** ☕️: Core programming language for the application logic.
- **Spring Framework (Core)** 🌱: For IoC, DI, and managing beans using annotation-based configuration.
- **Spring MVC** 🖥️: For handling HTTP requests and building web applications using the MVC pattern.
- **JDBC** 📡: To connect and interact with the MySQL database.
- **MySQL** 🗄️: Stores data for books, users, admins, and borrow records.
- **Maven** 🧰: For dependency management and project building.

---

### **Prerequisites** 🛠️

Before you begin, make sure the following are installed:

- **Java JDK 21 or later**: Download from [Oracle](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) or [OpenJDK](https://jdk.java.net/21/).
- **IntelliJ IDEA for Enterprise Java**: Download from [IntelliJ IDEA Download](https://www.jetbrains.com/idea/download/)
- **MySQL Server**: Install from [MySQL Community](https://dev.mysql.com/downloads/installer/).
- **Maven**: [Install Maven](https://maven.apache.org/install.html) if not bundled with your IDE.

---

## **Installation** 🛠️

### **Clone the Repository**

```bash
git clone https://github.com/thevishalchothe/spring-core-examples.git

cd spring-core-examples
   ```

---
