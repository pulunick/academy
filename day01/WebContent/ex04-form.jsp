<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04-form.jsp</title>
</head>
<body>

<h1>사용자 입력받기 (ex04-form)</h1>
<hr>

<!-- form의 내용을 묶어서 ex04-result.jsp에게 보낸다 -->

<form action="ex04-result.jsp">
	<p><input type="text" name="name" placeholder="이름을 입력하세요" required autocomplete="off"></p>
	<p><input type="number" name="age" placeholder="나이를 입력하세요" required autocomplete="off"></p>
	<p><input type="submit"></p>
</form>

</body>
</html>