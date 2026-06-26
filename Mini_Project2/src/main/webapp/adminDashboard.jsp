<%@page import="leave.pojo.Employee"%>
<%@page import="leave.pojo.LeaveRequest"%>
<%@page import="leave.dao.LeaveDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Admin Dashboard</title>
<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f0f0f0;
    padding:30px;
}

h2{
    color:#2c3e50;
    margin-bottom:15px;
}

a{
    color:#2980b9;
    text-decoration:none;
    font-weight:bold;
}

a:hover{
    text-decoration:underline;
}

table{
    width:100%;
    border-collapse:collapse;
    margin-top:20px;
    background:white;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
    border-radius:8px;
    overflow:hidden;
}

th{
    background:#2c3e50;
    color:white;
    padding:12px;
    text-align:center;
}

td{
    padding:10px;
    text-align:center;
    border-bottom:1px solid #ddd;
}

tr:hover{
    background:#f8f9fa;
}
</style></head>
<body>
<%
Employee emp=(Employee)session.getAttribute("loggedEmp");
if(emp==null||!emp.getRole().equals("ADMIN"))
{
    response.sendRedirect("index.jsp");
    return;
}

LeaveDAO leaveDao=new LeaveDAO();
ArrayList<LeaveRequest> allLeaves=leaveDao.getAllLeaves();
%>
<h2>Admin Dashboard - All Leave Requests</h2>
<a href="logout.jsp">Logout</a>
<br><br>
<table border="1">
<tr>
<th>Leave ID</th>
<th>Employee</th>
<th>Leave Type</th>
<th>From Date</th>
<th>To Date</th>
<th>Reason</th>
<th>Status</th>
<th>Action</th>
</tr>
<%
for(LeaveRequest lr:allLeaves)
{
%>
<tr>
<td><%= lr.getLid() %></td>
<td><%= lr.getEmpName() %></td>
<td><%= lr.getLeavetype() %></td>
<td><%= lr.getFromdate() %></td>
<td><%= lr.getTodate() %></td>
<td><%= lr.getReason() %></td>
<td><%= lr.getStatus() %></td>
<td>
<%
if(lr.getStatus().equals("PENDING"))
{
%>
<a href="processAction.jsp?lid=<%= lr.getLid() %>&action=APPROVED">Approve</a>

<a href="processAction.jsp?lid=<%= lr.getLid() %>&action=REJECTED">Reject</a>
<%
}
else
{
    out.print(lr.getStatus());
}
%>
</td>
</tr>
<%
}
%>
</table>
</body>
</html>