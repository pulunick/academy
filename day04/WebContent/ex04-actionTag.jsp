<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	ex04-actionTag.jsp
 --%>
 
 <%--
 	따로따로 서블릿이 되고 모양만 합쳐서 보여준다.
  --%>
 
 <jsp:include page="ex04-header.jsp"/>
 
 <h3>actionTag를 이용한 include입니다</h3>
 <%
 	String name= "actionTag에서 새로만든 name";
 %>
 <marquee><%=name %></marquee>

</body>
</html>
