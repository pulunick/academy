<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="home.jsp" %>


<form method="POST">
	<p><input type="hidden" name="name" value="${param.name }"></p>
	<p><input type="number" name="kor" placeholder="국어성적"></p>
	<p><input type="number" name="eng" placeholder="영어성적"></p>
	<p><input type="number" name="mat" placeholder="수학성적"></p>
	<p><input type="submit"></p>
</form>
</body>
</html>