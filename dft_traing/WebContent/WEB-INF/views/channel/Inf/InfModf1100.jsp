<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0"/ -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>정보수정</title>
<!-- Bootstrap -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한) -->
<script src="http://code.jquery.com/jquery.js"></script>
<!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<%
String userNnm = (String) session.getAttribute("userNnm");
String userId = (String) session.getAttribute("userId");
%>
<body>
	<div class="container"><!-- 좌우측의 공간 확보 -->
	<!-- 헤더 들어가는 부분 -->
		<div class="row">
			<p></p>
			<div class="col-md-12">
				<small>
					정보수정
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
		<div class="form-group" id="divId">
			<label for="userNnm" class="col-lg-2 control-label">닉네임 (현재 : ${userNnm})</label>
			<div class="col-lg-10">
				<input type="text" class="form-control onlyAlphabetAndNumber" id="userNnm"  data-rule-required="true" placeholder="변경할 닉네임을 입력해주세요" maxlength="20">
			</div>
		</div>
		<div class="form-group">
			<div class="col-lg-offset-2 col-lg-10" style="text-align: right;">
				<button type="button" class="btn btn-primary" onclick="changeNnm()">변경</button>
			</div>
		</div>
		<div class="form-group" id="divEmail">
			<div class="d-flex justify-content-around">
				<div class="col">
					<label>변경할 사진</label>
					<br>
					<img id="preview" src="#" height=300 width=240 alt="선택된 이미지가 없습니다">
				</div>
				<div class="col">
					<label>현재 사진</label>
					<br>
					<% 
				        byte[] userImg = (byte[]) session.getAttribute("userImg");
				        if (userImg != null) {
				            String base64Image = javax.xml.bind.DatatypeConverter.printBase64Binary(userImg);
				    %>
				    <img src="data:image/jpeg;base64, <%= base64Image %>" alt="Image" height="300" width="240">
				    <% } %>
				</div>
			</div>
			<!-- <div class="col-lg-10">
				<input type="file" name="imgFile" onchange="readURL(this);"/>
				<img id="preview" src="#" width=120 height=150 alt="선택된 이미지가 없습니다" style="align-content: flex-end; ">
			</div> -->
		</div>
		<div class="form-gorup">
			<input type="file" name="imgFile" onchange="readURL(this);"/>
		</div>
		<div class="form-group">
			<div class="col-lg-offset-2 col-lg-10" style="text-align: right;">
				<button type="button" class="btn btn-primary" onclick="changeImg()">변경</button>
			</div>
		</div>
		<br>
		<br>
		<div class="form-group">
			<div class="col-lg-offset-2 col-lg-10" style="text-align: right;">
				<button type="button" class="btn btn-primary" onclick="goMain()">돌아가기</button>
			</div>
		</div>
	</div>
</body>
<script src="js/commonDft.js"></script>
<script type="text/javascript">

function readURL(input) {
	var file = input.files[0];
	
	if (file != '') {
		var reader = new FileReader();
		
		reader.readAsDataURL(file);
		
		reader.onload = function (e) {
			$('#preview').attr('src', e.target.result);
		}
	}
}

function changeImg() {
	var fileInput = document.querySelector('input[type="file"]');
    var file = fileInput.files[0];

    // FormData 객체 생성
    var formData = new FormData();
    formData.append("file", file);
    
    $.ajax({
        url: "/modifyImgAjax",
        type: "POST",
        data: formData,
        processData: false,
        contentType: false,
        success: successInfModf1100,
        error: errorInfModf1100
    });
}

function goMain(){
	movePage("/");
}

function ajaxModf1100(){
	var userId = '<%= userId %>';
	
	var param = {
			userNnm : $("#userNnm").val(),
			userId : userId
	}
	callAjax("/modifyNnmAjax", param, successInfModf1100, errorInfModf1100);
}

function successInfModf1100(data){
	alert("변경이 완료되었습니다.");
	window.location.reload();
}

function errorInfModf1100(xhr, status, error){
	alert(error);
}

//유효성검사
function changeNnm(){
	if($("#userNnm").val() == ""){
		alert("변경할 닉네임이 기입되지 않았습니다.");
		return false;
	}
	
	ajaxModf1100();
}

</script>
</html>