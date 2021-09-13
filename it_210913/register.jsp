<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>register.jsp</title>
	<link rel=stylesheet type="text/css" href="/WebProject/css/guestbook.css">
</head>
<body>

<div id="guestbook">
	<h1>방명록 작성</h1>
	<form name='frm_guestbook' method='post' 
		  action='register_result.jsp'>
		<label>작성자</label>
		<input type='text' name='mid' value='유다현' required="required"/>
		
		<label>작성일</label>
		<input type='date' name='mdate' value='2021-08-27' readonly='readonly'/>
		
		<br/>
		
		<textarea name='doc' cols='80' rows='10' placeholder='200자 이하'></textarea>
		
		<br/>
		
		<label>암호</label>
		<input type='password' name='pwd' />
		<br>
		<input type='submit' value='작성'/>
	</form>
</div>
</body>
</html>