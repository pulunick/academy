<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>ex02.jsp</h3>
<hr>

<div id="root2"></div>
<script>
	const url ='https://apis.data.go.kr/6260000/FestivalService/getFestivalKr?serviceKey=EoJslengvamY6ZDx8bgp62ShlmCR9soPgdbSvwDACX0sLKjrRg3aI5Rm4k4ap7giWBiDhtLBJF6g6JtxR2DCuA%3D%3D&pageNo=1&numOfRows=20&resultType=json'
	fetch(url)
	.then(resp => resp.json())
	.then(json => {
		
		const arr = json.getFestivalKr.item
// 		.map(dto => {
// 			for(let key in dto) {
// 				if(dto[key] != '') {
// 					delete dto[key]
// 				}
// 				return ob
// 			}
// 		})
		console.log(arr)
		
		const root2 = document.getElementById('root2')
		
		arr.forEach(dto => {
			const item = document.createElement('div')
			item.className = 'item_festival'
			
			for(let key in dto) {
				
				const div = document.createElement('div')
				div.className = key
				div.innerText = dto[key]
				
				item.appendChild(div)
			}
			const imgNormal = item.querySelector('.MAIN_IMG_NORMAL')
			imgNormal.style.backgroundImage = 'url(' + imgNormal.innerText + ')'
			imgNormal.innerText = ''
			
			root2.appendChild(item)
		})
	})
</script>

</body>
</html>