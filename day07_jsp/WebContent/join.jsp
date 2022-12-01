<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "header.jsp" %>

	<form action="join-action.jsp" method="post">
	
		<div>
			<fieldset>
				<legend>
					<h1>회원가입 페이지</h1>
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
						<td>이름</td>
						<td><input placeholder="이름 입력" type="text" name="name" required></td>
					</tr>
					<tr>
						<td>나이</td>
						<td><input placeholder="나이 입력" type="number" name="age" required></td>
					</tr>
					<tr>
						<td>생년월일</td>
						<td><input placeholder="yyyy-MM-dd" type="text" name="birth" required></td>
					</tr>
					<tr>
						<td colspan=2><input type="submit" value="회원가입"><input
							type="reset" value="초기화"></td>
					</tr>
				</table>

			</fieldset>
		</div>

	</form>

</body>
</html>