<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String nowPage = request.getParameter("nowPage");
String findStr = request.getParameter("findStr");
%>

	<h2>회원관리</h2>
		
		<form name="frm_member" method="post">
			<label>아이디</label>
			<input type="button" value="입력" name="btnInsert">
			<input type="text" name="mid" value="you" size="5">
			<input type="text" name="btnIdCheck" value="중복체크">
			<br>
			<label>성명</label>
			<input type="text" name="irum" value="유씨">
			<br>
			<label>암호</label>
			<input type="password" name="pwd" size="12">
			<br>
			<label>연락처</label>
			<input type="text" name="phone">
			<br>
			<label>주소</label>
			<input type="text" name="zip" size="4" readonly>
			<input type="text" size="60" name="address">
			<br>
			<label>상세주소</label>
			<input type="text" size="60" name="address2">
			<br>
			
			<div class="btnZone">
				<input type="button" value="수정" name="btnSave">
				<input type="button" value="삭제" name="btnDelete">
				<input type="button" value="목록" name="btnList">
			</div>
			
			<img src="http://placeholder.it/250x300">
			<input type="file" name="photo">
			
			<input type="text" name="nowPage" value="<%=nowPage%>">
			<input type="text" name="findStr" value="<%=findStr %>">
		</form>
</body>
</html>