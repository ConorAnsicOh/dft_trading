 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8">
        <!-- meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"/ -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>회원가입!</title>
        <!-- Bootstrap -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한) -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container"><!-- 좌우측의 공간 확보 -->
            <!-- 헤더 들어가는 부분 -->
            
            <div class="row">
                <p></p>
                <div class="col-md-12">
                    <small>
                     회원가입!!
                    </small>
                </div>
            </div>
            <!--// 헤더 들어가는 부분 -->
            <!-- 모달창 -->
            <div class="modal fade" id="defaultModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title">알림</h4>
                        </div>
                        <div class="modal-body">
                            <p class="modal-contents"></p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
            <!--// 모달창 -->
            <hr/>
            <!-- 본문 들어가는 부분 -->
                
 
 
            <form class="form-horizontal" id="singform">
                <div class="form-group">
                    <label for="inputId" class="col-lg-2 control-label">아이디</label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control onlyAlphabetAndNumber" id="userId" name="userId"  data-rule-required="true" placeholder="아이디를 입력해주세요" maxlength="20">
	                    <div style="text-align: right;"><button type="button" class="btn btn-primary" onclick="isDuplicateCheck()">중복체크</button></div>
                    </div>
                </div>
                <div class="form-group" id="divPassword">
                    <label for="inputPassword" class="col-lg-2 control-label">패스워드</label>
                    <div class="col-lg-10">
                        <input type="password" class="form-control" id="userPw" name="userPw" data-rule-required="true" placeholder="패스워드" maxlength="20">
                    </div>
                </div>
                <div class="form-group" id="divPasswordCheck">
                    <label for="inputPasswordCheck" class="col-lg-2 control-label">패스워드 확인</label>
                    <div class="col-lg-10">
                        <input type="password" class="form-control" id="userPwdCheck" data-rule-required="true" placeholder="패스워드 확인" maxlength="20">
                    </div>
                </div>
                <div class="form-group" id="divName">
                    <label for="inputName" class="col-lg-2 control-label">이름</label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control onlyHangul" id="userNm" name="userNm" data-rule-required="true" placeholder="이름을 입력해주세요" maxlength="15">
                    </div>
                </div>
                
                <div class="form-group" id="divNickname">
                    <label for="inputNickname" class="col-lg-2 control-label">닉네임</label>
                    <div class="col-lg-10">
                        <input type="text" class="form-control" id="userNnm" name="userNnm" data-rule-required="true" placeholder="닉네임을 입력해주세요" maxlength="15">
                    </div>
                </div>
                
                <div class="form-group" id="divEmail">
                    <label for="inputEmail" class="col-lg-2 control-label">이메일</label>
                    <div class="col-lg-10">
                        <input type="email" class="form-control" id="userEmail" name="userEmail" data-rule-required="true" placeholder="이메일을 입력해주세요" maxlength="40">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-10" style="text-align: right;">
                        <button type="button" class="btn btn-primary" onclick="singUp()">Sign in</button>
                    </div>
                </div>
            </form>
          </div>  
</body>
<script type="text/javascript">

//유효성검사
function singUp(){
	if($("#userId").val() == "" ){
		alert("아이디를 입력해주세요!!");
		return false;
	}
	if($("#userPwd").val() == ""){
		alert("비밀번호를 입력해주세요!!");
		return false;
	}
	if($("#userPwdCheck").val() == ""){
		alert("비밀번호 확인를 입력해주세요!!");
		return false;
	}
	if($("#userPw").val() != $("#userPwdCheck").val()){
		alert("비밀번호가 맞지않습니다!!");
		return false;
	}
	if($("#userNm").val() == ""){
		alert("이름을 입력해주세요!!");
		return false;
	}
	if($("#userNnm").val() == ""){
		alert("닉네임을 입력해주세요!!");
		return false;
	}
	if($("#userEmail").val() == ""){
		alert("이메일을 입력해주세요!!");
		return false;
	}
	var singform = $('#singform');
	    $.ajax({
	        type: "post",
	        url: "/SgnSingUp", // 서버의 컨트롤러 엔드포인트
	        dataType:"text",
	        data: singform.serialize(), // 폼 데이터 직렬화하여 전송
	        success: function(response) {
	        	alert("회원가입 성공했습니다!!!!");
	        	window.location.href = "/Login";
	        },
	        error: function(xhr, status, error) {
	            // 요청이 실패했을 때 수행할 작업
	            console.error(error);
	        }
	    });
	 
}
//중복체크
function isDuplicateCheck(){
	var userid = $("#userId").val();
    $.ajax({
        type: "post",
        url: "/duplicateCheck", // 서버의 컨트롤러 엔드포인트
        data: {
        	userId : userid
        },
        success: function(response) {
          	if(response == userid ){
          		alert("중복된 아이디입니다.");
          	}else{
          		alert("사용가능한 아이디입니다.");
          	}
          	
        },
        error: function(xhr, status, error) {
            // 요청이 실패했을 때 수행할 작업
            console.error(error);
        }
    });
}

</script>
</html>