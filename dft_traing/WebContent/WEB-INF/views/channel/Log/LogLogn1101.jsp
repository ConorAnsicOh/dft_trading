<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>비밀번호찾기 &lt; 넥슨</title>
	<link rel="stylesheet" type="text/css" href="https://ssl.nexon.com/s3/membership/global.css">
	<link rel="stylesheet" type="text/css" href="https://ssl.nexon.com/s3/membership/find2.css">

	<script type="text/javascript" async="" src="https://www.googletagmanager.com/gtag/js?id=G-5TQ2KDF6JC&amp;cx=c&amp;_slc=1"></script><script type="text/javascript" async="" src="https://ssl.nexon.com/s1/livewebjs/GnxVisitorTracking.min.js"></script><script type="text/javascript" async="" src="https://www.google-analytics.com/analytics.js"></script><script async="" src="https://www.googletagmanager.com/gtm.js?id=GTM-PSZ9ZLQ"></script><script type="text/javascript">
	<!--
        document.domain = 'nexon.com';
	//-->
	</script>

    

<script type="text/javascript">
	try {
    (function (w, d, s, l, i) { w[l] = w[l] || []; w[l].push({ 'gtm.start': new Date().getTime(), event: 'gtm.js' }); var f = d.getElementsByTagName(s)[0], j = d.createElement(s), dl = l != 'dataLayer' ? '&l=' + l : ''; j.async = true; j.src = 'https://www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f); })(window, document, 'script', 'dataLayer', 'GTM-PSZ9ZLQ');
  }
  catch (ex) { }
</script>

	<script type="text/javascript" src="https://ssl.nexon.com/s1/jquery/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="https://ssl.nexon.com/s1/global/ngb_head.js" charset="euc-kr"></script><script src="https://ssl.nexon.com/s1/global/ngb_headstart.js?v=1709168665271" type="text/javascript"></script><script src="https://platform.nexon.com/ajax/npf_auth_c.js" type="text/javascript"></script><script charset="euc-kr" src="https://logins.nexon.com/login/page/ngb_login.aspx" type="text/javascript"></script><script src="https://ssl.nexon.com/s1/global/ngb_RSAHash.js" type="text/javascript"></script><script charset="euc-kr" src="https://logins.nexon.com/scripts/captchalogin" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/global/ngb_pcbanglogin.js?v=20181015" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/global/ngb_util.js?v=20190903" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/member/nxmember.js?v=20200111" type="text/javascript"></script><script charset="euc-kr" src="https://ssl.nexon.com/s1/External/makePCIDCookie.js" type="text/javascript"></script><script src="https://ssl.nexon.com/s1/da/a2s.js" type="text/javascript"></script>
	<script type="text/javascript" src="../js/MemberUtil.js?v=638447978652598237"></script>
	<script type="text/javascript" src="../js/jquery.alphanumeric.js"></script>
	<script type="text/javascript" src="../js/jquery.center.js"></script>
	<script type="text/javascript" src="../js/jquery.popupWindow.js"></script>
	<script type="text/javascript" src="../js/jquery.autotab.js"></script>	
<link rel="shortcut icon" href="data:;base64,="><meta name="msapplication-config" content="none">
</head>
<body>
	<script type="text/javascript" src="https://ssl.nexon.com/s1/global/ngb_bodystart.js" charset="euc-kr"></script>
	<script type="text/javascript">
		$(function () {

						
			if (window.innerWidth < 610 || window.innerHeight < 750) {
				// 팝업 사이즈 재조정
				Popup.Resize(610, 750);
			}
		

			$("html").css("overflow", "hidden");			// 스크롤바 hidden 처리
			$("[finda2sopt]").click(function (event) {		// a2s log
				MemberA2S.Click("MEMBERS_FIND_PW", $(this).attr("finda2sopt"));
			});
		});
    </script>
	 <form method="post" action="./findpwd.aspx" onsubmit="javascript:return WebForm_OnSubmit();" id="m_form">
<div class="aspNetHidden">
<input type="hidden" name="__EVENTTARGET" id="__EVENTTARGET" value="">
<input type="hidden" name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="jT6hfOIdJh/6jNH0Hzrm55qg/zVxORHdQgA5daBph1/z9SGykM83pPyoZkEGe89f/L4eqDoFlMtwdrOxORzVf0VV6NNHxMWfLtMa2uj0ek2Q3CjIHp6xM3VHMjouEZ5OsUolqklTNIQdZ/xVvT10GWEqPq5+nqMpk7+4Joz0q60bNmkEP2Q0na/AuEHQBLiF20RPggqjrTWq3sqJj7A9nagamyCYeSfv2vmlss1dL2pG7fS9/sKr3LoC8VPeLCnzpafEM4IBwY3HbKAc/2pqUxwNhkXFGo/2QzHVw4k6z7yKuACkxaAY1VZ/8OcblAvpyjthXO2Dsh3thWAMVAgdoSdN0+1KM1wQO100OK0yM+rLra3LDUNBWxuWq0VbnHw17Lvwg+ce2OCxP0dYOKEXgioXvz8=">
</div>

<script type="text/javascript">
//<![CDATA[
var theForm = document.forms['m_form'];
if (!theForm) {
    theForm = document.m_form;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>
</script>


<script type="text/javascript">
//<![CDATA[
function WebForm_OnSubmit() {

                $(':hidden.pwdplain').each(function(){ $(this).val( $( $('#' + $(this).attr('id').replace( '_pass', '' ))[ 0 ] ).val() ); });
                $(':hidden.pwdhash').each(function(){ $(this).val( NgbSecurity.HashString( $( $('#' + $(this).attr('id').replace( '_pass', '' ))[ 0 ] ).val() ) ); });
				$(':password').each( function() { $(this).val( '' ); } );
			
return true;
}
//]]>
</script>

<div class="aspNetHidden">

	<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="500148EA">
	<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="b5tIse1oQL0Rt+iXXBNAjA/UIhSUingeJCshL4M6fQ5rHoXghTN4HOG3ZG3y1r3/CdBwUDnoyLGv9rVz6gyWPzy8qsi4vNN9eK5SdYdmaphusxVheovrRqDjhiNizCdn6VgAewA3KQxOrM3gjSI42nab7KXEiGrhQK3wmTPNBLGDMMbN">
</div>
		<!-- width:610px;height:750px; -->
		 <!-- 실제 컨텐츠 영역 -->
		 
<script type="text/javascript">
	$(function () {
		$(".inputTxtSec input").bind("focusin", function () {
			if ($(this).parent().parent().attr("class").trim() == "inputWrap") {
				$(this).parent().parent().attr("class", "inputWrap focusWrap");
			}

			$(this).parent().next().children(".delBt").css("display", "block");
		});

		$(".delBt").bind("mousedown", function () {
			$(this).parent().prev().children("input").val("");
			$(this).parent().prev().children("input").focus();
			$(this).parent().parent().attr("class", "inputWrap");
			$(this).parent().parent().next(".errorMsg").html("");
		});

		$(".inputTxtSec input").bind("blur", function (e) {
			$(this).parent().next().children(".delBt").css("display", "none");
			$(this).parent().parent().removeClass("focusWrap");
		});

		$(document).mousedown(function (e) {
			$(".inputWrap").each(function () {
				var l_position = $(this).offset();
				l_position.right = parseInt(l_position.left) + ($(this).width());
				l_position.bottom = parseInt(l_position.top) + parseInt($(this).height());
				if ((l_position.left <= e.pageX && e.pageX <= l_position.right)
					&& (l_position.top <= e.pageY && e.pageY <= l_position.bottom))
				{ } else {
					$(this).removeClass("focusWrap");
					$(this).children(".inputAlertSec").children(".delBt").css("display", "none");
				}
			});
		});
	});
</script>

<script type="text/javascript">
	$(function () {

		var tabOrder = ["ucInputLoginID_txtInputID", "ucInputLoginID_btnNext"];
		TabOrder.SetTabOrder(tabOrder);

		var btnNexonClick = function btnNexonClick() {
            var $nexonID = $("#ucInputLoginID_txtInputID");
            $nexonID.val($.trim($nexonID.val()));	//입력필드 띄어쓰기는 자동 제거

            if ($nexonID.val() == "") {
				$("#errorMsg").html("넥슨ID(아이디 또는 이메일)를 입력해주세요.");
				$("#inputWrap").attr("class", "inputWrap errorInput");
				MemberA2S.Contents("MEMBERS_FIND_PW", "FPwdFail1");			//A063
				return false;
			}

			return true;
		}

		$("#ucInputLoginID_txtInputID").keydown(function (event) {
			if (event.keyCode == 13) {
				var returnValue = btnNexonClick();
				if (returnValue) {
					__doPostBack("ucInputLoginID$btnNext", "");
				}

				event.preventDefault();
			}
		});

		$("#ucInputLoginID_btnNext").bind("click", btnNexonClick);
	});
</script>
<div class="popupFind2">
	<ul class="find2Tab">
		<li class="id"><a href="/find/findid.aspx" finda2sopt="FindId">넥슨ID찾기</a></li>	<!-- A094 -->
		<li class="password"><a class="on">비밀번호찾기</a></li>
	</ul>
	<h2 class="hiddenTit">비밀번호찾기</h2>
	<div class="contents">
		<p class="stit">비밀번호 찾기를 위한 넥슨ID를 입력해주세요.</p>
		<div class="findPwSec">
			<dl class="findPwInput">
				<dt>넥슨ID</dt>
				<dd>
					<div class="inputCnts">
						<div id="inputWrap" class="inputWrap"> <!-- error color <div class="inputWrap errorInput"> --> <!-- success color <div class="inputWrap successInput"> -->
							<p class="inputTxtSec"><input name="ucInputLoginID$txtInputID" type="text" id="ucInputLoginID_txtInputID" class="inputTxt2 errorInput" placeholder="넥슨ID (아이디 또는 이메일)"></p>
							<div class="inputAlertSec">
								<p class="delBt" style="display:none;"><button type="button"><span class="hidden">입력삭제</span></button></p>
							</div>
						</div>
						<p id="errorMsg" class="errorMsg"></p>
					</div>
				</dd>
			</dl>
			<div class="btSec">
				<a id="ucInputLoginID_btnNext" class="bt3" finda2sopt="Cfm" href="javascript:__doPostBack('ucInputLoginID$btnNext','')">다음</a>		<!-- A021 -->
			</div>
		</div>
	</div>
	<div class="noticeSec">
		<ul>
            <li>외부계정(<a target="_blank" href="https://www.facebook.com/" class="link3" finda2sopt="GoFacebook">페이스북</a>, <a target="_blank" href="https://www.google.com/" class="link3" finda2sopt="GoGoogle">구글</a>, <a target="_blank" href="https://www.naver.com/" class="link3" finda2sopt="GoNaver">네이버</a>, <a target="_blank" href="https://www.apple.com/" class="link3" finda2sopt="GoApple">애플</a> 등)을 통해 넥슨에 로그인하시는 고객님은 해당 서비스에서 비밀번호 찾기를<br>이용해주세요.</li>	<!-- A482, A483 -->
		</ul>
	</div>	
</div>

<script type="text/javascript">MemberA2S.Contents("MEMBERS_FIND_PW", "EnterId");	//A020 </script>
		 
		 
		 
		 
		 
	

				<script type="text/javascript">
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
			</form>
	<script type="text/javascript" src="https://ssl.nexon.com/s1/global/ngb_bodyend.js" charset="euc-kr"></script><form name="formLogin" method="post" id="formLogin"></form>

</body>
</html>