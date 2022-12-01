<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%
session.removeAttribute("login");
// 1) 세션에서 지정한 속성(attribute)을 제거한다

session.invalidate();//세션의 모든 속성 제거 , 새로운 세션을 배정받는것

response.sendRedirect("login.jsp");
%>
<!-- 로그아웃 처리 완료 -->
</body>

</body>
</html>