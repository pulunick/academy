<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>맛집 header</title>

<style type="text/css">
	a {
		text-decoration: none;
		color: inherit;
	}
	a:hover {
		text-decoration: underline;
	}
	nav > ul {
		padding: 0;
		list-style: none;
		margin: 20px auto;
		width: 500px;
		display: flex;
		justify-content: space-around;
		font-weight: bold;
		font-size: 20px;
	}
	talbe {
		margin: auto;
		border: 2px solid black;
		border-collapse: collapse;
	}
	td, th {
		padding: 10px 20px;
		border: 1px solid grey;
	}
	thead th {
		background-color: #eee;
	}

</style>
</head>
<body>
<header>
	<h1><a href="${cpath }">진형 맛집</a></h1>
	<nav>
		<ul>
			<li><a href="${cpath }/list.jsp">목록</a></li>
			<li><a href="${cpath }/add.jsp">추가</a></li>
			<li><a href="${cpath }/modify.jsp">수정</a></li>
			<li><a href="${cpath }/delete.jsp">삭제</a></li>
		</ul>
	</nav>
</header>
