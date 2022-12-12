<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>회원 목록</h3>

<table>
	<thead>
		<tr>
			<th>IDX</th>
			<th>USERID</th>
			<th>USERPW</th>
			<th>USERNAME</th>
			<th>GENDER</th>
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
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>