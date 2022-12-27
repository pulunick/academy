<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<p><input 	type="number" 
				name="user" 
				placeholder="1 ~ 100" 
				min="1" max="100"
				required autofocus></p>
	<p><input type="submit"></p>
</form>

	<h3>당신의 답은 : ${param.user }이며, ${status } 해야 합니다.</h3>
	<h3>답은 : ${answer }</h3>
	
</body>
</html>