<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h1>진형픽 맛집 추가</h1>

<form method="POST" action="add-action.jsp">
	<fieldset>
		<legend>카테고리</legend>
			<select name="category">
				<option value=""></option>
				<option value="한식" >한식</option>
				<option value="중식" >중식</option>
				<option value="양식" >양식</option>
				<option value="일식" >일식</option>
				<option value="기타" >기타</option>
			</select>
	</fieldset>
	<fieldset>
		<legend>맛집정보</legend>
			<p><input type="text" name="restaurant_name" placeholder="맛집이름"></p>
			<p><input type="text" name="address" placeholder="맛집주소"></p>
			<p><input type="text" name="tel" placeholder="맛집번호"></p>
	</fieldset>
	<fieldset>
		<legend>주차여부</legend>
			<label><input type="radio" name="parking" value="Y">가능</label>
			<label><input type="radio" name="parking" value="N">불가능</label>
	</fieldset>
	<p><input type="submit"></p>
</form>
</body>
</html>