<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>회원 삭제</h3>

<table>
	<thead>
		<tr>
			<th>IDX</th>
			<th>USERID</th>
			<th>USERPW</th>
			<th>USERNAME</th>
			<th>GENDER</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${dao.selectList() }">
			<tr>
				<td>${dto.idx }</td>
				<td>
					<a href="${cpath }/detail.jsp?idx=${dto.idx }">${dto.userid }</a>
				</td>
				<td>${dto.userpw }</td>
				<td>${dto.username }</td>
				<td>${dto.gender }</td>
				<td><button class="deleteBtn" idx="${dto.idx }">삭제</button></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script>
	
	function deleteHandler() {
		const idx = this.getAttribute('idx')
		const flag = confirm('정말 ' + idx + '번 회원님을 삭제하시겠습니까?')
		
		if(flag) {
			location.href = '${cpath}/delete-action.jsp?idx=' + idx
		}
	}
	
	const btnList = document.querySelectorAll('.deleteBtn')
	

	btnList.forEach(btn => btn.addEventListener('click', deleteHandler))
	
</script>

</body>
</html>