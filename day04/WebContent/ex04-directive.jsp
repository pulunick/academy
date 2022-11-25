<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	ex04-directive.jsp
 --%>
 <%@ include file="ex04-header.jsp" %>
 
 <%--
 	형식만 나눴을 뿐 본래 하나의 파일이다.
 	자원까지 공유를 같이하기 때문에 directive를 actionTag보다 많이 사용한다.
 	합친 후 하나의 서블릿으로 만들어짐 걍 하나의 페이지
  --%>
 
<h3>directive를 이용한 include입니다</h3>
<marquee><%=name %></marquee>


</body>
</html>