<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>ex04.jsp Teacher</h3>
<hr>

<div id="root2"></div>
<script src="${cpath }/resouces/js/function.js"></script>
<script>
	function loadHandler() {
		const root = document.getElementById('root')
		const dataList = await getDataList()
		console.log(dataList)
	}
	document.body.onload = loadhandler
	
</script>

</body>
</html>