<%@page import="com.website1.java.ProductDetails"%>
<%@page import="com.website1.java.ProductDao"%>
<jsp:useBean id="u" class="com.website1.java.ProductDetails"></jsp:useBean>
<jsp:setProperty   name="u" property="*" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 	
	int status=ProductDao.insertProduct(u);  
	if(status>0){  
 		System.out.println("added......");	 
 	}
 else{  
		out.println("Unable to save information");  
 		response.sendRedirect("Emain.html");

	}  
	%>
</body>
</html>