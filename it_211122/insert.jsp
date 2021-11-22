<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="./css/member.css"> 
	<link src="https://postcode.map.daum.net/guide">
	<title>회원관리</title>
</head>
<body>
<%
String nowPage = request.getParameter("nowPage");
String findStr = request.getParameter("findStr");
%>
	<div id="member">
		<h2>회원관리</h2>
		
		<form name="frm_member" method="post">
			<label>아이디</label>
			<input type="text" name="mid" value="you" size="5">
			<input type="text" name="btnIdCheck" value="중복체크">
			<br>
			<label>성명</label>
			<input type="text" name="irum" value="유씨">
			<br>
			<label>암호</label>
			<input type="password" name="pwd" size="12">
			<br>
			<label>암호확인</label>
			<input type="password" name="pwd2" size="12">
			<br>
			<label>연락처</label>
			<input type="text" name="phone">
			<br>
			<label>주소</label>
			<input type="text" name="zip" size="4" readonly name="zip">
			<input type="button" name="btZip" value="우편번호" name="btnZip">
			<br>
			<input type="button" size="60" name="address1">
			<br>
			<label>상세주소</label>
			<input type="text" size="60" name="address2">
			<br>
			
			<div class="btnZone">
				<input type="button" value="저장" name="btnSave">
				<input type="button" value="목록" name="btnList">
			</div>
			
			<img src="http://placeholder.it/200x250"
					 width="200" height="250" id="photo">
			<input type="file" name="btnPhoto">
			
			<input type="text" name="nowPage" value="<%=nowPage%>">
			<input type="text" name="findStr" value="<%=findStr %>">
		</form>
		
	</div>
	
	<script>member()</script>
	
</body>
</html>