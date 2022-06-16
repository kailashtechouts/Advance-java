<%@page import="com.website.java.UserDetails"%>
<%@page import="com.website.java.UserDao"%>
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
	String name=request.getParameter("name");  
	String email_id= request.getParameter("email_id");
	String password=request.getParameter("password"); 
	
	UserDetails u=new UserDetails(); 	
	u.setName(name);  
	u.setEmail_id(email_id);
	u.setPassword(password);  
	

	int status=UserDao.insertUser(u);  
	if(status>0){  
		
 		request.getRequestDispatcher("login.html").include(request, response); 
 }
 else{  
		out.println("Unable to save information");  
 		response.sendRedirect("Emain.html");

	}  
	out.close();    
	%>
</body>
</html>