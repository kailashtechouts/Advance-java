<%@page import="com.website.java.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="u" class="com.website.java.UserDetails"></jsp:useBean>
<jsp:setProperty name="u" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>L</title>
</head>
<body>
	<%
	boolean value = UserDao.check(u);
	if (value) {
		response.sendRedirect("main.html");
	} else {
		response.sendRedirect("UserLoginError.jsp");
	}
	%>

</body>
</html>