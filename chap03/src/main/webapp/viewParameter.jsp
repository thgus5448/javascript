<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<!-- 스크립트릿 -->
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head><title>요청 파라미터 출력</title></head>
<body>
	<b>request.getParameter()메소드 사용</b> <br>
	name 파라미터 = <% request.getParameter("name"); %> <br>
	address 파라미터 = <% request.getParameter("address"); %>
	<p>
	<b>request.getParameterValues()사용</b>
	<!-- getParameterValues(string name) : 이름이 name인 모든 파라미터의 값을 배열로 구한다. 존재하지 않을 경우 null을 리턴한다. -->
		 
	<%
		String[] values = request.getParameterValues("pet");
		if(values != null) {
			for(int i=0 ; i < values.length ; i++) { 
	%>
				<%= values[i] %>
	<%
			}
		}
	%>
	<p>
	<b>request.getParameterNames() 메서드 사용</b> <br>
	<!-- getParameterNames() : 웹 브라우저가 전송한 파라미터의 이름 목록을 구한다. -->
	<%
		Enumeration paramEnum = request.getParameterNames();
		while(paramEnum.hasMoreElements()) {
			String name = (String)paramEnum.nextElement();
	%>
		<%= name %>
	<%
		}
	%>
	<p>
	<b>request.getParameterMap() 메서드 사용</b>
	<!-- 웹 브라우저가 전송한 파라미터의 앱을 구현한다. 맵은 <파라미터 이름, 값> 쌍으로 구성된다. -->
	<%
		Map parameterMap = request.getParameterMap();
		String[] nameParam = (String[])parameterMap.get("name");
		if(nameParam != null){
	%>
			name = <%= nameParam[0] %>
	<%
		}
	%>
</body>
</html>