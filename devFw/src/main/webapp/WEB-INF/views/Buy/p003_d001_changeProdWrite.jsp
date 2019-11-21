<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="Path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>금도끼은도끼|교환사유작성</title>
<script type="text/javascript">
	//작성완료된 교환사유를 넘기는 함수
	function submitChangeProdReason() {
		window.location.href="${Path}/changeProductComplete.do";

		//출처: https://jdkblog.tistory.com/58 [JDK's blog]
	}
	//작성취소 후 이전화면으로 가기
	function cancelChangeProd() {

	}

	//결재한 상품목록 가져오기 - select box option으로 
	function findBuyProd() {

	}
</script>
<style type="text/css">
.changeProdWrite {
	text-align: center;
}

.changeReason {
	width: 700px;
	height: 400px;
}

.changeProdHeader {
	text-align: center;
	padding: 3%;
}

.changeProdButton {
	text-align: center;
	padding: 3%;
}

.changeProdButton button {
	width: 100px;
	height: 30px;
	background-color: darkgray;
	color: white;
}
.optionForbuyProd, .changeProdTitle {
	text-align: left;
	margin-left: 32%;
	padding-bottom: 1%;
}

.selectBuyProd, .input_changeProdTitle {
	width: 500px;
}

</style>
</head>
<body>
	<div id="changeProdHeader" class="changeProdHeader">
		<h2>환불 및  교환 사유 작성</h2>
	</div>
	<div class="changeProdTitle">
		글 제목 : &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="text" id="input_changeProdTitle" class="input_changeProdTitle">
	</div>
	
	<div id="optionForbuyProd" class="optionForbuyProd">
		해당 상품 선택 : &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<select name="selectBuyProd" class="selectBuyProd" id="selectBuyProd">
			<option value="prodHistory"></option>
			<option value="prodHistory"></option>
			<option value="prodHistory"></option>
			<option value="prodHistory"></option>
		</select>
	</div>

	<div id="changeProdWrite" class="changeProdWrite">
		<textarea id="changeReason" class="changeReason"
			placeholder="반품하시는 사유를 작성해주세요.">
</textarea>
	</div>
	<div class="changeProdButton" id="changeProdButton">
		<button onClick="submitChangeProdReason()">작성 완료</button>
		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<button onClick="cancelChangeProd()">교환 취소하기</button>
	</div>

</body>
</html>