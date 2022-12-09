<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>진형 맛집 목록</h3>

<table>
	<thead>
		<tr>
			<th>카테고리</th>
			<th>맛집이름</th>
			<th>맛집주소</th>
			<th>맛집번호</th>
			<th>주차여부</th>
		</tr>
	</thead>
	<jsp:useBean id="dao" class="restaurant.RestaurantDAO"/>
	<c:set var="list" value="${dao.selectList() }" />
	<tbody>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.category }</td>
				<td>${dto.restaurant_name }</td>
				<td>${dto.address }</td>
				<td>${dto.tel }</td>
				<td>${dto.parking }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>