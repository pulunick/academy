<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>휴대전화번호</th>
			</tr>
		</thead>
		<tbody>
		<% int i = 1; %>
		<%
			for(Phonebook phone : hd.getList()) {
				pageContext.setAttribute("phonebook", phone);
		%>
			<tr>
				<td><%=i++ %></td>
				<td>${phonebook.name }</td>
				<td>${handler.addhyp(phonebook.tel) }</td>
				
				<td><a href="${cpath }/modify.jsp?idx=${phonebook.idx } "><button>수정</button></a></td>
				<td><a href="${cpath }/delete.jsp?idx=${phonebook.idx } "><button>삭제</button></a></td>
			</tr>
		<% } %>
		</tbody>
	</table>
</section>

</body>
</html>