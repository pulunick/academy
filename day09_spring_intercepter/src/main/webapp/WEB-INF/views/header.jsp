<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<style>
	a {
		text-decoration: none;
		color: inherit;
	}
	a:hover {
		text-decoration: underline;
		background-color: #edd600;
		color: white;
	}
	ul {
		margin: 0;
		padding: 0;
		display: flex;
		list-style: none;
		width: 900px;
	}
	ul > li {
		padding: 10px 20px;
	}
	
	.list{
	text-align: center;
}

.wrap {
    display: flex;
    text-align: center;
    flex-flow: wrap;
    margin: auto;
    width: 880px;
    justify-content: center;
}

.wrap > .item {
    display: inline-block;
    width: 220px;
    height: 260px;
	border: 1px solid;
    margin-bottom: 5px;
    font-size: 20px;
 	margin-right: 30px;
 	text-align: center;
}
.wrap > .item:hover {
	background-color: #efefef;
	cursor: pointer;
}

body{
	font-size : 15px;
	font-family: 'Jua', sans-serif;
}
strong, span{
	color : red;
}
table{
	width : 500px;
	height : 300px;
}
table,tr,th{
	border : 1px solid black;
	border-collapse : collapse;
}
caption{
	text-align : right;
}		
div{
	padding : 10px;
}
th{
	padding : 10px;
	text-align : right;
}
.btn{
	float : right;
}
.btn:hover {
	cursor: pointer;
}
.join {
	display: flex;
	justify-content: center;
	width: 880px;
	margin: auto;
	border: 1px solid black;
}
#member {
	height: 70px;
	text-align: right;
}
</style>
</head>
<body>

<h1><a href="${cpath }/">day09</a></h1>
<hr>
<div id="member">
	<c:if test="${not empty member }">
		<h3>${member.userid }</h3>
		<c:set var="loginURL" value="logout"/>
		<c:set var="loginMenu" value="로그아웃"/>
	</c:if>
	<c:if test="${empty member }">
		<c:set var="loginURL" value="login"/>
		<c:set var="loginMenu" value="로그인"/>
	</c:if>
</div>


<ul>
	<li><a href="${cpath }/join">회원가입</a></li>
	<li><a href="${cpath }/${loginURL}">${loginMenu }</a></li>
	<li><a href="${cpath }/board">게시판</a></li>
</ul>

