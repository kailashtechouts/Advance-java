<%@page import="com.website1.java.ProductDetails"%>
<%@page import="com.website1.java.ProductDao"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.main {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	text-align: center;
}

.child {
	border-style: ridge;
	display: inline;
}

.child img {
	width: 250px;
	height: 300px;
}

.child button {
	font-weight: 700;
}
</style>
<meta charset="ISO-8859-1">
<title>DEscription</title>
</head>
<body style ="background-color:powderblue">
	<%
	String name = request.getParameter("name");
	List<ProductDetails> list = ProductDao.getProductDetails(name);
	request.setAttribute("mylist", list);
	%>
	<div class="main">
		<c:forEach items="${mylist}" var="db">
			<div class="child">
				<img alt="image" src="${db.getProductImageUrl()}"><br>
				<p>${db.getProductName()}</p>
				<p>${db.getProductDesc()}</p>
				<p>${db.getProductPrice()}</p>

				<button>Buy now</button>
				<button>
					<a href="Addtocart.jsp?name=${db.getProductName()}">Add to cart</a>
				</button>
			</div>
		</c:forEach>
	</div>

</body>
</html>