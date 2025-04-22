<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration</h2>

    <form action="register" method="post">
        <table>
            <tr>
                <td>Full Name:</td>
                <td><input type="text" name="uname" required></td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" required></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" required></td>
            </tr>
            <tr>
                <td>Mobile Number:</td>
                <td><input type="text" name="mobileNumber" required></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Register">
                </td>
            </tr>
        </table>
    </form>

    <br>
    <a href="login">Already have an account? Login</a>
</body>
</html>
