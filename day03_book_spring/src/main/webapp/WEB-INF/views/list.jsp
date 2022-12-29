<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<select name="search">
		<option value="name2">책 이름</option>
		<option value="author">저자</option>
		<option value="publihser">출판사</option>
	</select>
	<input name="keyword" value="">
	<input type="submit" value="검색">

</form>

<h4>클릭 시 상세보기 가능</h4>

<table class="search">
	<thead>
		<tr>
			<th>책 이름</th>
			<th>저자</th>
			<th>출판사</th>
			<th>가격</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list }" >
			<tr onclick="location.href='${cpath}/detail?idx=${dto.idx }'" >
				<td>${dto.name }</td>
				<td>${dto.author }</td>
				<td>${dto.publisher }</td>
				<td>${dto.price }</td>
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

<script type="text/javascript">
    const msgss = "${mes}";
    if(msgss === "insertSuccess"){
        alert("추가 완료");
    }
</script>

</body>
</html>