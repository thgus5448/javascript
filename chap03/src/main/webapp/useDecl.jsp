<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!-- 선언부 -->
<%!
	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>선언부를 사용한 두 정수값의 곱</title>
</head>
<body>

10 * 25 = <%= multiply(10, 25) %>

</body>
</html>