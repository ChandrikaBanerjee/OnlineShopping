<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:include page="headercart.jsp"></jsp:include>
<!-- 	<a href="cart.jsp">CART(${sessionScope.no })</a>
		<div><h4>CART (${sessionScope.no })</h4>
		</div>-->
	<div style="align: center;">
		<h1>Product List</h1>
		
			<table>
				<tr>
					<th>BOOK ID </th>
					<th>BOOK NAME</th>
					<th>BOOK PRICE</th>
					<th>BOOK SUMMARY</th>
				</tr>
				<jstl:forEach var="books" items="${sessionScope.books}">
					<tr>
						<td>${books.bookID}</td>
						<td>${books.bookName}</td>
						<td>${books.bookPrice}</td>
						<td>${books.summary}</td>
						<td><a href="addtocart.app?bookID=${books.bookID}">ADD TO CART</a></td>
					
					</tr>
				</jstl:forEach>
			</table>

	
	</div>

</body>
</html>