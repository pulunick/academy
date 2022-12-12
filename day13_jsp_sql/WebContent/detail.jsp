<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>단일 테이더 조회</h3>

<jsp:useBean id="user" class="member2.Member2DTO"/>
<c:set var="dto" value="${dao.selectOne(param.idx) }" />

<fieldset>
	<legend>${dto.username }님의 정보</legend>
	<p>idx : ${dto.idx }</p>
	<p>userid : ${dto.userid }</p>
	<p>userpw : ${dto.userpw }</p>
	<p>username : ${dto.username }</p>
	<p>gender : ${dto.gender }</p>
</fieldset>
	


</body>
</html>