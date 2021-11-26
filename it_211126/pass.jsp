<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pass</title>
</head>
<body>
	<!-- [미션]
	몸무게(weight)와 키(height)를 전달받아 몸무게가 150이하이고 키가 
	200이하이면 '승차가능' 아니면 '승차불가'를 회신받아 출력하시오
	서블릿 : PassServlet.java (매핑:my.pass)
	 -->
</body>
	<form name="frm" method="post" action="my.pass">
		<label>키</label>
		<input type="text" name="weight" value="100">
		<br>
		<label>몸무게</label>
		<input type="text" name="height" value="100">
		<br>
		<input type="submit" value="테스트">
		<br>
		<output>${msg }</output>
	</form>
</html>