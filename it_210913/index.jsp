<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>방명록 메인 페이지</title>
	<link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body>
<% 
String sub="./guestbook/register.jsp";	//기본 페이지 
if( request.getParameter("sub") != null) {
	sub = request.getParameter("sub");
}
%>
	
	
	<div id="index"><!-- (1) -->

	<!-- header -->
	<%@include file="header.jsp" %>
	
	<section> <!-- (3) -->
		<jsp:include page="<%=sub %>"></jsp:include>	<!-- sub의 실행결과를 가지고와라 -->
	</section>
	
	<!-- footer -->
	<%@include file="footer.jsp" %>
	
</div>
</body>
</html>




