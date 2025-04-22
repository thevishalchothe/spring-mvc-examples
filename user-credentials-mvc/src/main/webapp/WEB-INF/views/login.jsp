<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>User Login</h2>

    <form action="login" method="post">
        <table>
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" required></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Login">
                </td>
            </tr>
        </table>
    </form>

    <br>
    <a href="register">Don't have an account? Register</a>
</body>
</html>
