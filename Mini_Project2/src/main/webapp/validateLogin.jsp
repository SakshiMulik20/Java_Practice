<%@page import="leave.pojo.Employee"%>
<%@page import="leave.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String email=request.getParameter("email");
String pwd=request.getParameter("pwd");

EmployeeDAO empDao=new EmployeeDAO();
Employee emp=empDao.login(email, pwd);

if(emp!=null)
{
    session.setAttribute("loggedEmp", emp);

    if(emp.getRole().equals("ADMIN"))
    {
        RequestDispatcher rd=request.getRequestDispatcher("adminDashboard.jsp");
        rd.forward(request, response);
    }
    else
    {
        RequestDispatcher rd=request.getRequestDispatcher("empDashboard.jsp");
        rd.forward(request, response);
    }
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Failed</title>

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

.message-box{
    background:white;
    width:400px;
    padding:35px;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
    text-align:center;
}

h2{
    color:#2c3e50;
    margin-bottom:15px;
}

.error{
    color:#e74c3c;
    font-weight:bold;
    margin-bottom:20px;
}

a{
    display:inline-block;
    padding:10px 20px;
    background:#2980b9;
    color:white;
    text-decoration:none;
    border-radius:4px;
}

a:hover{
    background:#1f6fa0;
}
</style>

</head>
<body>

<div class="message-box">
    <h2>Login Failed</h2>
    <p class="error">Invalid Email or Password</p>
    <a href="index.jsp">Try Again</a>
</div>

</body>
</html>