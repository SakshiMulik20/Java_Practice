<%@page import="leave.pojo.Employee"%>
<%@page import="leave.pojo.LeaveRequest"%>
<%@page import="leave.dao.LeaveDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Leaves</title>

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

.container{
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

h2{
    color:#2c3e50;
    margin-bottom:20px;
}

table{
    width:100%;
    border-collapse:collapse;
}

th{
    background:#2980b9;
    color:white;
    padding:12px;
    text-align:left;
}

td{
    padding:12px;
    border-bottom:1px solid #ddd;
}

tr:hover{
    background:#f7fbff;
}

a{
    display:inline-block;
    margin-top:20px;
    color:#2980b9;
    text-decoration:none;
}

a:hover{
    text-decoration:underline;
}
</style>

</head>
<body>

<%
Employee emp=(Employee)session.getAttribute("loggedEmp");
if(emp==null)
{
    response.sendRedirect("index.jsp");
    return;
}

LeaveDAO leaveDao=new LeaveDAO();
ArrayList<LeaveRequest> myLeaves=leaveDao.getLeavesByEmp(emp.getEmpid());
%>

<div class="container">

<h2>My Leave Requests</h2>

<table>
<tr>
<th>Leave ID</th>
<th>Leave Type</th>
<th>From Date</th>
<th>To Date</th>
<th>Reason</th>
<th>Status</th>
</tr>

<%
for(LeaveRequest lr:myLeaves)
{
%>
<tr>
<td><%= lr.getLid() %></td>
<td><%= lr.getLeavetype() %></td>
<td><%= lr.getFromdate() %></td>
<td><%= lr.getTodate() %></td>
<td><%= lr.getReason() %></td>
<td><%= lr.getStatus() %></td>
</tr>
<%
}
%>

</table>

<a href="empDashboard.jsp">← Back to Dashboard</a>

</div>

</body>
</html>