<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Employee</title>

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

.box{
    background:white;
    width:400px;
    padding:35px;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

h2{
    text-align:center;
    color:#2c3e50;
    margin-bottom:25px;
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
}

input[type="text"]:focus,
input[type="password"]:focus{
    outline:none;
    border-color:#2980b9;
}

input[type="submit"]{
    width:100%;
    padding:11px;
    background:#2980b9;
    color:white;
    border:none;
    border-radius:4px;
    cursor:pointer;
    font-size:15px;
}

input[type="submit"]:hover{
    background:#1f6fa0;
}

.login-link{
    text-align:center;
    margin-top:15px;
}

.login-link a{
    color:#2980b9;
    text-decoration:none;
}

.login-link a:hover{
    text-decoration:underline;
}
</style>

</head>
<body>

<div class="box">

    <h2>Register Employee</h2>

    <form action="processRegister.jsp" method="post">

        <table>
            <tr>
                <td>Name</td>
            </tr>
            <tr>
                <td><input type="text" name="txtname" required></td>
            </tr>

            <tr>
                <td>Email</td>
            </tr>
            <tr>
                <td><input type="text" name="txtemail" required></td>
            </tr>

            <tr>
                <td>Password</td>
            </tr>
            <tr>
                <td><input type="password" name="txtpwd" required></td>
            </tr>

            <tr>
                <td>Department</td>
            </tr>
            <tr>
                <td><input type="text" name="txtdept" required></td>
            </tr>

            <tr>
                <td>
                    <input type="submit" value="Register">
                </td>
            </tr>
        </table>

    </form>

    <div class="login-link">
        <a href="index.jsp">Already have an account? Login</a>
    </div>

</div>

</body>
</html>