<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="home.jsp" %>

<h1>student1 테이블 목록</h1>
<hr>

<table>
	<thead>
		<tr>
			<th>NAME</th>
			<th>KOR</th>
			<th>ENG</th>
			<th>MAT</th>
			<th></th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.name }</td>
				<td>${dto.kor }</td>
				<td>${dto.eng }</td>
				<td>${dto.mat }</td>
				<td><a href="${cpath }/ex03?name=${dto.name}">[수정]</a></td>
				<td><a href="${cpath }/ex04?name=${dto.name}">[삭제]</a></td>
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

</body>
</html>