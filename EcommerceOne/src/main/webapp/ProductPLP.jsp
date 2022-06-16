<%@page import="com.website1.java.ProductDetails"%>
<%@page import="com.website1.java.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<title>List page</title>
</head>
<body style ="background-color: floralwhite" >
	<%
	String ctg = request.getParameter("ctg");
	List<ProductDetails> list = ProductDao.getProduct(ctg);
	request.setAttribute("list", list);
	%>
	<div class="main">
		<c:forEach items="${list}" var="data">
			<div class="child">
				<a href="ProductPDP.jsp?name=${data.getProductName()}"><img
					alt="image" src="${data.getProductImageUrl()}"></a>
				<p>price: ${data.getProductPrice()}</p>
				
					<button>Buy now</button>
					<button>Add to cart</button>
			
			</div>
		</c:forEach>
	</div>
</body>
</html>