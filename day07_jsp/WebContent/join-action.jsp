<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file= "header.jsp" %>

<%--
		1) 객체 생성
		2) 파라미터값을 객체에 대입
		3) 핸들러를 통해 리스트에 추가
		4) list.jsp 로 페이지 이동 (리다이렉트)
 --%>
	
	<jsp:useBean id="user" class="day07.Member" />
	<jsp:setProperty property="*" name="user" />
	
	<section>
		<fieldset>
			<legend><h3>${memberHandler.getItem(param.idx).name }님</h3></legend>
			<h3>${memberHandler.insert(user) ? '가입 축하합니다' : '아이디가 중복되었습니다'  }</h3>
		</fieldset>
		<button onclick="location.href='${cpath}/list.jsp'" >목록으로</button>
		
		<a href="${cpath }/list.jsp"><button>목록으로</button></a>
		
		<button onclick="history.back()">뒤로가기</button>
	</section>	

</body>
</html>