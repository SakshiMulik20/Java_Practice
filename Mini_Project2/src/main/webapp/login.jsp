<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Leave Management</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f0f0f0;
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.login-box{
    background:white;
    width:400px;
    padding:35px;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

.login-box h2{
    text-align:center;
    color:#2c3e50;
    margin-bottom:10px;
}

.login-box p{
    text-align:center;
    color:#777;
    margin-bottom:25px;
    font-size:14px;
}

table{
    width:100%;
}

td{
    padding:6px 0;
}

input[type="text"],
input[type="password"]{
    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:4px;
    font-size:14px;
}

input[type="text"]:focus,
input[type="password"]:focus{
    outline:none;
    border-color:#2980b9;
}

input[type="submit"]{
    width:100%;
    padding:11px;
    border:none;
    border-radius:4px;
    background:#2980b9;
    color:white;
    font-size:15px;
    cursor:pointer;
    margin-top:10px;
}

input[type="submit"]:hover{
    background:#1f6fa0;
}

.register-link{
    text-align:center;
    margin-top:18px;
}

.register-link a{
    color:#2980b9;
    text-decoration:none;
}

.register-link a:hover{
    text-decoration:underline;
}
</style>

</head>

<body>

<div class="login-box">

    <h2>Employee Leave Management</h2>
    <p>Login to manage leave requests</p>

    <form action="validateLogin.jsp" method="post">

        <table>
            <tr>
                <td>Email</td>
            </tr>
            <tr>
                <td>
                    <input type="text" name="email" placeholder="Enter Email" required>
                </td>
            </tr>

            <tr>
                <td>Password</td>
            </tr>
            <tr>
                <td>
                    <input type="password" name="pwd" placeholder="Enter Password" required>
                </td>
            </tr>

            <tr>
                <td>
                    <input type="submit" value="Login">
                </td>
            </tr>
        </table>

    </form>

    <div class="register-link">
        <a href="register.jsp">New User? Register Here</a>
    </div>

</div>

</body>
</html>