<%@page import="leave.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Apply Leave</title>

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

.form-box{
    background:white;
    width:500px;
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
    padding:10px 5px;
}

select,
input[type="date"],
textarea{
    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:4px;
}

textarea{
    height:80px;
    resize:none;
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

.back-link{
    text-align:center;
    margin-top:15px;
}

.back-link a{
    color:#2980b9;
    text-decoration:none;
}

.back-link a:hover{
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
%>

<div class="form-box">

    <h2>Apply Leave</h2>

    <form action="processLeave.jsp" method="post">

        <table>

            <tr>
                <td>Leave Type</td>
                <td>
                    <select name="txtleavetype">
                        <option>Sick Leave</option>
                        <option>Casual Leave</option>
                        <option>Earned Leave</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>From Date</td>
                <td>
                    <input type="date" name="txtfromdate" required>
                </td>
            </tr>

            <tr>
                <td>To Date</td>
                <td>
                    <input type="date" name="txttodate" required>
                </td>
            </tr>

            <tr>
                <td>Reason</td>
                <td>
                    <textarea name="txtreason" required></textarea>
                </td>
            </tr>

            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Apply">
                </td>
            </tr>

        </table>

    </form>

    <div class="back-link">
        <a href="empDashboard.jsp">Back to Dashboard</a>
    </div>

</div>

</body>
</html>