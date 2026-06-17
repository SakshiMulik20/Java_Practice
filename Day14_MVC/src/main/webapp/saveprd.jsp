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
<% int i = prdDao.addNewPrd(prdObj);

if(i>0){
	out.println("inserted");
	}
%>
</body>
</html>