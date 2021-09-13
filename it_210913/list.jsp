<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>list.jsp</title>
	<link rel="stylesheet" type="text/css" href="/WebProject/css/guestbook.css">
</head>
<body>

	<div id="guestbook_list"> <!-- 전체영역 -->
	
		<h1>방명록 조회</h1>
		
		<form>
			<input type="search" name="findStr" placeholder="검색어를 입력하세요.">
			<input type="submit" value="검색">
		</form>
		
		
		<div class="items">
			
			<div class="item">	<!-- 방명록1 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1">
				</label>
			</div>
			
			<div class="item"> <!-- 방명록2 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1">
				</label>
			</div>
			
			<div class="item"> <!-- 방명록3 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1">
				</label>
			</div>
			
			<div class="item"> <!-- 방명록4 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1">
				</label>
			</div>
			
			<div class="item"> <!-- 방명록5 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1">
				</label>
			</div>
			
			<div class="item"> <!-- 방명록6 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1">
				</label>
			</div>
			
			<div class="item"> <!-- 방명록7 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1">
				</label>
			</div>
			
			<div class="item"> <!-- 방명록8 -->
				<output>홍길동</output>
				<output>2021-08-30</output>
				<br>
				<textarea name="doc" rows="7" cols="50"></textarea>
				<label>
				<br>
					삭제<input type="checkbox" name="del1' value="1" >
				</label>
			</div>
		</div>	
		
			<br>
			
			<div class="btns"> <!-- 버튼 -->
				<input type="button" value="<이전">
				<input type="button" value="처음으로">
				<input type="button" value="다음>">
			</div>
			
		<input name="del_btn" type="button" value="체크항목 삭제">
		
		
		
	</div>
</body>
</html>