<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<%
		if(request.getMethod().equals("GET")) {
	%>
	<fieldset>
	<legend>추가하세요</legend>
	<form method="POST">
		<p><input type="text" name="name" placeholder="성함" required></p>
		<p><input type="text" name="tel" placeholder="숫자만 입력하세요" 
			oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*?)\..*/g, '$1');"  
			maxlength="13" required></p>
		<p><input type="submit" value="생성"></p>	
	</form>
	</fieldset>
	<%
		}
	%>
	
	<%
			if(request.getMethod().equals("POST")) {
		%>
	<jsp:useBean id="user" class="김진형7A.Phonebook" /> 
	<jsp:setProperty property="*" name="user"/> 
	
 	<section> 
 		<fieldset> 
			<legend>${param.name }님의 전화번호가</legend>	
			<h3>${handler.insert(user) }</h3> 
 		</fieldset> 
 	</section> 
	<% } %>
	
</section>

</body>
</html>