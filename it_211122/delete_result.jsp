<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리</title>
</head>
<body>
<%
String nowPage = request.getParameter("nowPage");
String findStr = request.getParameter("findStr");
%>

	<div id="member">
		
		<form>
			<output>저장되었습니다.</output>
		
			<div class="btnZone">
				<input type="button" value="목록" name="btnList">
			</div>
		</form>
		
		<input type="text" name="nowPage" value="<%=nowPage%>">
		<input type="text" name="findStr" value="<%=findStr %>">
	</div>
</body>
</html>