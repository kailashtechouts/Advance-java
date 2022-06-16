 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp </title>
</head>
<body>
	 <%  
	 String name=request.getParameter("uname");  
	 out.print("Welcome "+name);    
	 %>  <br>
	 Current Time: <%= java.util.Calendar.getInstance().getTime() %><br>
	 <%! int data=50; %>  
     <%= "Value of the variable is:"+data %>  <br>
     <%!   
	    int cube(int n){  
	    return n*n*n;  
		}  
		%>  <br>
	   <%= "Cube of 3 is:"+cube(3) %>  <br>
</body>
</html>