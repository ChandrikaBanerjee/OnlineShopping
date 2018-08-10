<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div style="align: center;">
		<h1>Cart List</h1>

		<jsp:include page="headercart.jsp"></jsp:include>
		<!--  	<div><h4>CART (${sessionScope.no })</h4>
		</div> -->

		<table>
			<tr>
				<th>BOOK ID</th>
				<th>BOOK NAME</th>
				<th>BOOK PRICE</th>
				<th>BOOK SUMMARY</th>
				<th>NO. OF ITEMS</th>
			</tr>
	<--		<jstl:forEach var="books" items="${sessionScope.booksAll}">
				<tr>
					<td>${books.bookcart.bookID}</td>
					<td>${books.bookcart.bookName}</td>
					<td>${books.bookcart.bookPrice}</td>
					<td>${books.bookcart.summary}</td>
					<td>${books.number}</td>
					<td><a href="removecart.app?bookID=${books.bookcart.bookID}">REMOVE
							FROM CART</a></td>

				</tr>
			</jstl:forEach>  -->

		<!-- 	<jstl:forEach var="rbooks" items="${sessionScope.rbooks}">
				<tr>
					<td>${rbooks.bookcart.bookID}</td>
					<td>${rbooks.bookcart.bookName}</td>
					<td>${rbooks.bookcart.bookPrice}</td>
					<td>${rbooks.bookcart.summary}</td>
					<td>${rbooks.number}</td>
					<td><a href="removecart.app?bookID=${rbooks.bookcart.bookID}">REMOVE
							FROM CART</a></td>

				</tr>
			</jstl:forEach> -->
		</table>
		<br>
		<br>
		Total Price: ${sessionScope.price}
		<br>
		
		<a href="viewall.app">HOME </a><br />

	</div>

</body>
</html>