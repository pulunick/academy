<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="dto" value="${dto }" />
<form method="POST">
	<p><input type="text" name="name" value="${dto.name }"></p>
	<p><input type="text" name="author" value="${dto.author }"></p>
	<p><input type="text" name="publisher" value="${dto.publisher }"></p>
	<p><input type="Date" name="publishDate" value="${dto.publishDate }"></p>
	<p><input type="number" name="price" min="0" max="50000"
				value="${dto.price }"></p>
	<p><input type="text" name="memo" value="${dto.memo }"></p>
	<p><input type="number" step="0.1" name="score" value="${dto.score }"></p>
	<p><input type="submit"></p>
</form>

</body>
</html>