<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%
	String userid = request.getParameter("userid");
	handler.update(userid);
	response.sendRedirect(cpath + "/memberManagement/");
%>

</body>
</html>