<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="user" class="member2.Member2DTO"/>
<c:set var="dto" value="${dao.selectOne(param.idx) }" />

<h3>수정</h3>
<form method="POST" action="modify-action.jsp">
	<fieldset>
		<legend>회원정보</legend>
			<p><input type="text" name="userid" placeholder="ID" value="${dto.userid }"></p>
			<p><input type="text" name="userpw" placeholder="PW" value="${dto.userpw }"></p>
			<p><input type="text" name="username" placeholder="NAME" value="${dto.username }"></p>
	</fieldset>
	<fieldset>
		<legend>성별</legend>
			<label><input type="radio" name="gender" value="남성" ${dto.gender == ('남성') ? 'checked' : '' }>남성</label>
			<label><input type="radio" name="gender" value="여성" ${dto.gender == ('남성') ? 'checked' : '' }>여성</label>
	</fieldset>
	<p><input type="submit"></p>
	<p><input type="hidden" name="idx" value="${dto.idx }"></p>

</form>

</body>
</html>