<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%
	String id = request.getParameter("memberId");
	if (id != null && id.equals("madevirus")) {
		response.sendRedirect("/chap03/src/main/webapp/index.jsp"); //경로 지정 필요
	} else {
%>
		<html>
			<head><title>로그인 실패</title></head>
			<body>잘못된 아이디입니다.</body>
		</html>
<%
	}
%>