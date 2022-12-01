<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ page import="day07.MemberHandler, day07.Member, java.util.ArrayList" %>

<ol>
<%
	for(Member ms : memberHandler.getList()) {
		pageContext.setAttribute("c", ms);	// 현재 페이지에서만 참조하면 되니까 pageContext
		%>
		<!-- 스크립틀릿을 중간에 한번 끊었다가 다시 열어주어도 된다 -->
		<li>
			${c.id } / ${c.pass } / ${c.name } /
			${c.age } / ${c.birth }
		</li>	
		<%
	}
%>
</ol>
</body>
</html>



