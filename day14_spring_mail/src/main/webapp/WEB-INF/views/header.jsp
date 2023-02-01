<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
	layout:decorator="board/layout/defaultLayout">
<head>
<meta charset="UTF-8">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<title>home.jsp</title>
<style>
	body{
	   font-family: 'Jua', sans-serif;
	   transform : rotate(0.04deg); 
	 }
	 .hidden {
	 	display: none;
	 }
	 #check {
	 	margin-top: 20px;
	 }
	 .next {
	 	margin-top: 20px;
	 }
</style>
</head>
<body>

<h1><a href="${cpath }/">메일 보내기</a></h1>
<hr>



