<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2.jsp</title>
<style type="text/css">
	table {
		border: 2px solid black;
		border-collapse: collapse;
	}
	thead th {
		background-color: #dadada;
	}
	td, th {
		padding: 10px 20px;
		border: 1px solid greay;
	}
</style>
</head>
<body>

<h1>상품목록(표형태)</h1>
<hr>

<form>
	<p>
		<input 	type="search" name="keyword" 
				placeholder="검색" autocomplete="off" 
				autofocus>
		<input type="submit" value="검색">
	</p>
</form>

<jsp:useBean id="mu" class="product.ProductDAO"/>
<table>
	<thead>
		<tr>
			<th>IDX</th>
			<th>NAME</th>
			<th>PRICE</th>
			<th>IMGPATH</th>
		</tr>
	</thead>
	<c:forEach var="sin" items="${empty param.keyword ? 
										mu.select() : 
										mu.selectListByName(param.keyword) }">
	<tbody>
		<tr>
			<td>${sin.idx }</td>
			<td>${sin.name }</td>
			<td>${sin.price }</td>
			<td>${sin.imgPath }</td>
		</tr>
	</tbody>
	</c:forEach>
</table>
</body>
</html>