<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="dto" value="${dto }" />

<fieldset>
<legend>회원정보</legend>
<p>idx : ${dto.idx }</p>
<p>ID : ${dto.userid }</p>
<p>PW : ${dto.userpw }</p>
<p>NAME : ${dto.username }</p>
<p>BIRTH : ${dto.birth }</p>
<p>GENDER : ${dto.gender }</p>
</fieldset>


<p><a href="${cpath }/update?idx=${dto.idx}">[수정]</a>
<p><a href="${cpath }/delete?idx=${dto.idx}">[삭제]</a>



</body>
</html>