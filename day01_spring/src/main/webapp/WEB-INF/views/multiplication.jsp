<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h3>${answer } * ${answer2 } 무엇 일까요?!</h3>
	
<form method="POST">
	<p><input 	type="number" 
				name="user" 
				placeholder="1 ~ 100" 
				min="1" max="100"
				required autofocus></p>
				
	<p><input type="submit"></p>
</form>

<h3>${status }</h3>


</body>
</html>