<%@page import="leave.dao.LeaveDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Action</title>
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

.container{
    background:white;
    width:400px;
    padding:35px;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
    text-align:center;
}

a{
    display:inline-block;
    margin-top:20px;
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

<div class="container">
<%
int lid=Integer.parseInt(request.getParameter("lid"));
String action=request.getParameter("action");

LeaveDAO leaveDao=new LeaveDAO();
int i=leaveDao.updateStatus(lid, action);

if(i>0)
{
    out.print("Status Updated :"+action);
}
else
{
    out.print("Update Failed");
}
%>
<br>
<a href="adminDashboard.jsp">Back to Dashboard</a>

</div>		
</body>
</html>