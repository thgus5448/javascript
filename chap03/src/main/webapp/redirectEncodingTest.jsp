<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ page import = "java.net.URLEncoder" %>
<%
	String value = "자바";
	String encodedValue = URLEncoder.encode(value, "utf-8");
	response.sendRedirect("/chap03/src/main/webapp/index.jsp" + encodedValue);
%>
<html>
<head><title></title></head>
<body>

</body>
</html>