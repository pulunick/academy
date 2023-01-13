<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>글쓰기</h3>
<form method="POST" enctype="multipart/form-data">
<div class="write">
	<div class= "write-title">
		<input type="text" name="title" required>
		<input type="hidden" name="ipaddr" value="${ip }">
		<div>${member.userid }<input type="hidden" name="writer" value="${member.userid }"></div>
	<div class= "write-content">
		<textarea name="content" required></textarea>
	</div>
		<p><input type="file" name="realUpload"></p>
	</div>
		<input type="submit" value="글쓰기">
</div>
</form>

</body>
</html>