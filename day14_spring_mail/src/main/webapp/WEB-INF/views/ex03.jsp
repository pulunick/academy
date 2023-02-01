<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h1>javascript for문의 of와 in</h1>
<hr>

<form>
	<input type="text" name="n1" value="1">
	<input type="text" name="n2" value="2">
</form>

<script>
	const arr = [2, 7, 8, 4, 6]
	const ob = {
			name: '이지은',
			age: 31
	}
	
//	for(let key of ob)
	for(let key in ob) {		// ob is not iterable
		console.log(key)		// key - in
	}
	
	for(let num of arr) {		// of는 iterable 요소에 대하여 사용할 수 있다
		console.log(num)		// 순회 가능한 요소에 대하여 of
								// forEach - of
	}
	
	for(let i = 0; i < arr.length; i++) {
		const n2 = arr[i]
		console.log(n2)
	}
	
	const formData = new FormData(document.forms[0])
	const keys = formData.keys()
	console.log({formaData: formData})
	
	// input의 name을 가져옴
	for(let key of formData.keys()) {	// ['n1', 'n2']
		console.log(key)
	}
	
	// input의 value를 가져옴
	for(let value of formData.values()) {
		console.log(value)
	}
	
</script>



</body>
</html>