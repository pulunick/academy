<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h1>추가</h1>

<form method="POST" action="add-action.jsp">
	<fieldset>
		<legend>회원정보</legend>
			<p><input type="text" name="userid" placeholder="ID"></p>
			<p><input type="text" name="userpw" placeholder="PW"></p>
			<p><input type="text" name="username" placeholder="NAME"></p>
	</fieldset>
	<fieldset>
		<legend>성별</legend>
			<label><input type="radio" name="gender" value="남성">남성</label>
			<label><input type="radio" name="gender" value="여성">여성</label>
	</fieldset>
	<p><input type="submit"></p>
</form>

</body>
</html>