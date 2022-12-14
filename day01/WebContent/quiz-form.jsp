<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz-form.jsp</title>
<style type="text/css">
body{
    background-color: #f5f6f7;
}
select{
    width:85px;
    height:25px;
    outline: none;
    background: #f5f6f7;
    border: 1px solid #999;
}
a{
    color: black;
    text-decoration: none;
}
.main{
    text-align: center;
	margin-top: 20px;
}
input{
    cursor: pointer
}

/*언어설정*/
.select-lang{
    text-align: right;
    padding-right: 10px;
}
/*네이버 로고설정*/
.image{
    height: 32px;
    padding: 20px;
}
/*input 아이디박스*/
.login-id-wrap{

    margin: 0px 10px 8px 10px;
    padding: 10px;
    border: solid 1px #dadada;
    background: #fff;
}
/*input 아이디 form*/
#input-id{
    border: none;
    outline:none;
    width:100%;
}
/*input 패스워드박스*/
.login-pw-wrap{

    margin: 0px 10px 8px 10px;
    padding: 10px;
    border: solid 1px #dadada;
    background: #fff;
}
/*input 패스워드 form*/
#input-pw{
    border: none;
    outline:none;
    width:100%;
}
/*로그인버튼박스*/
.login-btn-wrap{
    height: 52px;
    line-height: 55px;
    margin: 0px 10px 8px 10px;
    border: solid 1px rgba(0,0,0,.1);
    background-color: #03c75a;
    color: #fff;
    cursor: pointer;
}
/*로그인버튼*/
#login-btn{
    width:100px;
    background-color: #03c75a;
    border: none;
    color:#fff;
    font-size: 18px;
    outline:none;
    cursor: pointer;
}
/*로그인 아래 박스*/
.under-login{
    height: 50px;
    border-bottom: 1px solid gainsboro;
    margin: 0px 10px 35px 10px;
}
/*로그인상태유지*/
.stay-check{
    margin-left: 7px;
    float: left;
}
/*로그인상태유지 체크박스*/
.stay-check input[type="checkbox"] {
    /*기존 체크박스 숨기기*/
    position: absolute;
    width: 0px;
    position: absolute;
}
.stay-check input[type="checkbox"] + label {
    display: inline-block;
    position: relative;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    }
.stay-check input[type="checkbox"] + label::before {
    content: ' ';
    display: inline-block;
    width: 22px;
    height: 22px;
    line-height: 18px;
    margin: -2px 8px 0 0;
    text-align: center;
    vertical-align: middle;
    background: #fafafa;
    border: 1px solid #cacece;
    border-radius: 50%;
    box-shadow: 0px 1px 2px rgba(0,0,0,0.05), inset 0px -15px 10px -12px rgba(0,0,0,0.05);
}
.stay-check input[type="checkbox"]:checked + label::before {
    content: '\2713';
    color: white;
    text-shadow: 1px 1px white;
    background: #03c75a;
    border-color: #03c75a;
    box-shadow: 0px 1px 2px rgba(0,0,0,0.05), inset 0px -15px 10px -12px rgba(0,0,0,0.05);
}
/*IP보안 표시X*/
#ip-check{
    display: none;
}
/*IP보안 ON/OFF*/
#ip-context{
    color:rgb(160, 160, 160);
    font-weight: 900;
    display: inline-block;
    width: 22px;
}
/*간편한 로그인 구역*/
#easy-login-wrap{
    height: 90px;
    margin: 0px 10px 35px 10px;
}
/*간편한 로그인 텍스트*/
.easy-login{
    font-size: 20px;
    font-weight: 500;
}
/*QR & 일회용 로그인 박스 구역*/
.easy-login-box{
    display: grid;
    grid-template-columns: 1fr 1fr;
}
/*QR코드 로그인*/
.qr-login{
    float: left;
    border: 1px solid #03c75a;
    background-color: #fff;
    margin: 0px 4px 0px 0px;
    line-height: 55px;
}
/*일회용 번호 로그인*/
.onetime-login{
    float: right;
    border: 1px solid #03c75a;
    background-color: #fff;
    margin: 0px 0px 0px 4px;
    line-height: 55px;
}
/*더욱 간편한 로그인-en모드*/
.qr-login-en, .facebook-login, .line-login{
    font-family: Helvetica,Dotum,sans-serif;
    font-size: 18px;
    font-weight: 400;
    text-align: left;
    line-height: 55px;
    border: solid 1px #dadada;
    background: #fff;
    margin-bottom: 10px;
}
/*더욱 간편한 로그인 이미지-en모드*/
.easy-login-box-en img{
    display: inline-block;
    vertical-align: middle;
    margin: 0 10px 0 10px;
}
/*찾기 및 회원가입*/
.find-signup-wrap{
    height: 100px;
    grid-template-columns: 1fr 1fr 1fr;
}
/*찾기 및 회원가입 글자 희미하게 바꾸기*/
.find-signup-wrap a{
    color: rgb(150, 150, 150);
    text-decoration: none;
    font-weight: 500;
}
.find-signup-wrap span{
    color: rgb(150, 150, 150);
    font-weight: 500;
}
/*아이디 찾기*/
.find-id{
    margin: 3px;
    font-size: 14px;
    border-right: 1px solid gainsboro;
}
/*아이디 찾기-en모드*/
.find-id-en{
    font-size: 14px;
}
/*비밀번호 찾기*/
.find-pw{
    margin: 3px;
    font-size: 14px;
    border-right: 1px solid gainsboro;
}
/*회원가입*/
.sign-up{
    margin: 3px;
    font-size: 14px;
}
/*저작권 표시X*/
footer{
    display: none;
}


/*가로 800px 이상일때*/
@media(min-width : 800px)
{
    .main{
        width: 460px;
        margin: auto;
    }

/*언어설정*/
.select-lang{
    margin-top: 20px;
    width: 550px;
    padding-right: 10px;
}
/*네이버 로고설정*/
.image{
    margin-top: 40px;
    height: 44px;
    padding: 20px;
}

/*IP보안 표시*/
#ip-check{
    margin-right: 7px;
    float: right;
    display:block;
}

/*저작권 표시*/
footer{
    display:block;
}

}


/*회원가입 부분*/
.main-signup{
    text-align: center;
    width: 460px;
    margin: auto;
}
h3{
    margin:19px 0px 8px;
    text-align: left;
    font-size: 14px;
    font-family: Dotum,'돋움',Helvetica,sans-serif;
}
.signup-input{
    display:flex;
    /* margin: 0px 10px 8px 10px; */
    padding: 10px;
    border: solid 1px #dadada;
    background: #fff;
    cursor: pointer;
}
.signup-input-c{
    display:flex;
    /* margin: 0px 10px 8px 10px; */
    padding: 10px;
    border: solid 1px #dadada;
    background: #f5f6f7;
    cursor: pointer;
}
.signup-input-c input{
    background: #f5f6f7;
}
#signup-id, #signup-pw, #signup-pww{
    height: 29px;
    border: none;
    outline:none;
    width:100%;
}
.signup-at{
    color: rgb(150, 150, 150);
    font-size: 15px;
    font-family: Dotum,'돋움',Helvetica,sans-serif;
    margin-top: 8px;
}
.pw-lock{
    /* content: ''; */
    /* display: inline-block; */
    top: 50%;
    right: 13px;
    width: 24px;
    height: 24px;
    margin-top: 5px;
    background-image: url(https://static.nid.naver.com/images/ui/join/m_icon_pw_step.png);
    background-size: 125px 75px;
    cursor: pointer;
}
.pww-lock{
    /* content: ''; */
    /* display: inline-block; */
    top: 50%;
    right: 13px;
    width: 24px;
    height: 24px;
    margin-top: 5px;
    background-image: url(https://static.nid.naver.com/images/ui/join/m_icon_pw_step.png);
    background-size: 125px 75px;
    cursor: pointer;
}

.signup-input-birth{
    display: block;
    position: relative;
    width: 100%;
    height: 51px;
    border: solid 1px #dadada;
    padding: 10px;
    background: #fff;
    box-sizing: border-box;
}
#signup-birth-yy, #signup-birth-mm, #signup-birth-dd{
    width: 113px;
    height: 29px;
    border: none;
    outline:none;
}
#signup-name, #signup-gender, #signup-email, #signup-country, #signup-phone, #signup-cnum{
    width:100%;
    height: 29px;
    border: none;
    outline:none;
}
#signup-gender{
    background-color: white;
}
#signup-country{
    background-color: white;
}
#signup-birth-mm{
    background-color: white;
}
/*본인 확인 이메일*/
.choice{
    display: flex;
}
.choice span{
    margin-top: 20px;
    color: rgb(150, 150, 150);
    font-size: 13px;
    font-family: Dotum,'돋움',Helvetica,sans-serif;
}
/*회원가입버튼박스*/
.signup-btn-wrap{
    height: 52px;
    line-height: 55px;
    margin: 10px 0px 50px 0px;
    border: solid 1px rgba(0,0,0,.1);
    background-color: #03c75a;
    color: #fff;
    cursor: pointer;
}
/*회원가입버튼*/
#signup-btn{
    width:100px;
    background-color: #03c75a;
    border: none;
    color:#fff;
    font-size: 18px;
    outline:none;
    cursor: pointer;
}
/*인증번호버튼박스*/
.cnum-btn-wrap{
    height: 52px;
    line-height: 55px;
    margin: 10px 0px 0px 10px;
    border: solid 1px rgba(0,0,0,.1);
    background-color: #03c75a;
    color: #fff;
    cursor: pointer;
}
/*인증번호버튼*/
#cnum-btn{
    width:115px;
    background-color: #03c75a;
    border: none;
    color:#fff;
    font-size: 15px;
    outline:none;
    cursor: pointer;
}


.main-signup
</style>
</head>
<body>
<!-- HTML과 CSS위주로 네이버 회원가입 페이지를 작성 -->
	<div class="main-signup">
		<!--웹페이지 상단-->
		<header>
			<!--NAVER LOGO-->
			<div class="logo">
				<a href="https://www.naver.com/" target="_blank" title="네이버 홈페이지">
				<img src="NAVER_LOGO.png" class="image"></a>
			</div>
		</header>

<form action="quiz-result.jsp">
		<!--회원가입 부분-->
		<section class="signup-wrap">
			<div>
				<!-- 아이디, 비번, 비번재확인 -->
				<h3>아이디</h3>
				<span class="signup-input"> <input name="signup-id" type="text"></input>
					<span class="signup-at">@naver.com</span>
				</span>
				<h3>비밀번호</h3>
				<span class="signup-input"> <input name="signup-pw" type="password"></input>
					<span class="pw-lock"></span>
				</span>
				<h3>비밀번호 재확인</h3>
				<span class="signup-input"> <input name="signup-pw2" type="password"></input> 
					<span class="pw2-lock"></span>
				</span>
			</div>

			<div style="margin-top: 30px;">

				<h3>이름</h3>
				<span class="signup-input"> <input name="signup-name" type="text"></input>
				</span>

				<h3>생년월일</h3>
				<span style="display: flex;"> 
					<span class="signup-input-birth"> 
					<input name="signup-birth-yy"type="text" placeholder="년(4자)"></input>

					</span> 
				<span class="signup-input-birth" style="margin-left: 10px;">
					<select name="signup-birth-mm" class="selectbox" name="month"onchange"">
						<option value="월">월</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
					</select>
				</span> 
				<span class="signup-input-birth" style="margin-left: 10px">
						
				<input name="signup-birth-dd" type="text" placeholder="일"></input>
				</span>
				</span>

				<h3>성별</h3>
				<span class="signup-input"> 
					<select name="signup-gender" class="selectbox" name="gender" onchange="">
						<option value="gender">성별</option>
						<option value="man">남자</option>
						<option value="women">여자</option>
						<option value="none">선택 안함</option>
					</select>
				</span> 
					<span class="choice">
					<h3>본인 확인 이메일</h3> 
					<span>(선택)</span>
					</span> 
				<span class="signup-input"> 
				<input name="signup-email"
					type="text" placeholder="선택입력"></input>
				</span>
			</div>

			<div style="margin-top: 30px;">
				<!-- 휴대전화 -->
				<h3>휴대전화</h3>
				<span class="signup-input"> 
				<select name="signup-country"
					class="selectbox" name="country">
					<option value="ko">대한민국 +82</option>
				</select>
				</span>
				<div style="display: flex;">
					<span class="signup-input"
						  style="width: 100%; margin: 10px 0px 0px 0px"> 
						<input name="signup-phone" type="text" placeholder="전화번호 입력"></input>
					</span> 
					<span class="num-btn-wrap">
						<input type="button" value="인증번호 받기">
					</span>
				</div>
				<span class="signup-input">
					<input name="signup-cn" type="text" placeholder="인증번호 입력하세요"></input>
				</span>
			</div>
			<div>
				<div class="signupt-btn-wrap">
					<p><input type="submit" value="가입하기"></p>
				</div>
			</div>
		</section>
</form>
		
		<footer>
			<div class="copyright-wrap" style="font-size: 12px">
				<span>이용약관 | 개인정보처리방침 | 책임의 한계와 고지 | 회원정보 고객센터</span>
				<div>@NAVER Corp.</div>
			</div>
		</footer>
	</div>


</body>
</html>