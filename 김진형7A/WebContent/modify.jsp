<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<% if(request.getMethod().equals("GET")) { %>
	<%
		int idx = Integer.parseInt(request.getParameter("idx"));
		pageContext.setAttribute("phonebook", hd.getItem(idx));
	%>
	<fieldset>
	<legend>수정하세요</legend>
	<form method="POST">
		<input type="hidden" name="idx" value="${phonebook.idx }">
		<p><input type="text" name="name" placeholder="성함" value="${phonebook.name }" required></p>
		<p><input type="text" name="tel" placeholder="전화번호" value="${phonebook.tel }" 
		oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*?)\..*/g, '$1');"
		maxlength="13" required></p>
		<p><input type="submit" value="수정"></p>	
	</form>
	</fieldset>
	<% } %>
	<% if(request.getMethod().equals("POST")) { %>
	<jsp:useBean id="user" class="김진형7A.Phonebook" /> 
	<jsp:setProperty property="*" name="user"/> 
	
	 <section> 
 		<fieldset> 
			<legend>${param.name }님의 전화번호가</legend>	
			<h3>${handler.modify(user) >= 0 ? '수정 성공했습니다' : '수정 실패했습니다' }</h3> 
 		</fieldset> 
	 </section>
	<% } %>
 </section> 
</body>
</html>