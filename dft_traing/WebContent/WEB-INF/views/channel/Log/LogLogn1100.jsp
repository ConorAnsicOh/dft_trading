<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>
	넥슨 회원로그인
</title><meta http-equiv="Content-Type" content="text/html; charset=utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><link rel="shortcut icon" href="https://rs.nxfs.nexon.com/common/images/nexon.ico"><link rel="stylesheet" type="text/css" href="https://rs.nxfs.nexon.com/nxlogin/css/login.css">
	<script type="text/javascript" async="" src="https://www.google-analytics.com/analytics.js"></script><script type="text/javascript" async="" src="https://www.googletagmanager.com/gtag/js?id=G-G8E41RL4PQ&amp;l=dataLayer&amp;cx=c"></script><script type="text/javascript" async="" src="https://ssl.nexon.com/s1/livewebjs/GnxVisitorTracking.min.js"></script><script async="" src="https://www.googletagmanager.com/gtm.js?id=GTM-M6GQB2M&amp;gtm_auth=opxbH85cveE6aAHmANIUHQ&amp;gtm_preview=env-2&amp;gtm_cookies_win=x"></script><script>(function (w, d, s, l, i) { w[l] = w[l] || []; w[l].push({ 'gtm.start': new Date().getTime(), event: 'gtm.js' }); var f = d.getElementsByTagName(s)[0], j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : ''; j.async = true; j.src = 'https://www.googletagmanager.com/gtm.js?id=' + i + dl + '&gtm_auth=opxbH85cveE6aAHmANIUHQ&gtm_preview=env-2&gtm_cookies_win=x'; f.parentNode.insertBefore(j, f); })(window, document, 'script', 'dataLayer', 'GTM-M6GQB2M');</script>

	<script type="text/javascript" src="https://ssl.nexon.com/s1/global/ngb_head.js" charset="euc-kr"></script><script src="https://ssl.nexon.com/s1/global/ngb_headstart.js?v=1707197085785" type="text/javascript"></script><script src="https://platform.nexon.com/ajax/npf_auth_c.js" type="text/javascript"></script><script charset="euc-kr" src="https://logins.nexon.com/login/page/ngb_login.aspx" type="text/javascript"></script><script src="https://ssl.nexon.com/s1/global/ngb_RSAHash.js" type="text/javascript"></script><script charset="euc-kr" src="https://logins.nexon.com/scripts/captchalogin" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/global/ngb_pcbanglogin.js?v=20181015" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/global/ngb_util.js?v=20190903" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/member/nxmember.js?v=20200111" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/External/makePCIDCookie.js" type="text/javascript"></script><script src="https://ssl.nexon.com/s1/da/a2s.js" type="text/javascript"></script>
	<script type="text/javascript" src="https://ssl.nexon.com/s1/p2/jquery.min.js" charset="utf-8"></script>
	<script type="text/javascript" src="https://ssl.nexon.com/s1/p2/json2.min.js" charset="utf-8"></script>
	<script type="text/javascript" src="https://ssl.nexon.com/s1/p2/ps.min.js" charset="utf-8" data-name="PS" data-ngm="false" data-nxlogin="true" data-miniprofile="false"></script><script type="text/javascript" charset="utf-8" src="https://ssl.nexon.com/s1/p2/util.min.js" data-name="PSUtil"></script>
	<script type="text/javascript" src="/js/common.js?v=20230622"></script>
	<script type="text/javascript" src="/js/nexonlogin.js?v=20230622"></script>
	
</head>
<body>
	<div class="skipNav"><a href="#contents">skip to contents</a></div>
	<div id="wrapper" class="layoutNexon">
		<div class="header">
			
	
	<h1 class="logo">
		<a href="https://www.nexon.com/Home/Game" data-a2s="click" data-object="P_LOGIN" data-option="{&quot;Name&quot;:&quot;Logo&quot;}"><span class="acchidden">NEXON</span></a>
	</h1>
	<div class="headerMsg">
		<p>
			<strong class="pcbangMsg">PC방 접속중</strong>
			<span class="nexonMsg">공공장소에서는 넥슨 ID/비밀번호 기록이 남지 않도록 넥슨플레이로 로그인하세요!</span>
			<span class="otpMsg">넥슨 ID/비밀번호 기록이 남지 않는 일회용 로그인!</span>
			<span class="qrMsg">넥슨 ID/비밀번호 기록이 남지 않는 QR 로그인!</span>
		</p>
	</div>
	<div class="tab">
		<ul>
			<li class="btNexon"><button type="button" data-a2s="click" data-object="P_LOGIN" data-option="{&quot;Name&quot;:&quot;Tab_NexonID&quot;}">넥슨ID 로그인</button></li>
			<li class="btOtp"><button type="button" data-a2s="click" data-object="P_LOGIN" data-option="{&quot;Name&quot;:&quot;Tab_OneTime&quot;}">일회용 로그인</button></li>
			<li class="btQr"><button type="button" data-a2s="click" data-object="P_LOGIN" data-option="{&quot;Name&quot;:&quot;Tab_QR&quot;}">QR 로그인</button></li>
		</ul>
	</div>

		</div>
		<div id="contents">
			
	<div class="loginSec">
	
		<!--ID Login--->
		<div class="nexonLogin" id="nexonLogin">
			<p class="loginMsg">넥슨 ID 혹은 비밀번호를 잘못 입력하셨거나 등록되지 않은 넥슨 ID입니다.</p>
			<fieldset>
				<legend class="acchidden">넥슨ID 로그인</legend>
				<div class="id"><input type="text" class="input01" id="txtNexonID" placeholder="넥슨ID (아이디 또는 이메일)"></div>
				<p class="inputMsg nexonid">넥슨ID (아이디 또는 이메일)를 입력해주세요.</p>
				<div class="pass"><input type="password" class="input01" id="txtPWD" placeholder="비밀번호"></div>
				<p class="inputMsg password">비밀번호를 입력해주세요.</p>
				<div class="saveid" style=""><input type="checkbox" id="chkKeepLogin" data-a2s="click" data-object="P_LOGIN" data-option="{&quot;Name&quot;:&quot;NexonID_Login&quot;,&quot;Type&quot;:&quot;KeepLogin&quot;}"><label for="chkKeepLogin">로그인 상태 유지</label></div>
				<div class="btLogin"><button type="button" class="button01">넥슨ID 로그인</button></div>
			</fieldset>
		</div>
		<p class="loginMenu">
			<a href="#" class="join" onclick="$.NXLogin.Join('P_LOGIN'); return false;">회원가입</a>
			<a href="#" class="schId" onclick="$.NXLogin.findID('P_LOGIN'); return false;">넥슨ID 찾기</a>
			<a href="#" class="schPass" onclick="$.NXLogin.findPW('P_LOGIN'); return false;">비밀번호 찾기</a>
			<a href="https://security.nexon.com" data-a2s="click" data-object="P_LOGIN" data-option="{&quot;Name&quot;:&quot;Security&quot;}" class="sec">보안센터</a>
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
<!-- 카카오 스크립트 -->
<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
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
<script type="text/javascript">
	$(".button01").click(function(){
		if (validate()) {
			alert("로그인이 완료되었습니다.");
		};
	});

	function validate(){
		let nexonId = $("#txtNexonID").val();
		let nexonPw = $("#txtPWD").val();
		let idChk = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
		let pwChk = /^(?=.*[A-Z])(?=.*[!@#$%^&*?_])/;
		let pwNum	= nexonPw.search(/[0-9]/g);
		let pwEng	= nexonPw.search(/[a-z]/ig);
		
		if(false === idChk.test(nexonId)){
			alert("ID가 이메일 형식에 부합하지 않습니다.");
			return false;
		}
		
		if(nexonPw.length < 8){
			alert("PW는 8자리 이상 입력해주세요.");
			return false;
		}
		
		if(false === pwChk.test(nexonPw)){
			alert("PW는 영어대문자와 특수문자를 포함하여야 합니다.");
			return false;
		}
		
		return true;
	}
</script>
</html>