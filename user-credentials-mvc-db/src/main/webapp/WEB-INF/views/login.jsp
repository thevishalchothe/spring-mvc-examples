<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
    <table border="0" width="100%">
        <tr>
            <td><h1>Welcome to User Credential MVC</h1></td>
        </tr>
        <tr>
            <td><h2>Login</h2></td>
        </tr>
        <tr>
            <td>
                <form action="${pageContext.request.contextPath}/login" method="post">
                    <table border="0">
                        <tr><td>Username:</td><td><input type="text" name="username" required></td></tr>
                        <tr><td>Password:</td><td><input type="password" name="password" required></td></tr>
                        <tr><td colspan="2"><input type="submit" value="Login"></td></tr>
                    </table>
                </form>
            </td>
        </tr>
        <c:if test="${not empty message}">
            <tr><td colspan="2" style="color:red;">${message}</td></tr>
        </c:if>
        <tr>
            <td>
                <form action="${pageContext.request.contextPath}/register" method="get">
                    <input type="submit" value="Register" />
                </form>
            </td>
        </tr>
    </table>
</body>
</html>
