<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02-action</title>
</head>
<body>
<%--
		form에서 입력받은 데이터로 로그인을 판별하여 세션에 저장
		필요하다면 쿠키도 활용하여 처리함
		성공하면 main으로 이동
		실패하면 form으로 다시 이동
		
		자동로그인에 체크했다면 현재 세션의 id를 쿠키에 저장(24시간)
 --%>
 <%
 	request.setCharacterEncoding("UTF-8");
 	String id = request.getParameter("userid");
 	String pw = request.getParameter("userpw");
 	String loginChk = request.getParameter("autologin");
 	
 	String dbID="Kim";
 	String dbPW="1234";
 	
 	if(id.equals(dbID) && pw.equals(dbPW)) {
 		session.setAttribute("id", id);
 	 	if(loginChk != null) {
 	 		Cookie cookie = new Cookie("id", id);
 	 		cookie.setMaxAge(60 * 60 * 24);
 	 		cookie.setPath("/");
 	 		response.addCookie(cookie); 		
 	 	}
 		response.sendRedirect("ex02-main.jsp");
 	}

 %>

</body>
</html>