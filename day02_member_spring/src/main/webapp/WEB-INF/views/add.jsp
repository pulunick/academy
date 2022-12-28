<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<p><input type="text" name="userid" placeholder="ID"></p>
	<p><input type="password" name="userpw" placeholder="PW"></p>
	<p><input type="text" name="username" placeholder="NAME"></p>
	<p><input type="Date" name="birth"></p>
	<fieldset>
		<legend>성별</legend>
			<label><input type="radio" name="gender" value="남성">남성</label>
			<label><input type="radio" name="gender" value="여성">여성</label>
	</fieldset>
	<p><input type="submit"></p>
</form>

</body>
</html>