<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="board-detail">
	<div class="board-detail-wrap">
			<div class="item">
				<div class="idx">글 번호 : ${dto.idx }</div>
				<div class="title">제목 : ${dto.title }</div>
				<div class="title">제목 : ${dto.viewCount }</div>
				<div class="title">아이피 : ${dto.ipaddr }</div>
				<div class="writer">작성자 : ${dto.writer }</div>
				<div class="boarddate">작성날짜 : ${dto.boarddate }</div>
				<div class="content">${dto.content }</div>
				<c:if test="${not empty dto.uploadFile }">
				<div class="boardImg">
					<div>이미지 :</div> 
					<img src="${cpath }/board2/${dto.uploadFile}" height="300">
				</div>
				</c:if>

			</div>
	</div>
	<div class="submenu">
		<c:if test="${member.userid == dto.writer }">
		<div>
			<a href="${cpath }/board2/board2_modify/${dto.idx }"><button>수정</button></a>
			<button class="deleteBtn" idx="${dto.idx }">삭제</button>
		</div>
		</c:if>
		
	</div>
</div>

<script>
	document.querySelector('.deleteBtn').onclick = function(event) {
		const idx = '${dto.idx}'
		const name = '${dto.writer}'
		const flag = confirm('[' + name + '] 를 삭제하시겠습니까?')
		if(flag) {
			location.href = '${cpath}/board2/board2_delete/' + idx
		}
	}
</script>


</body>
</html>