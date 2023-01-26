<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h1>homeplus 상품 목록</h1>
<hr>
<div id="root">
	<div id="column">
		<div class="idx">상품번호</div>
		<div class="category">카테고리</div>
		<div class="productName">상품명</div>
		<div class="price">가격</div>
		<div class="score">점수</div>
		<div class="registDate">등록날짜</div>
	</div>
	<div id="items">
		<img class="loading" src="${cpath }/resources/image/시공의히오스.gif">
	</div>
</div>

<script src="${cpath }/resources/js/function.js"></script>
<script>
	const cpath = '${cpath}'
	const items = document.getElementById('items')
	
	// 문서 body가 모두 불러와지면 자동으로 loadHandler를 실행한다
	document.body.onload = loadHandler
</script>

<script>
	
</script>

</body>
</html>