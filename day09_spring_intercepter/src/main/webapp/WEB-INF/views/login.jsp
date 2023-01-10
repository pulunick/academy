<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>로그인</h3>
<form name="login" method="POST">
<c:if test="${member == null }">
<table border="1" width="400px">
<tr>
 <td>아이디</td>
 <td><input id="userid" name="userid"></td>
</tr>
<tr>
 <td>비밀번호</td>
 <td><input type="password" id="userpw" name="userpw"></td>
</tr>
<tr>
 <td colspan="2" align="center">
<input type="submit">
 <c:if test="${msg == false}">
 <div style="color:red;"> 아이디 또는 비밀번호가 일치하지 않습니다.
 </div>
</c:if>
<%-- <c:if test="${message == 'logout'}"> --%>
<!--  <div style="color:red;"> 로그아웃되었습니다. -->
<!--  </div> -->
<%-- </c:if> --%>
</td>
</tr>
</table>
</c:if>


</form>






</body>
</html>