// 팝업 호출 함수
function popOpen(url, width, height){
    var leftPosition, topPosition;
    // 화면 중앙에 위치시키기 위한 좌표 계산
    leftPosition = (window.screen.width - width) / 2;
    topPosition = (window.screen.height - height) / 2;

    // 팝업 창 열기
    window.open(url, 'popup', 'width=' + width + ', height=' + height + ', top=' + topPosition + ', left=' + leftPosition);
}

// 화면 이동 함수
function movePage(url, scrollbars, replace){
    var features = "";
    // 스크롤바 특성 추가
    if (scrollbars) {
        features += "scrollbars=yes,";
    }
    // replace 옵션 추가
    if (replace) {
        features += "replace=true";
    }

    // 새 창 열기
    window.open(url, "_blank", features);
}

// 입력값이 null인지 체크
function isNull(input){
	if(input.value == null || input.value == ""){
		return true;
	}else{
		return false;
	}
}

// 콤마 삭제
function removeComma(input){
	return input.value.replace(/,/gi,"");
}