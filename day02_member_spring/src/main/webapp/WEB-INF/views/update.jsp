<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="dto" value="${dto }" />
<form method="POST">
	<p><input type="hidden" name="idx" value="${dto.idx }"></p>
	<p><input type="text" name="userid" value="${dto.userid }"></p>
	<p><input type="password" name="userpw" value="${dto.userpw }"></p>
	<p><input type="text" name="username" value="${dto.username }"></p>
	<p><input type="Date" name="birth" value="${dto.birth }"></p>
	<fieldset>
		<legend>성별</legend>
			<label><input type="radio" name="gender" value="남성" ${dto.gender == ('남성') ? 'checked' : '' }>남성</label>
			<label><input type="radio" name="gender" value="여성" ${dto.gender == ('여성') ? 'checked' : '' }>여성</label>
	</fieldset>
	<p><input type="submit"></p>
</form>



</body>
</html>