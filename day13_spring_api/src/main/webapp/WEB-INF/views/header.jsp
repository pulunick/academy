<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="${cpath }/resources/css/style.css">
<title>home.jsp</title>
<style type="text/css">
	body{
	   font-family: 'Jua', sans-serif;
	   transform : rotate(0.04deg); 
	 }
	 .item {
	 	border : 1px solid black;
	 	padding: 10px;
	 	margin: 10px 0;
	 	position: relative;
	 }
	 .LAT, .LNG, .MAIN_IMG_THUMB, .PLACE, .UC_SEQ {
	 	display: none;
	 }
	 .item > .MAIN_IMG_NORMAL {
	 	position: absolute;
	 	top: 10px;
	 	right: 10px;
	 	
	 	background-position: center center;
	 	background-size: auto 100%;
	 	width: 200px;
	 	height: 200px;
	 }
	 
	 
	 .item > .TRFC_INFO {
	 	width: 70%;
	 }
	 
	 .item_festival {
	 	border : 1px solid black;
	 	padding: 10px;
	 	margin: 10px 0;
	 	position: relative;
	 }
	 
	 #root2 > .item_festival > div:not(.ITEMCNTNTS) {
	 	text-align: center;

	 } 
	 .item_festival > .MAIN_IMG_NORMAL {
 	 	position: absolute;
	 	top: 10px;
	 	right: 600px;
	 	opacity: 0.3;
	 	z-index: -1;
	 	
	 	background-position: center center;
	 	background-size: auto 100%;
	 
	 	width: 300px;
	 	height: 250px;
	 }
	 .item_festival > .ITEMCNTNTS {
	 	margin-top: 100px;
	 	padding : 20px, 30px;
	 	border: 1px solid black;
	 	text-align: center;
	 }
	 .item_festival > .MAIN_TITLE {
	 	font-size: 30px;
	 	margin-bottom: 10px;
	 }
	 
</style>
</head>
<body>

<h1><a href="${cpath }/">홈으로</a></h1>
<hr>



