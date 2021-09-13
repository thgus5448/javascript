<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register_result.jsp</title>
</head>
<body>
<h1>방명록 저장 결과</h1>
<%
String mid   = request.getParameter("mid");
String mdate = request.getParameter("mdate");
String doc   = request.getParameter("doc");
String pwd   = request.getParameter("pwd");
%>
<ul>
	<li>아이디 : <%=mid %> </li>
	<li>작성일 : <%=mdate %> </li>
	<li>내용 : <%=doc %> </li>
	<li>암호 : <%=pwd %> </li>
</ul>

</body>
</html>








