# User Credentials MVC with Database Example 💾

The `user-credentials-mvc-db` project extends the basic `user-credential-mvc` example by adding real JDBC-based persistence using MySQL. It demonstrates a full Spring MVC architecture with annotation-based configuration, database access, and JSP views.

---

## Key Features at a Glance

- 🛠 **Full Spring MVC Architecture**: Uses `@Controller`, `@Service`, and `@Repository` annotations with component scanning.
- 🗄 **JDBC & MySQL Integration**: Database operations performed via JDBC using `DriverManagerDataSource`.
- 📝 **User Registration & Login**: Supports user registration with data validation and login with session management.
- 🖥 **JSP Views**: Clean and simple JSP pages for registration, login, and success.
- 🧩 **Separation of Concerns**: Clear layering between controller, service, and repository.
- 🔄 **Annotation-based Configuration**: Configured using Java `AppConfig` instead of XML.

---

## MVC Flow

- `UserController` handles web requests for user registration and login.
- `UserService` processes business logic and validation.
- `UserRepository` performs database CRUD operations.
- Spring's `DriverManagerDataSource` manages DB connections.

---

## Summary

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
