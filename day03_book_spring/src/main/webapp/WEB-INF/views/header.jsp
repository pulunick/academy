<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
  padding:1.5em;
  background: #f5f5f5
}

table {
  border: 1px #a39485 solid;
  font-size: .9em;
  box-shadow: 0 2px 5px rgba(0,0,0,.25);
  width: 100%;
  border-collapse: collapse;
  border-radius: 5px;
  overflow: hidden;
}

th {
  text-align: left;
}
  
thead {
  font-weight: bold;
  color: #fff;
  background: #73685d;
}
  
 td, th {
  padding: 1em .5em;
  vertical-align: middle;
}
  
 td {
  border-bottom: 1px solid rgba(0,0,0,.1);
  background: #fff;
}

a {
  color: #73685d;
}
tr:hover td{
	background-color: #73685d;
	cursor: pointer;
	color: white;
	font-weight: bold;
}
  
 @media all and (max-width: 768px) {
    
  table, thead, tbody, th, td, tr {
    display: block;
  }
  
  th {
    text-align: right;
  }
  
  table {
    position: relative; 
    padding-bottom: 0;
    border: none;
    box-shadow: 0 0 10px rgba(0,0,0,.2);
  }
  
  thead {
    float: left;
    white-space: nowrap;
  }
  
  tbody {
    overflow-x: auto;
    overflow-y: hidden;
    position: relative;
    white-space: nowrap;
  }
  
  tr {
    display: inline-block;
    vertical-align: top;
  }
  tr:hover {
  	background-color: #73685d;
  }
  
  th {
    border-bottom: 1px solid #a39485;
  }
  
  td {
    border-bottom: 1px solid #e5e5e5;
  }
  
  
  }
</style>
</head>
<body>

<h1><a href="${cpath }/">day03 - book</a></h1>
<nav>
	<ul>
		<li><a href="${cpath }/list">목록(검색 포함, 제목으로 검색, 단일 보기(detail))</a>
		<li><a href="${cpath }/insert">추가</a>
	</ul>
</nav>

<%--
		기능			주소			메서드			함수						응답
		============================================================================================
		목록			/list		GET				list()					"list"
					목록에서는 이름과 가격 출판사만 표기합니다.
		검색			/list		POST			serach(String search)	"list"
		
		추가			/insert		GET				add()					"add"
					/insert		POST			add(BookDTO dto)		"redirect:/list"
		단일보기
		수정
		삭제

 --%>
