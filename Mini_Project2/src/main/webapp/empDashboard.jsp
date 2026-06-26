<%@page import="leave.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Dashboard</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f0f0f0;
    padding:40px;
}

h2{
    color:#2c3e50;
    margin-bottom:10px;
}

h4{
    color:#666;
    margin-bottom:25px;
}

a{
    display:inline-block;
    padding:10px 18px;
    margin-right:10px;
    background:#2980b9;
    color:white;
    text-decoration:none;
    border-radius:4px;
}

a:hover{
    background:#1f6fa0;
}
</style>

</head></head>
<body>
<%
Employee emp=(Employee)session.getAttribute("loggedEmp");
if(emp==null)
{
    response.sendRedirect("index.jsp");
    return;
}
%>
<h2>Welcome :<%= emp.getName() %></h2>
<h4>Department :<%= emp.getDept() %></h4>
<br>
<a href="applyLeave.jsp">Apply Leave</a>
<a href="myLeaves.jsp">My Leave Status</a>
<a href="logout.jsp">Logout</a>
</body>
</html>