<%@page import="quiz.MemberHandler"%>
<%@page import="quiz.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	request.setCharacterEncoding("UTF-8");
	pageContext.setAttribute("cpath", request.getContextPath());
	
	MemberHandler memberHandler = (MemberHandler)application.getAttribute("memberHandler");
	if(memberHandler == null) {
		memberHandler = new MemberHandler();
		application.setAttribute("memberHandler", memberHandler);	
	}
%>


	<jsp:useBean id="user" class="quiz.Member" />
	<jsp:setProperty property="*" name="user" />

			<%
			String storeid = request.getParameter("storeid");
			String id = request.getParameter("id");
			String pw = request.getParameter("pass");
				Member login = memberHandler.login(user);
				if(login != null) {
					session.setAttribute("login", login);
					session.setMaxInactiveInterval(600);
					if (storeid != null) { // 체크한 경우
						Cookie c = new Cookie("id", "true");
						c.setMaxAge(60 * 2);
						c.setPath("/");
						response.addCookie(id);
					}
					response.sendRedirect("quiz-check.jsp");
					// 문서 최상위 경로만 요청하고, 파일이름이 없다
					// 파일 이름 없이 요청하면 해당 위치에서 index.jsp를 찾아보고 있으면 index.jsp로 응답
				}
				else {
					%>
					<h3>로그인 실패</h3>
					<button onclick="history.back()">뒤로 가기</button>
					<%
				}
			%>
		
			


</body>
</html>