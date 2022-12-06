<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05-detail.jsp</title>
</head>
<body>

<h1>${param.idx }번 상품 상세보기</h1>
<jsp:useBean id="mu" class="product.ProductDAO"/>
<c:set var="sin" value="${mu.selectOne(param.idx) }" />

<div class="item">
		<div class="img">
				<img src="img/${sin.imgPath }" width="500">
		</div>
		<div class="name"><h3>${sin.name }</h3></div>
		<div class="price"><h3>${sin.price }원</h3></div>
	</div>
<a href="ex05.jsp"><button>목록으로</button></a>
</body>
</html>