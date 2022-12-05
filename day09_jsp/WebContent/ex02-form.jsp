<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-form</title>
</head>
<body>

<h1>세션쿠키를 활용한 자동 로그인</h1>
<hr>
<%
Cookie[] cookies = request.getCookies();
if(cookies != null) {
	for(Cookie cook : cookies) {
		if(cook.getName().equals("id")) {
			response.sendRedirect("ex02-main.jsp");
		}
	}
}
%>


<form action="ex02-action.jsp" method="POST">
	<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
	<p><input type="password" name="userpw" placeholder="Password" required ></p>
	<p>
		<label>
			<input type="checkbox" name="autologin">자동로그인
		</label>
	</p>
	<p><input type="submit" value="로그인"></p>
</form>

</body>
</html>