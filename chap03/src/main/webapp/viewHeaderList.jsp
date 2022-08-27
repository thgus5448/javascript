<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head><title>헤더 목록 출력</title></head>
<body>

	<!-- 웹 브라우저가 전송한 전체 헤더의 목록과 값을 출력 -->
	<%
		Enumeration headerEnum = request.getHeaderNames();
		while(headerEnum.hasMoreElements()) {
			String headerName = (String)headerEnum.nextElement();
			String headerValue = request.getHeader(headerName);
	%>	
		<%= headerName %> = <%= headerValue %>
	<% 	
		}
	%>
	
</body>
</html>