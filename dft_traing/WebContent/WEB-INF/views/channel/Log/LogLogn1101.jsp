<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>비밀번호찾기</title>
	<link rel="stylesheet" type="text/css" href="https://ssl.nexon.com/s3/membership/global.css">
	<link rel="stylesheet" type="text/css" href="https://ssl.nexon.com/s3/membership/find2.css">

<link rel="shortcut icon" href="data:;base64,="><meta name="msapplication-config" content="none">
</head>
<body>
<div class="aspNetHidden">
<input type="hidden" name="__EVENTTARGET" id="__EVENTTARGET" value="">
<input type="hidden" name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="6fnEt7yD6Jc989R+eeerk7MzIAxAwVEL9EiRQfZzdoUg4KugJxzCtVpTdvUB8XYmtoGl4YzA9tlR8t4n8Y2qzItIGeDj1jGmOuA8vgXJtjazyw+cWP3KNadESkZevB86S1YHyImu+F+4Rdtl2OOaRs1o/8NzqIs5jVSNcFwK+uPvw8Cy4Qb+JTIsqfSfQKzHwtuA4rfpLrlLZH54C/S/AdEJNBwV8be315JIjg7ivCPNkCWez0LPE0ed+G0v7nZlnu7GzbEzV8sdo+bEPfCFi9D67yQoTw9McuYjLTyl6N5Wi7f4rAU9J8XDLbDMv2sWuxd1HUrQXVyLC6d6Nde8xU74a4kJj3uhalYR/6T8U9XrMDeBfoCR+vickHvPjxDC3eUlFO/eBajRGr7POyauITPHXr0=">
</div>
<div class="aspNetHidden">

	<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="500148EA">
	<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="xRGbzSfQUpSgIDlEmlUGmP1iFnfL2Rn4mDQ3nWtNOENZlALKtto/9xwfTRWnjhfWZtTzOpM3tEk5EG3a1HCy53G5gUYLyWTEtwFF7NrcHutciZogpiw2/ToEoWVSkpDEM4X9ClIvcEUJCBXp6XoBGWZ3URbHW4KzGE7W7JKgtd0cZed/">
</div>
<div class="popupFind2">
	<ul class="find2Tab">
		<li class="password"><a class="on">비밀번호찾기</a></li>
	</ul> 
	<h2 class="hiddenTit">비밀번호찾기</h2>
	<div class="contents">
		<p class="stit">비밀번호 찾기를 위한 회원ID를 입력해주세요.</p>
		<div class="findPwSec">
			<dl class="findPwInput">
				<dd>
					<div class="inputCnts">
						<div id="inputWrap" class="inputWrap"> <!-- error color <div class="inputWrap errorInput"> --> <!-- success color <div class="inputWrap successInput"> -->
							<p class="inputTxtSec"><input name="InputId" type="text" id="InputId" class="inputTxt2 errorInput" placeholder="회원ID"></p>
							<div class="inputAlertSec">
								<p class="delBt" style="display: none;"><button type="button"><span class="hidden">입력삭제</span></button></p>
							</div>
						</div>
						<p id="errorMsg" class="errorMsg"></p>
					</div>
				</dd>
			</dl>
			<div class="btSec">
				<a id="ucInputLoginID_btnNext" class="bt3" href="#" onclick="nextPwd()">다음</a>		<!-- A021 -->
			</div>
		</div>
	</div>
</div>



</body>
<!-- 카카오 스크립트 -->
<!-- <script src="https://developers.kakao.com/sdk/js/kakao.js"></script> -->
<!-- <script>
	//카카오로그인
	function kakaoLogin() {
		const url = 'https://kauth.kakao.com/oauth/authorize?client_id=' +
        '74fa31cb7f8ba0425c9e349b4440428a' +
        '&redirect_uri=' +
        'http://localhost:8081/' +
        '&response_type=code&'
	}
	//카카오로그아웃  
	function kakaoLogout() {
		if (Kakao.Auth.getAccessToken()) {
			Kakao.API.request({
			url: '/v1/user/unlink',
			success: function (response) {
				console.log(response)
			},
			fail: function (error) {
				console.log(error)
			},
		})
		Kakao.Auth.setAccessToken(undefined)
		}
	}  
</script> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	function nextPwd() {
		if (validate3()) {
			var userId = $("#InputId").val();
			var param = {
					userId : userId
			}
	
			$.ajax({
	            url: 'findPwdAjax',
	            type: 'POST',
	            data: param,
	            headers: {
	                'Accept': 'application/json'
	            },
	            success: function(data) {
	            	if(data == null || data == ""){
	            		alert("해당 정보가 조회되지 않습니다.")
	            	}else{
		            	var userData = data[0];
		            	var userPwd = userData.userPwd
		            	
		            	alert("회원님의 패스워드는" + "\n" + userPwd + "입니다.");
	            	}
	            },
	            error: function(xhr, status, error) {
	                console.error('Error:', error);
	            }
	        });
		}
	}

	function validate3(){
		let userId = $("#InputId").val();
		/* let nexonPw = $("#txtPWD").val();
		let idChk = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
		let pwChk = /^(?=.*[A-Z])(?=.*[!@#$%^&*?_])/;
		let pwNum	= nexonPw.search(/[0-9]/g);
		let pwEng	= nexonPw.search(/[a-z]/ig); */
		
		/* if(false === idChk.test(nexonId)){
			alert("ID가 이메일 형식에 부합하지 않습니다.");
			return false;
		} */
		
		if(userId.length < 2){
			alert("ID는 2자리 이상 입력해주세요.");
			return false;
		}
		
		/* if(false === pwChk.test(nexonPw)){
			alert("PW는 영어대문자와 특수문자를 포함하여야 합니다.");
			return false;
		} */
		
		return true;
	}
</script>
</html>