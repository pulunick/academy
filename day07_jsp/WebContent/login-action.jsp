<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<jsp:useBean id="user" class="day07.Member" />
	<jsp:setProperty property="*" name="user" />
	
	<section>
		<fieldset>
			<legend><h3>${memberHandler.getItem(param.idx).name }님</h3></legend>
			<%
				Member login = memberHandler.login(user);
				if(login != null) {
					session.setAttribute("login", login);
					session.setMaxInactiveInterval(600);
					response.sendRedirect(request.getContextPath());
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
		</fieldset>
	</section>	

</body>
</html>