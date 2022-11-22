<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04-result.jsp</title>
</head>
<body>

<h1>입력값(파라미터) 받아서 처리하기</h1>
<hr>



<%
	String name = request.getParameter("name");	
	// 파라미터 받는방법
	String age = request.getParameter("age");
	int age1 = Integer.parseInt(age);
	String age2 = (age1>=20) ? "성인" : "미성년자";			
%>
	


<h3><%=name %>님의 나이는 <%=age %>살입니다 <%=age2 %>입니다.</h3>
<div>
	<a href="ex04-form.jsp"><button>돌아가기</button></a>
</div>


</body>
</html>