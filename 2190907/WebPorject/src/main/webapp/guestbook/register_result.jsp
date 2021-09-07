<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register.jsp</title>
</head>
<body>
	<h1>방명록 저장 결과</h1>
	<%
		String v_wirter = request.getParameter("v_witer");
		String v_date = request.getParameter("v_date");
		String v_memo = request.getParameter("v_memo");
		String v_pwd = request.getParameter("v_pwd");
	%>
	
	<ul>
		<li>작성자 : <%=v_wirter %> </li>
		<li>작성일 : <%=v_date %> </li>
		<li>내용 : <%=v_memo %> </li>
		<li>암호 : <%=v_pwd %> </li>
	</ul>

</body>
</html>