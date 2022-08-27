<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head><title>Insert title here</title></head>
<body>
<!-- 표현식 -->
<%
int sum = 0;
for(int i = 1 ; i <= 10 ; i++) {
	sum = sum + i;
}
%>
1부터 10까지의 합은 <%= sum %> 입니다.
	
<br>
	
<!--  표현식 -->
<%
int sum2 = 0;
for(int i=11 ; i<20; i++) {
	sum2 = sum2 + i;
}
%>
11부터 20까지의 합은 <%= sum %> 입니다.
</body>
</html>