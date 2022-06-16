<%@page import="com.website2.java.CartDao"%>
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
	 String name = request.getParameter("name");
	 if(CartDao.OrderDetails(name) > 0) {
		 response.sendRedirect("OrderSuccess.jsp");
	 }
	 %>
</body>
</html>