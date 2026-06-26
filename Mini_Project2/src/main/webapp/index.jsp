<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Leave Management System</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f0f0f0;
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    text-align:center;
}

h1{
    color:#2c3e50;
    font-size:52px;
    margin-bottom:15px;
}

p{
    color:#666;
    font-size:18px;
    margin-bottom:35px;
}

.links a{
    display:inline-block;
    padding:12px 25px;
    margin:0 10px;
    background:#2980b9;
    color:white;
    text-decoration:none;
    border-radius:4px;
    font-size:16px;
}

.links a:hover{
    background:#1f6fa0;
}
</style>

</head>
<body>

<div class="container">

    <h1>Employee Leave Management System</h1>

    <p>
        Manage employee leave requests easily and efficiently
    </p>

    <div class="links">
        <a href="login.jsp">Login</a>
        <a href="register.jsp">Register</a>
    </div>

</div>

</body>
</html>