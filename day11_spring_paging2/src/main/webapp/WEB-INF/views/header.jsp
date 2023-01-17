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
		padding: 10px;
		margin: 10px;
	}
	

body{
	font-size : 15px;
	font-family: 'Jua', sans-serif;
}
strong, span{
	color : red;
}
#jointalbe{
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
	display: flex;
	justify-content: right;
}
.mypage {
	width: 100px;
	text-align: center;
}
.mypage:hover {
	text-decoration: underline;
	background-color: #edd600;
	color: white;
	cursor: pointer;
	
}
.aaaa {
	display : block;
	width: 100%;
}

/*       	.write-board-middle { */
/*         	display: flex; */
/*         	justify-content: center; */
/*         	width: 880px; */
/*         } */
		

		#board-list {
			width : 800px;
			height : 300px;
			text-align: center;	
			margin: auto;
		}
		.board-list-heads {
	        padding: 14px 21px;
            background: #ececec;
            color: #666;
            height: 40px;
            font-size: 20px;
            border-top: 2px solid #333;
            border-bottom: 2px solid #ddd;
            text-align: center;
		}

		.board-list-content:hover {
			text-decoration: underline;
			background-color: #edd600;
			color: white;
			cursor: pointer;
		}
        .subject {
            width: 45%;
            text-align: center;
        }

        .paging {
            padding: 20px 0;
            display: flex;
            text-align: center;
            justify-content: center;
            align-items: center;
        }

        .paging>ul {
            display: flex;
            justify-content: center;
        }

        .paging>ul>li {
            padding: 8px;
            background: #efefef;
            border: 1px solid #999;
            font-size: 12px;
            margin-left: 10px;
        }

        .paging>ul>li:hover {
            cursor: pointer;
            background: #333;
            color: #fff;
        }

        .active {
            background: #333 !important;
            color: #fff;
        }
        .write-board-all {
        	text-align: center;
        	margin: auto;
        }
  
</style>
</head>
<body>

<h1><a href="${cpath }/">게시판만들기</a></h1>
<hr>
<div id="member">
	<c:if test="${not empty member }">
		<h3>${member.username }님 환영합니다.</h3>
	<!-- ip session에 저장 -->
		<h3>${ip }</h3>
		<h4 class="mypage" onclick="location.href='${cpath}/mypage/${member.idx }'">마이페이지</h4>
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
	<li><a href="${cpath }/board2?page=1">게시판</a></li>
	<li><a href="${cpath }/ex01">테스트</a></li>
</ul>

