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

    <p>Please choose an action below:</p>

    <!-- Registration Button -->
    <form action="register" method="get" style="margin-bottom: 10px;">
        <input type="submit" value="Register Here!" />
    </form>

    <!-- Login Button -->
    <form action="login" method="get">
        <input type="submit" value="Login Here!" />
    </form>
</body>
</html>
