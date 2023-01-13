<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST" enctype="multipart/form-data">
<div class="write">
	<div class= "write-title">
	<input type="text" name="title" value="${dto.title }" required>
	</div>
	<div>
		${member.userid }<input type="hidden" name="writer" value="${member.userid }">
	</div>
	<div class= "write-content">
		<textarea name="content" required></textarea>
	</div>
	<div class= "board2-img">
		<h3>수정할 이미지</h3>
		<input type="hidden" name="uploadFile" value="${dto.uploadFile }">
		<img src="${cpath }/board2/${dto.uploadFile}" height="300">
		<p><input type="file" name="realUpload"></p>
	</div>
	<input type="submit" value="수정">
	</div>
</form>


</body>
</html>