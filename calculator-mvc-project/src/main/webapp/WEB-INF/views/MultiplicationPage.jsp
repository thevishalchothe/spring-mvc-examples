<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Page</title>
</head>
<body style="text-align: center;">
    <h2>Make Multiplication</h2><br>

    <form action="${pageContext.request.contextPath}/multiplicationresult" method="post">
        Enter 1st No :
        <input type="text" name="firstNumber" placeholder="Enter 1st value" required />
        <br><br>
        Enter 2nd No :
        <input type="text" name="secondNumber" placeholder="Enter 2nd value" required />
        <br><br>

        <span style='font-size: 100px;'>&#129300;</span><br><br>

        <input type="submit" value="Multiply" />
    </form>
</body>
</html>
