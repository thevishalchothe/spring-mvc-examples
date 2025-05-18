# Calculator MVC Project 🧮

The `calculator-mvc-project` is a Spring MVC web application that supports basic calculator operations, including addition, subtraction, multiplication, and division.


---

## Key Features

- 📄 Separate JSP pages for input and result display of each operation  
- ⚙️ Spring MVC configuration using XML (`springmvc-servlet.xml` and `web.xml`)
-  Addition, Subtraction, Multiplication, Division of two numbers  

---

## Project Details 📝

### HomeController.java
- Handles incoming HTTP requests for all calculator operations.
- Maps URLs to specific views for addition, subtraction, multiplication, and division.
- Processes form input, performs calculations, and returns results to the corresponding result JSP pages.

### AddValue.java
- Model class representing the operands and result.
- Contains fields for the two input numbers and the calculated result.
- Used to transfer data between the controller and the views.

### JSP Views
- **Input Pages:**  
  - `AdditionPage.jsp`  
  - `SubtractionPage.jsp`  
  - `MultiplicationPage.jsp`  
  - `DivisionPage.jsp`  
- **Result Pages:**  
  - `addResult.jsp`  
  - `subResult.jsp`  
  - `multiResult.jsp`  
  - `divResult.jsp`  
- Each input page contains a form for user input.  
- Result pages display the output of the calculation.

### Configuration Files
- **springmvc-servlet.xml**  
  - Defines Spring MVC beans, view resolvers, and handler mappings.  
  - Configures the controller beans and their URL mappings.

- **web.xml**  
  - Configures the DispatcherServlet for Spring MVC.  
  - Defines servlet mappings and context parameters if any.
