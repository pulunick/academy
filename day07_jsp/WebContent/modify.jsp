<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "header.jsp" %>


<form method="POST" action="modify-action.jsp">
 <table border="1" cellpadding="10" cellspacing="0">
 	<tr>
 		<td>id</td>
 		<td><input type="hidden" name="id" value= "${login.id }"></td>
 	</tr>
 	<tr>
 		<td>pw</td>
 		<td><input type="password" name="pass" value= "${login.pass }"></td>
 	</tr>
 	<tr>
 		<td>name</td>
 		<td><input type="text" name="name" value= "${login.name }"></td>
 	</tr>
 	<tr>
 		<td>age</td>
 		<td><input type="number" name="age" value= "${login.age }"></td>
 	</tr>
 	<tr>
 		<td>birth</td>
 		<td><input type="text" name="birth" value= "${login.birth }"></td>
 	</tr>
 </table>
 	<p><input type="submit" value="정보 수정"></p>

</form>



</body>
</html>