<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
    <script type="text/javascript">
        <c:if test="${registrationSuccess != null}">
            <c:choose>
                <c:when test="${registrationSuccess}">
                    alert("Registration successful! You can now log in.");
                </c:when>
                <c:otherwise>
                    alert("Registration failed. Please try again.");
                </c:otherwise>
            </c:choose>
        </c:if>
    </script>
</head>
<body>
    <table border="0" width="100%">
        <tr>
            <td><h1>Welcome to User Credential MVC</h1></td>
        </tr>
        <tr>
            <td><h2>Register</h2></td>
        </tr>
        <c:if test="${not empty message}">
            <tr>
                <td style="color:red;">${message}</td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form action="${pageContext.request.contextPath}/register" method="post">
                    <table border="0">
                        <tr><td>Name:</td><td><input type="text" name="uname" required></td></tr>
                        <tr><td>Username:</td><td><input type="text" name="username" required></td></tr>
                        <tr><td>Password:</td><td><input type="password" name="password" required></td></tr>
                        <tr><td>Email:</td><td><input type="email" name="email" required></td></tr>
                        <tr><td>Mobile Number:</td><td><input type="text" name="mobileNumber" required></td></tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Register"></td>
                        </tr>
                    </table>
                </form>
            </td>
        </tr>
        <tr>
            <td>
                <form action="${pageContext.request.contextPath}/login" method="get">
                    <input type="submit" value="Login" />
                </form>
            </td>
        </tr>
    </table>
</body>
</html>
