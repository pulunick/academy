<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO" />
<c:set var="dto" value="${dao.selectOne(param.idx) }" />

<h3>수정</h3>
<form method="POST" action="modify-action.jsp">
	<fieldset>
		<legend>카테고리</legend>
			<select name="category">
				<option value="">===카테고리====</option>
				<option value="한식" ${dto.category == '한식' ? 'selected' : '' }>한식</option>
				<option value="중식" ${dto.category == '중식' ? 'selected' : '' }>중식</option>
				<option value="양식" ${dto.category == '양식' ? 'selected' : '' }>양식</option>
				<option value="일식" ${dto.category == '일식' ? 'selected' : '' }>일식</option>
				<option value="기타" ${dto.category == '기타' ? 'selected' : '' }>기타</option>
			</select>
	</fieldset>
	<fieldset>
		<legend>맛집정보</legend>
			<p><input type="text" name="restaurant_name" placeholder="맛집이름" value="${dto.restaurant_name }"></p>
			<p><input type="text" name="address" placeholder="맛집주소" value="${dto.address }"></p>
			<p><input type="text" name="tel" placeholder="맛집번호"  value="${dto.tel }"></p>
	</fieldset>
	<fieldset>
		<legend>주차여부</legend>
			<label><input type="radio" name="parking" value="Y" ${dto.parking == ('Y') ? 'checked' : ''  }>가능</label>
			<label><input type="radio" name="parking" value="N" ${dto.parking == ('N') ? 'checked' : ''  }>불가능</label>
	</fieldset>
	<p><input type="submit" value="수정"></p>
	<p><input type="hidden" name="idx" value="${dto.idx }"></p>
</form>

</body>
</html>