<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculator - Home</title>
</head>
<body style="text-align: center;">
    <h2>Life is either a daring adventure or nothing.</h2>
    <h1>Make Calculation</h1>

    <form action="${pageContext.request.contextPath}/addpage" method="get">
        <button type="submit">Addition</button>
    </form> <br>

    <form action="${pageContext.request.contextPath}/subpage" method="get">
        <button type="submit">Subtraction</button>
    </form> <br>

    <form action="${pageContext.request.contextPath}/divpage" method="get">
        <button type="submit">Division</button>
    </form> <br>

    <form action="${pageContext.request.contextPath}/multipage" method="get">
        <button type="submit">Multiplication</button>
    </form> <br>

    <span style='font-size: 100px;'>&#128515;</span><br><br>

    <footer>@Project by Killer Expertise (Vishal)</footer>
</body>
</html>
