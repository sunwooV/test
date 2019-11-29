<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="Path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script type="text/javascript">
	var removedItem, sum = 0;

	$(function() {
		// calculate the values at the start
		calculatePrices();

		// Click to remove an item
		$(document).on("click", "a.remove", function() {
			removeItem.apply(this);
		});

		// Undo removal link click
		$(document).on("click", ".removeAlert a", function() {
			// insert it into the table
			addItemBackIn();
			//remove the removal alert message
			hideRemoveAlert();
		});

		$(document).on("change", "input.quantity", function() {
			var val = $(this).val(), pricePer, total

			if (val <= "0") {
				removeItem.apply(this);
			} else {
				// reset the prices
				sum = 0;

				// get the price for the item
				//pricePer = $(this).parents("td").prev("td").text();
				pricePer = $(this).val(); //this가 이벤트 호출한 객체 - quantity 달린 거 호출함

				// set the pricePer to a nice, digestable number
				pricePer = formatNum(pricePer);
				// calculate the new total
				total = parseFloat(val * pricePer).toFixed(2);
				// set the total cell to the new price
				$(this).parents("td").siblings(".itemTotal").text(total + "원");

				// recalculate prices for all items
				calculatePrices();
			}
		});

	});

	function removeItem() {
		// store the html
		removedItem = $(this).closest("tr").clone();
		// fade out the item row
		$(this).closest("tr").fadeOut(500, function() {
			$(this).remove();
			sum = 0;
			calculatePrices();
		});
		// fade in the removed confirmation alert
		$(".removeAlert").fadeIn();

		// default to hide the removal alert after 5 sec
		setTimeout(function() {
			hideRemoveAlert();
		}, 5000);
	}

	function hideRemoveAlert() {
		$(".removeAlert").fadeOut(500);
	}

	function addItemBackIn() {
		sum = 0;
		$(removedItem).prependTo("table.items tbody").hide().fadeIn(500)
		calculatePrices();
	}

	function updateSubTotal() {
		$("table.items td.itemTotal").each(function() {
			var value = $(this).text();
			// set the pricePer to a nice, digestable number
			value = formatNum(value);

			sum += parseFloat(value);
			$("table.pricing td.subtotal").text(sum.toFixed(2) + "원");
		});
	}

	function addTax() {
		var tax = parseFloat(sum * 0.1).toFixed(2);
		$("table.pricing td.tax").text(tax + "원");
	}

	function calculateTotal() {
		var subtotal = $("table.pricing td.subtotal").text(), tax = $(
				"table.pricing td.tax").text(), shipping = $(
				"table.pricing td.shipping").text(), total;

		subtotal = formatNum(subtotal);
		tax = formatNum(tax);
		shipping = formatNum(shipping);

		total = (subtotal + tax + shipping).toFixed(2);

		$("table.pricing td.orderTotal").text(total + "원");
	}

	function calculatePrices() {
		updateSubTotal();
		addTax();
		calculateTotal();
	}

	function formatNum(num) {
		return parseFloat(num.replace(/[^0-9-.]/g, ','));
	}
	
	function moveToPayInfo(){
		
		
	}
</script>
<style type="text/css">
.orderHistoryContainer {
	/* padding: 위 오른쪽 아래 왼쪽;*/
	padding: 1% 15% 10% 15%;
}

.orderHistoryHeader {
	padding-top: 3%;
	margin-left: 15%;
}

.OHT_ttl, .OHC_cont {
	font-size: 13px;
	padding: 0.5%;
	text-align: center;
	border-bottom: 1px solid lightgray;
}

.orderHistoryTable {
	text-align: center;
	width: -webkit-fill-available;
	border-top: 1px solid lightgray;
	border-collapse: collapse;
}

.OHtableTitle {
	background-color: #ccc;
}

</style>
</head>
<body>
<input type="hidden" id="memberId" value="${member.getMemberid() }">
	<!-- 주문내역 상단 -->
	<div class="orderHistoryHeader">
		<h3>장바구니</h3>
	</div>
	<div class="orderHistoryContainer">
		<!-- 주문 상품 정보 테이블 시작  -->
		<table class="orderHistoryTable" id="orderHistoryTable">
			<!-- 주문 상품 정보 테이블 상단 제목   -->
			<thead class="orderHistoryTableTitles">
				<tr class="OHtableTitle">
					<th class="OHT_ttl"><span>상품번호</span></th>
					<th class="OHT_ttl"><span>상품이미지</span></th>
					<th class="OHT_ttl"><span>상품정보</span></th>
					<th class="OHT_ttl"><span>수량</span></th>
					<th class="OHT_ttl"><span>상품금액</span></th>
					<th class="OHT_ttl"><span>배송비</span></th>
				</tr>
			</thead>
			<tbody>
				<!-- 첫 번째 상품 내용 cif 처리하기 -->
					<c:forEach var="myLikeProd" items="${myLikeProd }">
				<tr class="orderHistoryContents">
					<td class="OHC_cont"><span class="prod_number" id="prod_number">0000-000</span></td>
					<td class="OHC_cont"><span class="prod_1st_img" id="prod_1st_img">상품 이미지</span></td>
					<td class="OHC_cont"><span class="prod_short_detail" id="prod_short_detail">상품 정보 설명들어감 제목 + 선택한 옵션</span></td>
					<td class="OHC_cont"><span class="prod_cnt" id="prod_cnt">2</span></td>
					<td class="OHC_cont"><span class="ttl_eachProd_price" id="ttl_eachProd_price">29,000원</span></td>
					<td class="OHC_cont"><span class="shippingFee" id="shippingFee">2,500원</span></td>

				</tr>
				</c:forEach>
				<!-- 2번째 상품 내용 -->
			</tbody>
		</table>
	</div>

		<div class="cost">
			<h2>예상 결제 내역</h2>
		</div>
		<div class="row" id="cart">
			<table class="pricing">
				<tbody>
					<tr>
						<td>예상 결제 금액</td>
						<td class="subtotal"></td>
					</tr>
					<tr>
						<td>부가가치세(10%)</td>
						<td class="tax" ></td>
					</tr>
					<tr>
						<td>배송비</td>
						<td class="shipping">2500원</td>
					</tr>
					<tr>
						<td><strong>총 금액</strong></td>
						<td class="orderTotal"></td>
					</tr>
				</tbody>
			</table>
		</div>
		<button class="cta" onClick="moveToPayInfo()">주문하기 &raquo;</button>
	</div>

	<!-- End Content -->
</body>
</html>