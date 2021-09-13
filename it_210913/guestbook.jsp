<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
	<meta charset="UTF-8">
	<title>guestbook.jsp</title>
	<style type="text/css">
		
	</style>
</head>

<body>
	<h1>방명록 작성</h1>
	
	<form name="frm_guestbook" method="post" action="register_result.jsp">
		
		<label>작성자</label>
		<input type="text" name="v_wirter" placeholder="홍길동"
		required="required">
		<!-- required : 필수작성 -->
		
		<label>작성일</label>
		<input type="date" name="v_date" value="2021-08-27"
		readonly="readonly">
		
		<br>
		
		<textarea name="v_memo" rows="5" cols="70" minlength="8" maxlength="400"
		placeholder="8자 이상 400자 이하로 작성해주세요."></textarea>
		
		<br>
		
		<label>암호</label>
		<input type="password" name="v_psd"> 
		
		<input type="submit" value="작성"> 
		
	</form>
</body>
	
</html>