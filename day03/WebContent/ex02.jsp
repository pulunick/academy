<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
<%
	// 어느 코드에서든 자바코드가 먼저 실행이 된다.
	// 서버에서 실행되는 코드
	String bgColor = request.getParameter("bgcolor");
	String textColor = request.getParameter("textColor");
	
	String bc = "white";	// 변수 선언 및 기본값 설정
	String tc = "black";
	
	bc = (bgColor != null) ? bgColor : bc;
	tc = (textColor != null) ? textColor : tc;
%>
<style>
	/* 클라이언트에서 실행되는 코드 */
	body {
		background-color: <%=bc %>; 
		color: <%=tc %>;
	}
</style>
</head>
<body>

<h1>파라미터값을 HTML내부 속성/CSS 속성으로 활용하기</h1>
<hr>

<form>
	<!-- form 태그의 action 속성이 없으면 현재 주소에서 다시 처리한다 -->
	<!-- input 등에 필수값을 확인하는 required 속성 -->
	<select name="bgcolor" required>
		<option value="">=== 배경색 ===</option>
		<option value="#BF92F4">black</option>
		<option value="grey">grey</option>
		<option value="darkgrey">darkgrey</option>
		<option value="antiquewhite">antiquewhite</option>
		<option value="white">white</option>
	</select>
	
	<select name="textColor" required>
		<option value="">=== 글자색 ===</option>
		<option value="#DCC5EF">black</option>
		<option value="lime">lime</option>
		<option value="orange">orange</option>
		<option value="skyblue">skyblue</option>
		<option value="white">white</option>
	</select>
	
	<input type="submit">
</form>

</body>
</html>