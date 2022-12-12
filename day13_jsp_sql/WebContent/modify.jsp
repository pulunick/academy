<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>수정</h3>

<table>
	<thead>
		<tr>
			<th>USERID</th>
			<th>USERPW</th>
			<th>USERNAME</th>
			<th>GENDER</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${dao.selectList() }">
			<tr>
				<td>${dto.userid }</td>
				<td>${dto.userpw }</td>
				<td>${dto.username }</td>
				<td>${dto.gender }</td>
				<td>
					<a href="modify-form.jsp?idx=${dto.idx }"><button>수정</button></a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>