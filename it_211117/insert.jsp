<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 생산 입력</title>
	<link rel="stylesheet" type="text/css" href="../css/prodict.css">
</head>
<body>
	<div id="product">
		
		<div id="findZone">
			<form name="frm_product" method="post">
				<input type="search" name="findStr" size="25">
				<input type="button" name="btnSearch" value="검색">
			</form>
			
			<div id="items">
			
				<div id="title">
					<span class="serial">serial</span>
					<span class="mdate">일자</span>
					<span class="code">제품코드</span>
					<span class="codeName">제품명</span>
					<span class="price">단가</span>
					<span class="ea">수량</span>
					<span class="amt">금액</span>
				</div>
				
				<div id="page">
					<input type="button" value="처음" id="btnFirst">
					<input type="button" value="이전" id="btnPrev">
					<input type="button" value="1">
					<input type="button" value="2">
					<input type="button" value="3">
					<input type="button" value="다음" id="btnNext">
					<input type="button" value="끝" id="btnLast">
				</div>
				
			</div>
			
		</div>
		
	</div>
	
	<script>product();</script>
</body>
</html>