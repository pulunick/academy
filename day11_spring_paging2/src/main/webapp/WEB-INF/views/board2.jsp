<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="write-board-all">
<h3>게시판</h3>
	<div class="write-board-middle">
	<div class="paging">
		<ul>
			<li><a href="${cpath }/board2/board2_write">글쓰기</a></li>
		</ul>
	</div>
		
	   <table id="board-list">
	        <tr class="board-list-head">
	            <th class="board-list-heads">번호</th>
	            <th class="board-list-heads">제목</th>
	            <th class="board-list-heads">작성자</th>
	            <th class="board-list-heads">작성일</th>
	            <th class="board-list-heads">조회수</th>
	        </tr>
	        <c:forEach var="dto" items="${list }">
		        <tr class="board-list-content" onclick="location.href='${cpath}/board2_detail/${dto.idx }'">
		            <td>${dto.idx }</td>
		            <td class="subject">${dto.title }
		            <c:if test="${not empty dto.uploadFile }"><img src="${cpath }/board2/"></c:if>
		            </td>
		
		            <td>${dto.writer }</td>
		            <td>${dto.boarddate }</td>
		            <td>${dto.viewCount }</td>
		        </tr>
	        </c:forEach>
	    </table>
	    <div class="paging">

	        <ul>
	        	<c:if test="${paging.prev }">
		            <li><a href="${cpath }/board2?page=1">첫번째로</a></li>
		            <li><a href="${cpath }/board2?page=${paging.prevFive }">prev</a></li>
		            <li><a href="${cpath }/board2?page=${paging.page -1}">한개씩prev</a></li>
	        	</c:if>
				<c:forEach var="num" begin="${paging.startPageNum }" end="${paging.endPageNum }">	
	    			<li class=${param.page == num ? 'active' : '' }>
	    				<a class="aaaa"
	    				href="${cpath }/board2?page=${num}">${num }</a>
	    			</li>
			    </c:forEach>
			    <c:if test="${paging.next }">
	           		<li><a href="${cpath }/board2?page=${paging.page + 1}">한개씩next</a></li>
	           		<li><a href="${cpath }/board2?page=${paging.nextFive }">next</a></li>
	           		<li><a href="${cpath }/board2?page=${paging.pageCount }">맨끝으로</a></li>
	            </c:if>
	        </ul>
	    </div>
   	</div> 
<div class="search">
	<form method="POST">
		<select name="type">
			<option ${param.type =='title' ? 'selected' : '' } value="title">제목</option>
			<option ${param.type =='writer' ? 'selected' : '' } value="writer">작성자</option>
		</select>
		<input type="search" name="keyword"
				value="${param.keyword }"
				placeholder="검색어를 입력하세요" autofocus>
		<input type="submit" value="검색">
	</form>
</div>
    
</div> 
</body>


</body>
</html>