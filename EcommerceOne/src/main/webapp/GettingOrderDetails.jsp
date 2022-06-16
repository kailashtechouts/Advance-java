<%@page import="com.website1.java.ProductDetails"%>
<%@page import="com.website2.java.CartDao"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
	  <%
    	List<ProductDetails> list = CartDao.getOrderDetails();
		request.setAttribute("list", list);
	%>
	<table id="customers">
  	<tr>
    	<th></th>
    	<th>Price</th>
    	<th>Product Name</th>
    	<th></th>
  	</tr>
  	<c:forEach items="${list}" var="information">
  	<tr>
    	<td><img alt="image" src="${information.getProductImageUrl()}" style="width:150px;height:150px"></td>
    	<td>${information.getProductPrice()}</td>
    	<td>${information.getProductName()}</td>
    	<td><button>Remove</button></td>
  	</tr>
  </c:forEach>	
  </table>
</body>
</html>