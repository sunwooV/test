<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>금도끼은도끼|리뷰작성완료</title>
<style type="text/css">
.contentText {
	padding-top: 5%;
	font-size: 50px;
	text-align: center;
}

#button_ToOtherPage {
	text-align: center;
}

#button_ToOtherPage button {
	text-align: center;
	border: 1px solid gray;
	background-color: white;
	padding: 5px;
	border: 1px solid gray;
}

#button_ToOtherPage button:hover {
	color: white;
	background-color: black;
}

#StyleOfButton {
	background-color: #E4EsE4; width : 250px;
	height: 100px;
	font-size: 35px;
	text-align: center;
	border-top-left-radius: 5px;
	border-top-right-radius: 5px;
	border-bottom-left-radius: 5px;
	border-bottom-right-radius: 5px;
	width: 250px;
}

#ttl_content_payComplete {
	padding:10%;
}
</style>
</head>
<body>
<div id="ttl_content_changeProdComplete">
		<div class="contentText">
			리뷰작성이 완료되었습니다.<br> <br>
		</div>
		<div id="button_ToOtherPage">
			<input type="button" id="StyleOfButton" value="메인화면"
				onClick="location.href='${Path}/main.do'">
			&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="button"
				id="StyleOfButton" value="내가 쓴 리뷰보기" onClick="location.href='#'">
		</div>
	</div>
</body>
</html>