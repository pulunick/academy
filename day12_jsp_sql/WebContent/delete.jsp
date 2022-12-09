<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>맛집 삭제</h3>

<table>
	<thead>
		<tr>
			<th>카테고리</th>
			<th>맛집이름</th>
			<th>맛집주소</th>
			<th>맛집번호</th>
			<th>주차여부</th>
			<th></th>
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
				<td><button class="deleteBtn" idx="${dto.idx }">삭제</button></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script>
	
	function deleteHandler() {
		const idx = this.getAttribute('idx')
		const flag = confirm('정말 ' + idx + '번 상품을 삭제하시겠습니까?')
		
		if(flag) {
			location.href = '${cpath}/delete-action.jsp?idx=' + idx
		}
	}
	
	const btnList = document.querySelectorAll('.deleteBtn')
	

	btnList.forEach(btn => btn.addEventListener('click', deleteHandler))
	
</script>

</body>
</html>