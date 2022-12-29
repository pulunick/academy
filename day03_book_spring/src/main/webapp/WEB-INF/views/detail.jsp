<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="dto" value="${dto }"/>

<fieldset>
	<legend>책 정보</legend>
	<p>고유번호 : ${dto.idx }</p>
	<p>책 이름 : ${dto.name }</p>
	<p>저자 :${dto.author }</p>
	<p>출판사 : ${dto.publisher }</p>
	<p>출판날짜 : ${dto.publishDate }</p>
	<p>가격 : ${dto.price }</p>
	<p>코멘트 : ${dto.memo }</p>
	<p>평점 : ${dto.score }</p>
</fieldset>

<p><a href="${cpath }/update?idx=${dto.idx}">[수정]</a>
<p><a href="${cpath }/delete?idx=${dto.idx}">[삭제]</a>


</body>
</html>