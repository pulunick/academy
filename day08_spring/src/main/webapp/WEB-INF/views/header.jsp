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
<title>회원가입</title>
<style>
body{
	font-size : 12px;
	font-family : 함초롬바탕;
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
.userid_ok{
color:#008000;
display: none;
}

.userid_already{
color:#6A82FB; 
display: none;
}
			.wrap {
		display: flex;
		flex-flow: wrap;
		width: 1000px;
		margin: auto;
		background-color: #eee;
	}
	.wrap > .item {
		border: 2px solid grey;
		padding: 10px;
		margin: 10px;
		width: 200px;
		cursor: pointer;
		text-align: center;
	}
	.wrap > .item:hover {
		background-color: white;
	}
	
</style>
</head>
<body>


<h1><a href="${cpath }/">여기는 헤더</a></h1>
<hr>

<ul>
	<li><a href="${cpath }/ex01">ex01 - member5 회원가입 및 회원 목록</a></li>
</ul>
