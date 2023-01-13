<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<form method="POST">
	<table>
		<caption>(*)표시는 <strong>필수입력</strong>사항입니다.</caption>
		<tr>
			<th><span>*</span>아이디</th>
			<td>
			<div class="id"> 
				<div class="userid">${dto.userid }</div>
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>비밀번호</th>
			<td>
			<div class="pw">
				<input type="password" name="userpw" id="userpw" placeholder="PW" required>
				<button onclick="chkPW()">유효성확인</button>
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
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>이름</th>
			<td>
			<div class="name">
				<input type="text" name="username" value="${dto.username }" required>
			</div>
			</td>
		</tr>
		
		<tr>
			<th><span>*</span>생일</th>
			<td>
			<div class="birth">
				<input type="Date" name="birth" value="${dto.birth }" required>
			</div>
			</td>
		</tr>
		
			<tr>
			<th><span>*</span>성별</th>
			<td>
			<div class="gender">
				<label><input type="radio" name="gender" value="남성" ${dto.gender == ('남성') ? 'checked' : '' }>남성</label>
				<label><input type="radio" name="gender" value="여성" ${dto.gender == ('여성') ? 'checked' : '' }>여성</label>
			</div>
			</td>
		</tr>
		
		<tr>
			<td colspan="2">
			<div>
				&emsp;수정하시겠습니까??
				<span class="btn">
					<input type="submit" value="수정하기">&nbsp;
				</span>
			</div>
		</tr>
	</table>
	
</form>


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