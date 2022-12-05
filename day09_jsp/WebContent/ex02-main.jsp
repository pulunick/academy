<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-main</title>
</head>
<body>
<%--
		로그인에 성공하면 main으로 이동한다
		main에서는 로그아웃 버튼으로 로그아웃 가능
		현재 로그인한 사용자의 이름과 id를 출력해야 한다
 --%>
 <%
 	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for(Cookie cook : cookies) {
			if(cook.getName().equals("id")) {
				session.setAttribute("id", cook.getValue());
			}
		}
	}
 %>
 	<%
 		String id = (String)session.getAttribute("id");
 	%>
 
 <h1>진형닷컴</h1>
 <hr>
 <p><%=id %>님이 로그인 했습니다.</p>
 <a href="ex02-logout.jsp"><button>로그아웃</button></a>

</body>
</html>