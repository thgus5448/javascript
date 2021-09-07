<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register.jsp</title>
</head>
<body>
	<h1>전송결과</h1>
	<%
		String id = request.getParameter("id");
		String psd = request.getParameter("pws");
	%>
	
	<ul>
		<li>아이디 : <%=id %> </li>
		<li>비밀번호 : <%=psd %> </li>
	</ul>

</body>
</html>