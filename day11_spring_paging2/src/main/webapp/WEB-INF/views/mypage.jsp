<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="mypaging">
	<div class="mypaging-wrap">
			<div class="item" idx="${mypage.idx }">
				<div class="userid">${mypage.userid }</div>
				<div class="username">${mypage.username }</div>
				<div class="birth">${mypage.birth }</div>
				<div class="gender">${mypage.gender }</div>
			</div>
	</div>
	<div class="submenu">
		<div>
			<a href="${cpath }/modify/${mypage.idx }"><button>수정</button></a>
			<button class="deleteBtn" idx="${mypage.idx }">삭제</button>
		</div>
	</div>
</div>

<script>
	document.querySelector('.deleteBtn').onclick = function(event) {
		const idx = '${mypage.idx}'
		const name = '${mypage.username}'
		const flag = confirm('[' + name + '] 님 탈퇴하시겠습니까?')
		if(flag) {
			location.href = '${cpath}/delete/' + idx
		}
	}
</script>


</body>
</html>