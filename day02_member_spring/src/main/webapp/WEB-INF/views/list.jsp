<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<table>
	<thead>
		<tr>
			<th>USERID</th>
			<th>USERNAME</th>
			<th>BIRTH</th>
			<th>GENDER</th>
			<th>상세보기</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.userid }</td>
				<td>${dto.username }</td>
				<td>${dto.birth }</td>
				<td>${dto.gender }</td>
				<td><a href="${cpath }/detail?idx=${dto.idx }">[상세보기]</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script type="text/javascript">
    const msg = "${message}";
    if(msg === "delSuccess"){
        alert("삭제 완료");
    }
</script>

<script type="text/javascript">
    const msgs = "${messages}";
    if(msgs === "updateSuccess"){
        alert("수정 완료");
    }
</script>

</body>
</html>