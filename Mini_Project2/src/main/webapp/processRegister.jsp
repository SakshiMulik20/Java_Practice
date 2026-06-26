<%@page import="leave.pojo.Employee"%>
<%@page import="leave.dao.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Register</title>
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

a{
    display:inline-block;
    margin-top:15px;
    padding:10px 18px;
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
<%
String name=request.getParameter("txtname");
String email=request.getParameter("txtemail");
String pwd=request.getParameter("txtpwd");
String dept=request.getParameter("txtdept");

EmployeeDAO empDao=new EmployeeDAO();
Employee emp=new Employee(0,name,email,pwd,dept,"EMPLOYEE");
int i=empDao.registerEmp(emp);

if(i>0)
{
    out.print("Registered Successfully!");
    out.print("<br><a href='index.jsp'>Go to Login</a>");
}
else
{
    out.print("Registration Failed");
    out.print("<br><a href='register.jsp'>Try Again</a>");
}
%>
</body>
</html>