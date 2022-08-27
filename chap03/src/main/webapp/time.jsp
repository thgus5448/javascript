<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ page trimDirectiveWhitespaces="true" %> <!-- 불필요하게 생성되는 줄바꿈 공백문자 제거 -->
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>현재 시간</title>
</head>
<body>
	현재 시각 : <%= new java.util.Date() %>
</body>
</html>