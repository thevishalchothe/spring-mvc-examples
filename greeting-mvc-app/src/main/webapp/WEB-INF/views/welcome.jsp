<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Welcome - Spring MVC App</title>
</head>
<body>
    <h1>Welcome to My Spring MVC Website!</h1>

    <p>Please take a greeting from us:</p>

    <!-- Greeting Button -->
    <form action="greeting" method="get">
        <input type="submit" value="Take Greeting!" />
    </form>
</body>
</html>