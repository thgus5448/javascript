<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view.jsp</title>
	<link rel="stylesheet" type="text/css" href="./css/prodict.css">
</head>
<body>

	<div id="product">
	
		<h2>제품 생산 입력</h2>
		
		<form name="frm_product" method="post">
			<label>제품코드</label>
				<input type="text" name="code" size="6">
				<input type="button" value="검색" name="btnFind">
			<br>
			<label>제품명</label>
				<input type="text" size="30" name="codeName" readonly="readonly">
			<br>
			<label>단가</label>
			<input type="text" name="price" readonly="readonly"> 
			
			<hr>
			
			<label>생산일자</label>
				<input type="date" name="mdate">
			<br>
			<label>수량</label>
				<input type="text" name="ea" size="5">
			
			<hr>
			
			<div id="btnZone">
				<input type="button" name="btnModify" value="수정">
				<input type="button" name="btnSava" value="삭제">
				<input type="button" name="btnList" value="목록">
			</div>
		</form>
		
	</div>
	
</body>
</html>