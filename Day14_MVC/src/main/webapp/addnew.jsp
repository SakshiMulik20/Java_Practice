<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="prdObj" class="com.shopping.model.Product">
    <jsp:setProperty name ="prdObj" property="*"></jsp:setProperty>
    </jsp:useBean>
    <jsp:useBean id="prdDao" class="com.shopping.dal.ProductDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><form action ='saveprd.jsp' method = 'post'>
Name: <input type="text" name="pname"><br>
	Price: <input type="text" name="price"><br>
	Quantity: <input type="text" name="quantity"><br>
	<input type="submit" value="Add">
</div></form>
</body>
</html>