<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>아이디찾기</title>
	<link rel="stylesheet" type="text/css" href="https://ssl.nexon.com/s3/membership/global.css">
	<link rel="stylesheet" type="text/css" href="https://ssl.nexon.com/s3/membership/find2.css">


    

<script type="text/javascript">
	try {
    (function (w, d, s, l, i) { w[l] = w[l] || []; w[l].push({ 'gtm.start': new Date().getTime(), event: 'gtm.js' }); var f = d.getElementsByTagName(s)[0], j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : ''; j.async = true; j.src = 'https://www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f); })(window, document, 'script', 'dataLayer', 'GTM-PSZ9ZLQ');
  }
  catch (ex) { }
</script>
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
		<!-- width:610px;height:750px; -->
		 <!-- 실제 컨텐츠 영역 -->
		 

<div class="popupFind2">
	<ul class="find2Tab">
		<li class="password"><a class="on">아이디찾기</a></li>
	</ul>
	<h2 class="hiddenTit">아이디찾기</h2>
	<div class="contents">
		<p class="stit">아이디 찾기를 위한 이메일를 입력해주세요.</p>
		<div class="findPwSec">
			<dl class="findPwInput">
				<dd>
					<div class="inputCnts">
						<div id="inputWrap" class="inputWrap"> <!-- error color <div class="inputWrap errorInput"> --> <!-- success color <div class="inputWrap successInput"> -->
							<p class="inputTxtSec"><input name="InputEmail" type="text" id="InputEmail" class="inputTxt2 errorInput" placeholder="이메일"></p>
							<div class="inputAlertSec">
								<p class="delBt" style="display: none;"><button type="button"><span class="hidden">입력삭제</span></button></p>
							</div>
						</div>
						<p id="errorMsg" class="errorMsg"></p>
					</div>
				</dd>
				<dd>
					<div class="inputCnts">
						<div id="inputWrap" class="inputWrap"> <!-- error color <div class="inputWrap errorInput"> --> <!-- success color <div class="inputWrap successInput"> -->
							<p class="inputTxtSec"><input name="InputNm" type="text" id="InputNm" class="inputTxt2 errorInput" placeholder="이름"></p>
							<div class="inputAlertSec">
								<p class="delBt" style="display: none;"><button type="button"><span class="hidden">입력삭제</span></button></p>
							</div>
						</div>
						<p id="errorMsg" class="errorMsg"></p>
					</div>
				</dd>
			</dl>
			<div class="btSec">
				<a id="nextId" class="bt3" href="#" onclick="nextId()">다음</a>		<!-- A021 -->
			</div>
		</div>
	</div>
</div>
		 
		 
		 
		 
		 
	

				<!-- <script type="text/javascript">
					$('[memberbutton=true]').click(
						function(event)
						{
							if( $(this).data('validatorCol') != null )
							{
								for( var i = 0; i < $(this).data('validatorCol').length; i++ )
								{
									var retMsg = $(this).data('validatorCol')[ i ].validator();
									if( retMsg != null )
									{
										alert( retMsg );
										if( $(this).data('validatorCol')[ i ].id != null )
											$('#' + $(this).data('validatorCol')[ i ].id).focus();
										return false;
									}
								}
							}
							
							if( $(this).data('postbackHandler') != null )
								$(this).data('postbackHandler').handler();
							else
							{
								if( $(this).attr('iscrosspostback') == 'true' )
									location.href = $('#' + $(this).attr('id') + '_crosspostback').attr('href');
								else
									__doPostBack( $(this).attr('name'), '' );
							}
						
							return false;
						}
					);
				</script>
			</form> -->
	<!-- <script type="text/javascript" src="https://ssl.nexon.com/s1/global/ngb_bodyend.js" charset="euc-kr"></script><form name="formLogin" method="post" id="formLogin"></form> -->

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
<script src="js/commonDft.js"></script>
<script type="text/javascript">
	function nextId() {
		if (validate2()) {
			ajaxLogn1100();
		}
	}
	
	function ajaxLogn1100(){
		var userEmail = $("#InputEmail").val();
		var userNm = $("#InputNm").val();
		
		var param = {
				userEmail : userEmail,
				userNm : userNm
		}
		
		callAjax("/findIdAjax", param, successLogn1102, errorLogn1102);
	}
	
	function successLogn1102(){
		if(data == null || data == ""){
    		alert("해당 정보가 조회되지 않습니다.");
    	}else{
        	var userData = data[0];
        	var userId = userData.userId
        	
        	alert("회원님의 ID는" + "\n" + userId + "입니다.");
    	}
	}
	
	function errorLogn1102(){
		console.error('Error:', error);
	}

	function validate2() {
		let userEmail = $("#InputEmail").val();
		let userNm = $("#InputNm").val();
		let emailChk = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
		/* let pwChk = /^(?=.*[A-Z])(?=.*[!@#$%^&*?_])/;
		let pwNum	= nexonPw.search(/[0-9]/g);
		let pwEng	= nexonPw.search(/[a-z]/ig); */
		
		if(false === emailChk.test(userEmail)){
			alert("이메일 형식이 잘 못 되었습니다.");
			return false;
		}
		
		if(userNm.length < 2){
			alert("이름은 2자리 이상 입력해주세요.");
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