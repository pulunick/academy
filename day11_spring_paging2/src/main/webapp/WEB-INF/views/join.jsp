<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="join">
	<div>
		<h3>회원가입</h3>
	</div>
	

<form method="POST" name=joinForm id="joinForm">
	<table id="jointalbe">
		<caption>(*)표시는 <strong>필수입력</strong>사항입니다.</caption>
		<tr>
			<th><span>*</span>아이디</th>
			<td>
			<div class="id"> 
				<input type="text" id="userid" name="userid" placeholder="ID" autocomplete="off" required >
					<input type="button" onclick="idOverlap()" value="중복확인"/>
					<input type="button" name="dupCheck" value="중복체크"><br>
					<span class="dupResult"></span>
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>비밀번호</th>
			<td>
			<div class="pw">
				<input type="password" name="userpw" id="userpw" placeholder="PW" required>
				<button onclick="chkPW()">체크PW</button>
				<span id = "confirmPw"></span>
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>비밀번호 재입력</th>
			<td>
			<div class="pw">
				<input 	type="password" name="pwConfirm" id="pwConfirm" 
						placeholder="비밀번호 입력" onkeyup="passConfirm()"> 
						<span id ="confirmMsg"></span>
				<!--onkeyup : value가 입력된 후 이벤트가 실행된다 -->
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>이름</th>
			<td>
			<div class="name">
				<input type="text" name="username" placeholder="NAME" required>
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>생일</th>
			<td>
			<div class="birth">
				<input type="Date" name="birth" required>
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>성별</th>
			<td>
			<div class="gender">
				<label><input type="radio" name="gender" value="남성">남성</label>
				<label><input type="radio" name="gender" value="여성">여성</label>
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>약관</th>
			<td>
			<div class="agreement">
				<textarea class="agreement"  rows="4" cols="50">${agreement }</textarea>
				<br>
				<label><input type="checkbox" name="agreement" disabled required>동의합니다</label>
			</div>
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
			<div>
				&emsp;홈페이지에 가입하시겠습니까?
				<span class="btn">
					<input type="submit" value="가입하기">&nbsp;
				</span>
			</div>
		</tr>
	</table>
	
</form>


</div>

<script>
	// 스프링과 상관없이 단독으로 실행되는 자바스크립트
	const agreement = document.querySelector('textarea.agreement')
	const checkbox = document.querySelector('input[name="agreement"]')
	
	agreement.onscroll = function() {
		const scrollTop = agreement.scrollTop
		const scrollHeight = agreement.scrollHeight
		
		console.log(scrollTop, scrollHeight)
		
		if(scrollTop >= scrollHeight * 0.9) {
			checkbox.removeAttribute('disabled')
		}
	}
</script>


  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>

	function passConfirm() {
	/* 비밀번호, 비밀번호 확인 입력창에 입력된 값을 비교해서 같다면 비밀번호 일치, 그렇지 않으면 불일치 라는 텍스트 출력.*/
		const password = document.getElementById('userpw');				//비밀번호 
		const passwordConfirm = document.getElementById('pwConfirm');	//비밀번호 확인 값
		const confrimMsg = document.getElementById('confirmMsg');		//확인 메세지
		const correctColor = "blue";	//맞았을 때 출력되는 색깔.
		const wrongColor ="red";		//틀렸을 때 출력되는 색깔
		
		if(password.value == pwConfirm.value){		//password 변수의 값과 pwConfirm 변수의 값과 동일하다.
			confirmMsg.style.color = correctColor;	/* span 태그의 ID(confirmMsg) 사용  */
			confirmMsg.innerHTML ="비밀번호 일치";		/* innerHTML : HTML 내부에 추가적인 내용을 넣을 때 사용하는 것. */
		}else{
			confirmMsg.style.color = wrongColor;
			confirmMsg.innerHTML ="비밀번호 불일치";
		}
	}
</script>

<script>
	// 스프링의 특정 주소로 요청하여 결과를 받고, 결과에 따라서 다른 메시지를 만들어내는 코드
	const dupCheck = document.querySelector('input[name="dupCheck"]')
	const dupResult = document.querySelector('span.dupResult')
	
	dupCheck.onclick = function(event) {
		const inputId = document.querySelector('input[name="userid"]').value
		const url = '${cpath}/dupCheck/' + inputId
		
		fetch(url)						// url로 요청하여
		.then(resp => resp.text())		// 응답이 돌아오면, 응답을 문자열로 처리하여
		.then(text => {					// 문자열을 이용하여 다음 코드를 진행합니다
			const code = text.split(':')[0]		// 1 : 사용중, 0 : 중복없음	
			const result = text.split(':')[1]
			dupResult.innerText = result
			dupResult.style.color = code == 1 ? 'red' : 'blue'
		})
	}
</script>

<script>
function idOverlap(){
	console.log("idOverlap 호출")
	console.log("아이디 입력 값 : "+joinForm.userid.value)
$.ajax({
	type :"POST",/* 전송 방식 */
	url :"idOverlap", /* 컨트롤러 사용할 때. 내가 보낼 데이터의 주소. */
	data : {"id" : joinForm.userid.value},
	/* JSON형식 안에 JSON 형식으로 표현한 데이터. 
    "파라미터 이름" : 폼태그에 적은 NAME 값.ID입력창의 NAME값.value 여러 개도 가능
	data :{	"id" : joinForm.userid.value, 
	"id1" : joinForm.userpw.value}, 이렇게도 사용 가능.					
	*/
	dataType : "json",	/* text, xml, html, script, json, jsonp 가능 */
    //정상적인 통신을 했다면 function은 백엔드 단에서 데이터를 처리.
	success : function(cnt){	
		if(cnt > 0){
			alert("이 아이디는 사용  불가능합니다.");
		}else{	
			alert("이 아이디는 사용 가능합니다.");	
		}
	},
	error : function(){
		alert("아이디 중복 확인 ajax 실행 실패");
	}
});

}
</script>

<script>
function chkPW(){

	 const pw = $("#userpw").val();
	 const num = pw.search(/[0-9]/g);
	 const eng = pw.search(/[a-z]/ig);
	 const spe = pw.search(/[`~!@@#$%^&*|₩₩₩'₩";:₩/?]/gi);

	 if(pw.length < 8 || pw.length > 20){

	  alert("8자리 ~ 20자리 이내로 입력해주세요.");
	  return false;
	 }else if(pw.search(/\s/) != -1){
	  alert("비밀번호는 공백 없이 입력해주세요.");
	  return false;
	 }else if(num < 0 || eng < 0 || spe < 0 ){
	  alert("영문,숫자, 특수문자를 혼합하여 입력해주세요.");
	  return false;
	 }else {
		console.log("통과");
		confirmPw.style.color = "blue";
		confirmPw.innerHTML = "사용가능합니다";
	    return true;
	 }

	}
</script>

</body>
</html>