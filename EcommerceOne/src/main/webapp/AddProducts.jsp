<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = background-color:white;>
<div
style="text-align :center;
  border-style: solid;
  border-width: medium;
  margin-left:500px;
  margin-right:500px;
  margin-top:250px;
  padding:50px;
  background-color:floralwhite;"
>	
   <form action = "ProductSaveInformation.jsp">
	 	Product Name: <input type="text" name = "productName"><br><br>
 Product Description:<input type="text" name = "productDesc"><br><br>
	   Product Price:<input type="text" name = "productPrice"><br><br>
	 	   Image URL:<input type="text" name="productImageUrl"><br><br>
	 	    Category:<input type="radio" value="male" name="productCtg">male
	 				<input type="radio" value="female" name="productCtg">female
	 				<input type="radio" value="kids" name="productCtg">kids<br>
	 	<br><input type="submit" value ="Add Product">
	 </form>
	 </div> 
</body>
</html>