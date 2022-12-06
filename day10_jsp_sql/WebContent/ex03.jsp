<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
</head>
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
<body>

<h1>EL, JSTL을 적용한 코드</h1>
<hr>

<jsp:useBean id="dao" class="day10.Student1DAO" />
<table>
	<thead>
		<tr>
			<th>NAME</th>
			<th>KOR</th>
			<th>ENG</th>
			<th>MAT</th>
		</tr>
	</thead>
	<c:forEach  var="st" items="${dao.selectList() }">
		<tr>
			<td>${st.name }</td>
			<td>${st.kor }</td>
			<td>${st.eng }</td>
			<td>${st.mat }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>