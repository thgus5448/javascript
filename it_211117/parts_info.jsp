<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품코드 조회</title>
</head>
<body>

	<form name="frm_parts" method="post">
		<input type="search" name="findParts"
						paleholder="제품코드나 제품명을 입력하세요">
		<input type="button" value="검색" id="btnFindParts">
		<br>
		<select name="parts" size="">
			<option value="tv">TV</option>
			<option value="com">컴퓨터</option>
			<option value="mouse">마우스</option>
		</select>
	</form>
	
</body>
</html>