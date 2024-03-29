function deleteHandler(event) {
	const replyWriter = event.target.parentNode.parentNode.querySelector('.writer')
	console.log(login_userid, replyWriter.innerText) // 현재로그인 사용자, 댓글 작성자
	if(login_userid != replyWriter.innerText) {
		alert('본인이 작성한 댓글만 삭제할 수 있습니다')
		return
	}else {
		const flag = confirm('정말 삭제하시겠습니까?')
		if(flag) {
			// 삭제하는 내용을 fetch로 전송 (댓글 idx)
			const idx = replyWriter.parentNode.parentNode.parentNode.getAttribute('idx')
			const url = `${cpath}/board/reply/${board_idx}/${idx}`
			const opt = {
				method: 'DELETE'
			}
			fetch(url, opt)
			.then(resp => resp.text())
			.then(text => {
				if(text == 1) {
					alert('삭제 성공!!')
					replyLoadHandler()
				}
			})	
		}
	}
}

function rreplyHandler(event) {
	event.preventDefault()
	const form = document.getElementById('replyWriteForm')
	const reply = event.target.parentNode.parentNode.parentNode
	console.log(reply)
	
	form.querySelector('input[name="parent_idx"]').value = reply.getAttribute('idx')
	form.querySelector('input[name="reply_depth"]').value = +reply.getAttribute('reply_depth') + 1
	
//	reply.style.backgroundColor = 'lightskyblue'
	document.querySelectorAll('.reply').forEach(reply)
	reply.classList.add('selected')
	reply.appendChild(form)
	form.querySelector('textarea').focus()
}


async function replyLoadHandler() {
		const replyDiv = document.getElementById('reply')
		const url = cpath + '/board/reply/' + board_idx
		
		// 특정 작업이 끝난 이후 진행을 하고 싶다면... await
		// await는 async(비동기) 함수 안에서만 가능
		
		await fetch(url)
		.then(resp => resp.json())
		.then(json => {
			console.log(json)
			const arr = json
			replyDiv.innerHTML = ''
			arr.forEach(dto => {
				const html = convertHTMLfromJSON(dto)
				replyDiv.innerHTML += html
			})
		})
		// fetch가 불러오기 전에  불러와지기 때문에 fetch 앞에 await를 붙여줘야함.
		const deleteBtnList = document.querySelectorAll('button.delete')
		deleteBtnList.forEach(btn => btn.onclick = deleteHandler)
		
		const rreplyBtnList = document.querySelectorAll('button.rreply')
		rreplyBtnList.forEach(btn => btn.onclick = rreplyHandler)
	}

function convertHTMLfromJSON(dto) {
	// json객체를 받아서
	// HTML 태그형식으로 문자열을 반환해야 한다
	
	console.log(dto.reply_depth)
	
	const margin = dto.reply_depth * 30
	console.log(margin)
	
	let html = `<div class="reply" idx="${dto.idx}" reply_depth="${dto.reply_depth}" style="margin-left: ${margin}px">`
	html += `		<div class="replyTop">`
	html += `			<div class="left">`
	html += `				<div class="writer">${dto.writer}</div>`
	html += `				<div class="writeDate">${getYMD(dto.writeDate)}</div>`
	html += `			</div>`
	html += `			<div class="right">`
	html += `				<button class="rreply" ${login_userid == '' ? 'hidden' : ''}>답변</button>`
	html += `				<button class="modify" ${login_userid != dto.writer ? 'hidden' : ''}>수정</button>`
	html += `				<button class="delete" ${login_userid != dto.writer ? 'hidden' : ''}>삭제</button>`
	html += `			</div>`
	html += `		</div>`
	html += `		<pre class="content">${dto.content}</pre>`
	html += `</div>`
	return html
}

function getYMD(date) {
	const d = new Date(date)
	const yyyy = d.getFullYear()
	let mm = d.getMonth() + 1
	let dd = d.getDate()
	if(mm < 10) {
		mm = '0' + mm
	}
	if(dd < 10) {
		dd = '0' + dd
	}
	return `${yyyy}-${mm}-${dd}`
}

function replyWriteHandler(event) {
	event.preventDefault()
	const content = document.querySelector('#replyWriteForm textarea')
	console.log(content.value)
	// 게시글 번호, 작성자, 내용
	const ob = {
		board_idx: board_idx,
		writer: login_userid,
		content: content.value,
		parent_idx: event.target.querySelector('input[name="parent_idx"]').value,
		reply_depth: event.target.querySelector('input[name="reply_depth"]').value,
	}
	const url = cpath + '/board/reply/' + board_idx
	const opt = {
		method: 'POST',
		body: JSON.stringify(ob),
		headers: {
			'Content-Type': 'application/json; charset=utf-8'
		}
	}
	fetch(url, opt)
	.then(resp => resp.text())
	.then(text => {
		if(text == 1) {
			alert('작성 성공!!')
//			replyLoadHandler()
			location.reload()
			content.value= ''
		}
	})
}



















