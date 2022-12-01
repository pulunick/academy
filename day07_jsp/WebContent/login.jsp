<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<form action="login-action.jsp" method="POST">

	<div>
		<fieldset>
			<legend>
				<h1>로그인페이지</h1>
			</legend>
			<table>
				<tr>
					<td>아이디</td>
					<td><input placeholder="아이디 입력" type="text" name="id" required></td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input placeholder="패스워드 입력" type="password" name="pass" required></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" value="로그인"><input
						type="reset" value="초기화"></td>
				</tr>
			</table>
		</fieldset>
	</div>

</form>

</body>
</html>