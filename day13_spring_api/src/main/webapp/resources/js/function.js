function getHTMLfromDTO(dto) {
	
}





async function getDataList() {
	const url ='https://apis.data.go.kr/6260000/FestivalService/getFestivalKr?serviceKey=EoJslengvamY6ZDx8bgp62ShlmCR9soPgdbSvwDACX0sLKjrRg3aI5Rm4k4ap7giWBiDhtLBJF6g6JtxR2DCuA%3D%3D&pageNo=1&numOfRows=20&resultType=json'
	return await fetch(url)
	.then(resp => resp.json())
	.then(json => {
		const arr = json.getFestivalKr.item
		
		return arr
	})
}