<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>
	회원 회원로그인
</title><meta http-equiv="Content-Type" content="text/html; charset=utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><link rel="shortcut icon" href="https://rs.nxfs.nexon.com/common/images/nexon.ico"><link rel="stylesheet" type="text/css" href="https://rs.nxfs.nexon.com/nxlogin/css/login.css">	
</head>
<body>
	<div class="skipNav"><a href="#contents">skip to contents</a></div>
	<div id="wrapper" class="layoutNexon">
		<div class="header">
			
	
	<div class="tab">
		<ul>
			<li class="btNexon"><button type="button" data-a2s="click" data-object="P_LOGIN" data-option="{&quot;Name&quot;:&quot;Tab_NexonID&quot;}">회원ID 로그인</button></li>
		</ul>
	</div>
 
		</div>
		<div id="contents">
			
	<div class="loginSec">
	
		<!--ID Login--->
		<div class="nexonLogin" id="nexonLogin">
			<p class="loginMsg">회원 ID 혹은 비밀번호를 잘못 입력하셨거나 등록되지 않은 회원 ID입니다.</p>
			<fieldset>
				<legend class="acchidden">회원ID 로그인</legend>
				<div class="id"><input type="text" class="input01" id="userId" placeholder="회원ID"></div>
				<p class="inputMsg nexonid">회원ID를 입력해주세요.</p>
				<div class="pass"><input type="password" class="input01" id="userPwd" placeholder="비밀번호"></div>
				<p class="inputMsg password">비밀번호를 입력해주세요.</p>
				<div class="btLogin"><button type="button" class="button01">회원ID 로그인</button></div>
			</fieldset>
		</div>
		<p class="loginMenu">
			<a href="/SingUp" class="join">회원가입</a>
			<a href="#" class="schId" onclick="openPopup2()">회원ID 찾기</a>
			<a href="#" class="schPass" onclick="openPopup()">비밀번호 찾기</a>
		</p>
		
		<!-- <div>
			<button type="button" class="kakao"><img src="kakao_login_medium_wide.png" onclick="kakaoLogin();"></button>
		</div> -->
	
	</div>

		</div>
		<div class="footer">
			<p class="copyright">© NEXON Korea Corporation All Rights Reserved.</p>
		</div>
	</div>
	
	<!--qr notice-->
	<div class="layerGuide">
		<div class="layer">
			<h3><img src="https://rs.nxfs.nexon.com/nxlogin/images/ico_nexonplay.png" width="60" height="60" alt="" srcset="https://rs.nxfs.nexon.com/nxlogin/images/ico_nexonplay@2x.png 2x">넥슨플레이 앱 &gt; 메뉴 탭 &gt; QR 스캐너</h3>
			<p><img src="https://rs.nxfs.nexon.com/nxlogin/images/img_nexonplay.png" width="320" height="536" alt="" srcset="https://rs.nxfs.nexon.com/nxlogin/images/img_nexonplay@2x.png 2x"></p>
			<button type="button" class="btClose" onclick="$(&quot;.layerGuide&quot;).removeClass(&quot;layerShow&quot;);"><span class="acchidden">레이어 닫기</span></button>
		</div>
	</div>




<div><form id="formLogin" name="formLogin" method="post"></form></div></body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
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
<script src="/WebContent/WEB-INF/js/commonDft.js"></script>
<script>
	function openPopup() {
	    popOpen("/moveFindPwd", 600, 400);
	}
</script>
<script>
	function openPopup2() {
	    window.open("/moveFindId", "Popup", "width=600,height=400");
	}
</script>
<script type="text/javascript">
	$(".button01").click(function(){
		if (validate()) {
			var userId = $("#userId").val();
			var userPwd = $("#userPwd").val();
			var param = {
					userId : userId,
					userPwd : userPwd
			}
	
			$.ajax({
	            url: '/loginAjax',
	            type: 'POST',
	            data: param,
	            headers: {
	                'Accept': 'application/json'
	            },
	            success: function(data) {
	            	alert("로그인이 완료되었습니다.");
	            	dftUtil.movePage("/");
	            },
	            error: function(xhr, status, error) {
	            	var responseText = xhr.responseText
	            	var errorMessage = responseText.match(/<p><b>메시지<\/b>(.*?)<\/p>/)[1].replace(/Request processing failed; nested exception is java.lang.Exception: \s*/, '');
	                alert(errorMessage);
	            }
	        });
		};
	});

	function validate(){
		let userId = $("#userId").val();
		/* let nexonPw = $("#txtPWD").val();
		let idChk = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
		let pwChk = /^(?=.*[A-Z])(?=.*[!@#$%^&*?_])/;
		let pwNum	= nexonPw.search(/[0-9]/g);
		let pwEng	= nexonPw.search(/[a-z]/ig); */
		
		/* if(false === idChk.test(nexonId)){
			alert("ID가 이메일 형식에 부합하지 않습니다.");
			return false;
		}*/
		
		if(userId.length < 2){
			alert("아이디는 2자리 이상 입력해주세요.");
			return false;
		}
		
		/*if(false === pwChk.test(nexonPw)){
			alert("PW는 영어대문자와 특수문자를 포함하여야 합니다.");
			return false;
		} */
		
		return true;
	}
</script>
</html>