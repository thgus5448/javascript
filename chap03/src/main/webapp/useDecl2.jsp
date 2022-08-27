<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!-- 선언부 -->
<%!
//두 정수 값의 합을 구해주는 메소드
public int add (int a, int b) {
	int c = a + b; 
	return c;
}

//두 정수 값의 차를 구해주는 메서드
public int subtract(int a, int b) {
	int c = a - b;
	return c;
}
%>
<!DOCTYPE html>
<html>
<head><title>스크립트릿에서 선언부 사용하기</title></head>
<body>
<!-- 스크립트릿 -->
<%
int value1 = 3;
int value2 = 9;

int addResult = add(value1, value2);
int subtractResult = subtract(value1, value2);
%>

<%= value1 %> + <%= value2 %> = <%= addResult %>
<br>
<%= value1 %> - <%= value2 %> = <%= subtractResult %>
</body>
</html>