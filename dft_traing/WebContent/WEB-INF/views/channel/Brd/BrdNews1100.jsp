<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     
<!DOCTYPE html >
<html lang="ko" class="os_windows chrome pc version_121_0_0_0 ">
<head>

<style>
.head_top {
    display: flex;
    justify-content: space-between;
    align-items: center;
}
li {
    width: auto;
    display: block; /* 수직으로 배치하도록 설정 */
}
.right-content {
    width: 350px;
    float: right;
    padding-left: 20px;
    box-sizing: border-box;
    background-color: #fff; /* 흰색 배경 색상을 지정합니다. */
    height: 200px; /* 영역의 높이를 500px로 지정합니다. */
    overflow: auto; /* 내용이 영역을 벗어날 경우 스크롤바가 표시되도록 설정합니다. */
}
/* 추가 내용의 제목 스타일 */
.right-content h2 {
    font-size: 24px; /* 제목의 글꼴 크기를 조정합니다. */
    color: #333; /* 제목의 글꼴 색상을 지정합니다. */
    margin-bottom: 10px; /* 제목 아래 여백을 추가합니다. */
}

/* 추가 내용의 본문 스타일 */
.right-content p {
    font-size: 16px; /* 본문의 글꼴 크기를 조정합니다. */
    color: #666; /* 본문의 글꼴 색상을 지정합니다. */
    line-height: 1.5; /* 본문의 줄 간격을 조정합니다. */
}
</style>
<meta charset="utf-8">
<meta name="referrer" content="always" />

<meta property="og:author" content="Daum 뉴스" />
<meta property="og:site_name" content="다음뉴스" />
<meta property="og:title" content="홈"/>
<meta property="og:image" content="https://t1.daumcdn.net/media/img-media/mobile/meta/news.png" />
<meta property="og:description" content="다음뉴스" />
<meta property="og:url" content="https://news.daum.net/" />
<link rel="shortcut icon" href="https://m2.daumcdn.net/img-media/2010ci/Daum_favicon.ico">

<title>Dft News</title>

<meta http-equiv="X-UA-Compatible" content="IE=edge">

<link rel="stylesheet" type="text/css" href="//t1.daumcdn.net/media/kraken/news/402cee8/style.css.merged.css" />
<link rel="stylesheet" type="text/css" href="//t1.daumcdn.net/media/kraken/news/402cee8/calendar.css.merged.css" />

<script src="//t1.daumcdn.net/media/kraken/news/402cee8/common.merged.js"></script>

<script type="text/javascript" src="https://t1.daumcdn.net/tiara/js/v1/tiara.min.js"></script>

<script>
$(document).ready(function() {
    $(".news_Link").click(function(event) {
        event.preventDefault(); // 기본 이벤트(링크 이동) 중단
        
        var newsId = $(this).data("news-id"); // 클릭한 링크의 ID 가져오기
        
        // 링크의 URL을 미리 저장해둡니다.
        var linkHref = $(this).attr("href");
        
        // AJAX 요청을 보내 조회수를 증가시킵니다.
        var clickedLink = $(this); // 클릭한 링크 객체를 변수에 저장
        $.ajax({
            type: "POST",
            url: "/news/increaseCount", // 조회수 증가를 처리할 서버의 URL
            data: { newsId: newsId }, // 클릭한 뉴스의 ID를 서버에 전달합니다.
            success: function(response) {
                console.log("조회수 증가 완료");
                // AJAX 요청이 성공한 후, 클릭한 링크의 URL로 이동합니다.
                window.location.href = linkHref; // 저장해둔 링크 URL로 이동
            },
            error: function(xhr, status, error) {
                console.error("에러 발생:", error);
            }
        });
    });
});
</script>
        <script src="//t1.daumcdn.net/media/kraken/news/402cee8/homeMain.merged.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<%
    String userNm = (String) session.getAttribute("userNm");
%>

<div class="container-doc">
<header class="doc-header">
    <!-- head_top -->
    
    <div class="head_top">
        <h1 class="doc-title">
            <a href="https://www.daum.net/" class="link_daum" data-tiara-layer="gnb default logo">
                <img src="//t1.daumcdn.net/media/common/newsview_2021/pc/rtn/logo_daum.png" width="44" height="18" class="logo_daum" alt="Daum">
            </a>
            <a href="https://news.daum.net/" id="kakaoServiceLogo" data-tiara-layer="GNB service news">
                <span class="ir_wa">뉴스</span>
            </a>
		<c:choose>
		    <c:when test="${userNm != null}">
		        <h3><%= userNm %>님 반갑습니다!</h3>
		        <h3> <a href="/logout">로그아웃</a></h3>
		    </c:when>
		    <c:otherwise>
		        <h3>
		            <a href="/Login" style="margin-right:20px;">로그인</a>
		            <a href="/SingUp">회원가입</a>
		        </h3>
		    </c:otherwise>
		</c:choose>
        </h1>
        <strong class="screen_out">관련 서비스</strong>
<div id="wrapMinidaum"></div>

<script src="https://go.daum.net/minidaum_pc.daum"></script>
    </div> <!-- //head_top -->
</header>
<main class="doc-main" style="margin-right: 250px;">
    <section class="inner-main">
        <h2 id="mainContent" class="screen_out">홈</h2>
        <div class="main-content">
        <div class="content-article">
        <div class="box_g box_news_issue" data-tiara-layer="headline">
        <h3 class="screen_out">이슈 기사 목록</h3>
        <ul class="list_newsissue">
		<!-- 최대 카운트를 가진 항목 찾기 -->
		<c:set var="maxCount0" value="0" />
		<c:set var="maxNewsItem0" value="" />
		
		<!-- 최대 카운트를 가진 항목 찾기 -->
		<c:forEach var="newsItem" items="${NewsD}">
		    <c:if test="${newsItem.newsCount > maxCount0}">
		        <c:set var="maxCount0" value="${newsItem.newsCount}" />
		        <c:set var="maxNewsItem0" value="${newsItem}" />
		    </c:if>
		</c:forEach>

		<c:forEach var="news" items="${NewsD}" varStatus="loop">
		    <c:if test="${news ne maxNewsItem0}">
			<li>
	            <div class="item_issue" data-tiara-layer="headline1">
	                    <a href="${news.newsLink}"  class="wrap_thumb" data-tiara-layer="article_main" data-tiara-id="20240228145406463" data-tiara-type="harmony" data-tiara-ordnum="1" data-tiara-custom="contentUniqueKey=hamny-20240228145406463&clusterId=5590543,5889430,5150091,5139529&clusterTitle=[언론사픽] 주요뉴스,사회,섹션 실시간뉴스-사회,[랭크업] 유레이더 1 OR 2 추가점수&keywordType=NONE,NONE,NONE,NONE">
	                        <img src="${news.newsImage}" class="thumb_g" alt=""“20살 되자마자 생활비 30만원 내라는 엄마… 막막하다”">
	                    </a>
	                <div class="cont_thumb">
	                <span class="info_thumb">
	                    <span class="logo_cp">
	                            <img src="https://t1.daumcdn.net/media/news/news2016/cp/cp_kukminilbo.gif" class="thumb_g" alt="국민일보" onerror="this.style.display='none';">
	                    </span>
	                    <span class="txt_category">사회</span>
	                </span>
	                    <strong class="tit_g">
	                        <a href="${news.newsLink}" data-news-id="${news.newsId}" class="link_txt news_Link" data-tiara-layer="article_main" data-tiara-id="20240228145406463" data-tiara-type="harmony" data-tiara-ordnum="1" data-tiara-custom="contentUniqueKey=hamny-20240228145406463&clusterId=5590543,5889430,5150091,5139529&clusterTitle=[언론사픽] 주요뉴스,사회,섹션 실시간뉴스-사회,[랭크업] 유레이더 1 OR 2 추가점수&keywordType=NONE,NONE,NONE,NONE">
	                            ${news.newsTitle}
	                        </a>
	                    </strong>
	                </div>
	            </div>
	        </li>
		</c:if>
	</c:forEach>
   </ul>
 </div>
</div>
   <!-- 오른쪽 영역 -->
<c:set var="maxCount" value="0" />
<c:set var="maxNewsItem" value="" />
<c:forEach var="newsItem" items="${NewsD}">
    <c:if test="${newsItem.newsCount > maxCount}">
        <c:set var="maxCount" value="${newsItem.newsCount}" />
        <c:set var="maxNewsItem" value="${newsItem}" />
    </c:if>
</c:forEach>

		<c:if test="${not empty maxNewsItem}">
              <div class="right-content">
              <ul>
                 <li>
	            <div class="item_issue" data-tiara-layer="headline1">
	                    <a href="${maxNewsItem.newsLink}"  class="wrap_thumb" data-tiara-layer="article_main" data-tiara-id="20240228145406463" data-tiara-type="harmony" data-tiara-ordnum="1" data-tiara-custom="contentUniqueKey=hamny-20240228145406463&clusterId=5590543,5889430,5150091,5139529&clusterTitle=[언론사픽] 주요뉴스,사회,섹션 실시간뉴스-사회,[랭크업] 유레이더 1 OR 2 추가점수&keywordType=NONE,NONE,NONE,NONE">
	                        <img src="${maxNewsItem.newsImage}" class="thumb_g" alt=""“20살 되자마자 생활비 30만원 내라는 엄마… 막막하다”">
	                    </a>
	                <div class="cont_thumb">
	                <span class="info_thumb">
	                    <span class="logo_cp">
	                            <img src="https://t1.daumcdn.net/media/news/news2016/cp/cp_kukminilbo.gif" class="thumb_g" alt="국민일보" onerror="this.style.display='none';">
	                    </span>
	                    <span class="txt_category">사회</span>
	                </span>
	                    <strong class="tit_g">
	                        <a href="${maxNewsItem.newsLink}" data-news-id="${maxNewsItem.newsId}" class="link_txt news_Link" data-tiara-layer="article_main" data-tiara-id="20240228145406463" data-tiara-type="harmony" data-tiara-ordnum="1" data-tiara-custom="contentUniqueKey=hamny-20240228145406463&clusterId=5590543,5889430,5150091,5139529&clusterTitle=[언론사픽] 주요뉴스,사회,섹션 실시간뉴스-사회,[랭크업] 유레이더 1 OR 2 추가점수&keywordType=NONE,NONE,NONE,NONE">
	                            ${maxNewsItem.newsTitle}
	                        </a>
	                    </strong>
	                </div>
	            </div>
	        </li>
      </ul>
     </div>
     </c:if>
</div>
</section>
</main>
<footer id="kakaoFoot" class="doc-footer">
    <div class="inner_foot #FOOTER" data-tiara-layer="FOOTER">
        <div class="direct_link #direct" data-tiara-layer="direct">
            <h2 class="tit_direct">바로가기</h2>
            <div class="item_bundle">
                <a href="/" class="link_txt #direct_newshome" data-tiara-layer="direct_newshome">뉴스홈</a>
                <a href="/society" class="link_txt #direct_society" data-tiara-layer="direct_society">사회</a>
                <a href="/politics" class="link_txt #direct_politics" data-tiara-layer="direct_politics">정치</a>
                <a href="/economic" class="link_txt #direct_economic" data-tiara-layer="direct_economic">경제</a>
                <a href="/foreign" class="link_txt #direct_foreign" data-tiara-layer="direct_foreign">국제</a>
                <a href="/culture" class="link_txt #direct_culture" data-tiara-layer="direct_culture">문화</a>
                <a href="/digital" class="link_txt #direct_digital" data-tiara-layer="direct_digital">IT</a>
                <a href="/photo" class="link_txt #direct_photo" data-tiara-layer="direct_photo">포토</a>
            </div>
            <div class="item_bundle">
                <a href="/cp" class="link_txt #direct_media" data-tiara-layer="direct_media">제휴 언론사</a>
            </div>
            <div class="item_bundle">
                <a href="/newsbox" class="link_txt #direct_history" data-tiara-layer="direct_history">배열이력</a>
            </div>
            <div class="item_bundle">
                <a href="/breakingnews" class="link_txt #direct_all" data-tiara-layer="direct_all">전체뉴스</a>
                <a href="/series" class="link_txt #direct_series" data-tiara-layer="direct_series">연재</a>
                <a href="https://focus.daum.net/ch/news/factcheck" class="link_txt #direct_factcheck" data-tiara-layer="direct_factcheck">팩트체크</a>
            </div>
            <button type="button" class="btn_fold"><span class="ico_news">바로가기 링크 더보기/접기</span></button>
        </div>
        <h2 class="screen_out">서비스 이용정보</h2>
        <div class="footer_link">
            <a href="/info/intro" class="link_info #info_daumnews" data-tiara-layer="info_daumnews">다음뉴스 소개</a>
            <span class="txt_dot"> ? </span> <a href="https://magazine.daum.net/daumnews_notice" class="link_info #notice" data-tiara-layer="notice">공지사항</a>
            <span class="txt_dot"> ? </span> <a href="/info/bbsrule" class="link_info #bbsrule" data-tiara-layer="bbsrule">게시물 운영원칙</a>
            <span class="txt_dot"> ? </span> <a href="http://policy.daum.net/info/info" class="link_info #policy" data-tiara-layer="policy">서비스 약관/정책</a>
            <span class="txt_dot"> ? </span> <a href="https://with.kakao.com/media" class="link_info #harmony" data-tiara-layer="harmony">뉴스제휴</a>
            <span class="txt_dot"> ? </span> <a href="https://business.kakao.com" class="link_info #adinfo" data-tiara-layer="adinfo">비즈니스</a>
            <span class="txt_dot"> ? </span> <a href="https://cs.daum.net/redbell/top.html" class="link_info #redbell" data-tiara-layer="redbell">권리침해신고</a>
            <span class="txt_dot"> ? </span> <a href="http://cs.daum.net/faq/63.html" class="link_info #consumer" data-tiara-layer="consumer">다음뉴스 고객센터</a>
        </div>
        <div class="footer_link"> <a href="/info/newscenter24" class="link_info #newscenter" data-tiara-layer="newscenter">24시간 뉴스센터</a>
            <span class="txt_dot"> ? </span> <a href="/info/edit" class="link_info #edit" data-tiara-layer="edit">서비스원칙</a>
            <span class="txt_dot"> ? </span> <a href="/info/correct" class="link_info #correct" data-tiara-layer="correct">고침기사, 정정?반론?추후보도 모음</a>
            <span class="txt_dot"> ? </span> <span class="link_info">기사배열책임자 : 황유지</span> <span class="txt_dot"> ? </span>
            <span class="link_info">청소년보호책임자 : 손성희</span>
        </div>
        <div class="info_copyright">
            <strong class="info_warn">뉴스 기사에 대한 저작권 및 법적 책임은 자료제공사 또는 <br>글쓴이에 있으며, Kakao의 입장과 다를 수 있습니다.</strong>
            <small class="txt_copyright">Copyright ⓒ <strong class="txt_kakao"><a href="http://www.kakaocorp.com/" class="link_kakao">Kakao Corp.</a></strong> All rights reserved.</small>
        </div>
    </div>
</footer>

<script src="//t1.daumcdn.net/media/kraken/news/402cee8/footer.merged.js"></script>
    <script async type="text/javascript" src="//t1.daumcdn.net/kas/static/ba.min.js"></script>
</div>
</body>
</html>