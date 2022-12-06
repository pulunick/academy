<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div.wrap {
		width: 900px;
		display: flex;
		flex-flow: wrap;
		margin: 20px auto;
	}
	div.item {
		width: 200px;
		display: flex;
		flex-flow: column;
		margin: 10px;
		padding: 10px;
		border: 1px solid #dadada;
		cursor: pointer;
		text-align: center;
	}
	div.item:hover {
		background-color: #f5f6f7;
	}
</style>
</head>
<body>
<h1>상품목록</h1>
<hr>

<jsp:useBean id="mu" class="product.ProductDAO"/>
<div class="wrap">

<c:forEach var="sin" items="${mu.select() }">
	<div class="item">
		<div class="img">
			<a href="ex05-detail.jsp?idx=${sin.idx }" title=${sin.name }>
				<img src="img/${sin.imgPath }" width="100">
			</a>
		</div>
		<div class="name"><h3>${sin.name }</h3></div>
		<div class="price"><h3>${sin.price }원</h3></div>
	</div>

</c:forEach>
</div>

</body>
</html>