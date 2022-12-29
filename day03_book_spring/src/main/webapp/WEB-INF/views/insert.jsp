<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form method="POST">
	<p><input type="text" name="name" placeholder="성함"></p>
	<p><input type="text" name="author" placeholder="저자"></p>
	<p><input type="text" name="publisher" placeholder="출판사"></p>
	<p><input type="Date" name="publishDate" ></p>
	<p><input type="number" name="price" placeholder="가격" min="0" max="50000"></p>
	<p><input type="text" name="memo" placeholder="코멘트"></p>
	<p><input type="number" step="0.1" name="score" placeholder="평점"></p>
	<p><input type="submit"></p>
</form>

</body>
</html>