<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
session.invalidate();
response.setHeader("Refresh", "2;URL=index.jsp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logging Out</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    background:#f0f0f0;
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.message-box{
    background:white;
    padding:35px;
    width:350px;
    text-align:center;
    border-radius:10px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

h2{
    color:#2c3e50;
    margin-bottom:10px;
}

p{
    color:#666;
}
</style>

</head>
<body>

<div class="message-box">
    <h2>Logged Out</h2>
    <p>Redirecting to login page...</p>
</div>

</body>
</html>