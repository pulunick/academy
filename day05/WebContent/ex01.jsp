<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
<style>
	table {
		border-collapse: collapse;
	}
	td, th {
		border: 1px solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>

<h1>attribute 속성의 활용</h1>
<hr>

<table>
	<tr>
		<th>내장 객체</th>
		<th>유효 범위</th>
	</tr>
	<tr>
		<td>pageContext</td>
		<td>현재 JSP 페이지 내부에서만 유효 (페이지가 이동되면 유지되지 않음)</td>
	</tr>
	<tr>
		<!-- 현재 요청이 유효할때까지라 forward를 많이 사용 -->
		<td>request</td>
		<td>현재 요청이 유효한 때 까지만 유효(forward되면 두번째 페이지까지)</td>
	</tr>
	<tr>
		<!-- 크롬을 끄고 주소만 입력해서 다시 접속하면 null -->
		<!-- 로그인 or 로그아웃 같은 사용자 인증정보에 많이 사용 -->
		<td>session</td>
		<td>현재 사용자가 접속해있는 동안 유효</td>
	</tr>
	<tr>
		<!-- 모든 크롬을 끄고 서버를 재기동하면 null -->
		<td>application</td>
		<td>현재 서버가 재기동되기 전까지 유효</td>
	</tr>

</table>
<%
	//내장객체.setAttruibute(String name, object o);
	pageContext.setAttribute("t1", "테스트1");
	request.setAttribute("t2", "테스트2");
	session.setAttribute("t3", "테스트3");
	application.setAttribute("t4", "테스트4");
	
	pageContext.forward("ex01-test.jsp");
	out.print(session.getMaxInactiveInterval());
%>

<h3>t1 : <%=pageContext.getAttribute("t1") %></h3>
<h3>t2 : <%=request.getAttribute("t2") %></h3>
<h3>t3 : <%=session.getAttribute("t3") %></h3>
<h3>t4 : <%=application.getAttribute("t4") %></h3>

<a href="ex01-test.jsp"><button>다른페이지이동</button></a>
<hr>
<h3>EL Tag는 내장객체의 attribute에 접근하여, 그 값을 출력하기 위한 용도이다.</h3>

<!-- 순서대로 다 돌아본다.(현재 실행된 것들중 가까운 것부터) -->
<!-- EL 태그는 없으면 출력하지 않는다 -->
<h3>t1 : ${t1 }</h3>
<h3>t2 : ${t2 }</h3>
<h3>t3 : ${t3 }</h3>
<h3>t4 : ${t4 }</h3>
</body>
</html>