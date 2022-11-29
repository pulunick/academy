<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<fieldset>
		<legend>${handler.getItem(param.idx).name }님의 전화번호부를</legend>
		<h3>${handler.delete(param.idx) == 1 ? '삭제 성공했습니다' : '삭제 실패했습니다' }</h3>
	</fieldset>
</section>

</body>
</html>