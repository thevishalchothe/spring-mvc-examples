<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Success</title>
</head>
<body>
    <table border="0" width="100%">
        <tr>
            <td><h1>Welcome to User Credential MVC</h1></td>
        </tr>
        <tr>
            <td><h2>Welcome, ${sessionScope.username}!</h2></td>
        </tr>
        <tr>
            <td><p>You have successfully logged in.</p></td>
        </tr>
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/">Go to your Dashboard</a>
            </td>
        </tr>
    </table>
</body>
</html>
