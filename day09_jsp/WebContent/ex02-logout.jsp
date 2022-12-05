<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-logout</title>
</head>
<body>

<%--
		main에서 로그아웃 버튼을 통해 로그아웃으로 이동
		현재 세션을 무효화시키고, 다시 로그인 페이지(form)으로 이동
 --%>
 
 <%
 	session.invalidate();
 	Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie cook : cookies) {
				if(cook.getName().equals("id")) {
					cook.setMaxAge(0);
					cook.setPath("/");
					response.addCookie(cook);
			}
		}
	}
 	response.sendRedirect("ex02-form.jsp");
 %>

</body>
</html>