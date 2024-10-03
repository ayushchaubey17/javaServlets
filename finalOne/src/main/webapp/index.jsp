

<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to My Web Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 {
            color: #333;
        }
        form {
            margin: 20px 0;
        }
        input[type="text"], input[type="submit"] {
            padding: 10px;
            margin: 5px;
            width: 200px;
        }
    </style>
</head>
<body>
    <h1>Welcome to My Web Application</h1>

    <form action="login" method="post">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Password:</label><br>
        <input type="text" id="password" name="password" required><br>
        <input type="submit" value="Login">
    </form>

    <p>Or you can <a href="login">click here</a> to access the login page directly.</p>
</body>
</html>
