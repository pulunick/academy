<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz-result.jsp</title>
<style type="text/css">
	#wrap{
		margin-left: auto;
		margin-righht: auto;
		text-align:center;

	}
	
	table {
		margin-left: auto;
		margin-right: auto;
		border: 3px solid #03C75A
	}
	th {
		border:1px solid #30C75A
	}
	
	td {
		border: 1px solid #03C75A
	}
	#button {
		background-color: #03C75A
		margin: 5px
		
	}

</style>
</head>
<body>
<%--quiz-form.jsp에서 넘어온 피라미터를 <table>태그를 이용하여 각각 출력 --%>

<%
	String id = request.getParameter("signup-id");
	String pw = request.getParameter("signup-pw");
	String name = request.getParameter("signup-name");
	String birth = request.getParameter("signup-birth-yy");
	String birth2 = request.getParameter("signup-birth-mm");
	String birth3 = request.getParameter("signup-birth-dd");
	String gender = request.getParameter("signup-gender");
	String phone = request.getParameter("signup-phone");
%>


<div id="wrap">
<br><br>
	<b><font size="5" color="gray">회원가입 정보를 확인하세요.</font></b>
<br><br>
	<font color="blue"><%=name %></font>님 가입을 축하드립니다.
<br><br>
<table>
	<tr>
		<th id="title">아이디</th>
		<td><%=id %></td>
	</tr>
	<tr id="title">
		<th>비밀번호</th>
		<td><%=pw %></td>
	</tr>
	<tr id="title">
		<th>이름</th>
		<td><%=name %></td>
	</tr>
	<tr id="title">
		<th>생년월일</th>
		<td><%=birth %>년 <%=birth2 %>월 <%=birth3 %>일</td>
	</tr>
	<tr id="title">
		<th>성별</th>
		<td><%=gender %></td>
	</tr>
	<tr id="title">
		<th>휴대번호</th>
		<td><%=phone %></td>
	</tr>
</table>

	<br>
	<input type="button" value="확인">
</div>

</body>
</html>