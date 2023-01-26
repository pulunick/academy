function jsonToHTML(json) {
	const tag = `
	<div class="item">
		<div class="idx">${json.idx}</div>
		<div class="category">${json.category}</div>
		<div class="productName">${json.productName}</div>
		<div class="price">${json.price}</div>
		<div class="score">${json.score}</div>
		<div class="registDate">${dateFormat(json.registDate)}</div>
	</div>
	`
	return tag
}

function dateFormat(date) {
	const d = new Date(date)
	const yyyy = d.getFullYear()
	let mm = d.getMonth() + 1
	let dd = d.getDate()
	mm = mm < 10 ? '0' + mm : mm
	dd = dd < 10 ? '0' + dd : dd
	console.log(yyyy, mm, dd)
	return `${yyyy}년 ${mm}월 ${dd}일`
	
}


function loadHandler() {
	const url = cpath + '/homeplus/product'
	const opt = {
			method: 'GET'
	}
	fetch(url, opt)
//	.then(resp => resp.text())
//	.then(text => {
//		console.log(text)
//		const arr = JSON.parse(text)			// json형식의 문자열을 객체로변환
//		console.log(arr)				
//		const jsonString = JSON.stringify(arr)	// JS객체를 JSON문자열로 변환
//		console.log(jsonString)
	.then(resp => resp.json())
	.then(json => {
		
		items.innerHTML = ''					// items 안에 그림 날려주기
		json.forEach(dto => items.innerHTML += jsonToHTML(dto))
	})
}