<%@page import="leave.pojo.Employee"%>
<%@page import="leave.pojo.LeaveRequest"%>
<%@page import="leave.dao.LeaveDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>Apply Leave</title>
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
Employee emp=(Employee)session.getAttribute("loggedEmp");
if(emp==null)
{
    response.sendRedirect("index.jsp");
    return;
}

String leavetype=request.getParameter("txtleavetype");
String fromdate=request.getParameter("txtfromdate");
String todate=request.getParameter("txttodate");
String reason=request.getParameter("txtreason");

LeaveDAO leaveDao=new LeaveDAO();
LeaveRequest lr=new LeaveRequest(0,emp.getEmpid(),null,leavetype,fromdate,todate,reason,"PENDING");
int i=leaveDao.applyLeave(lr);

if(i>0)
{
    out.print("Leave Applied Successfully!");
}
else
{
    out.print("Something went wrong");
}
%>
<br>
<a href="empDashboard.jsp">Back to Dashboard</a>
</body>
</html>