<!-- 생성 목적 : JDBConnect 클래스 DB연결 테스트 -->
<%@ page import="common.JDBConnect" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><title>JDBC</title></head>
<body>
	<!-- 생성자1 테스트 -->
	<h2>JDBC 테스트</h2>
	<%
		JDBConnect jdbc1 = new JDBConnect();
		jdbc1.close();
	%>
	
	<!-- 생성자2 테스트 -->
	<h2>JDBC 테스트2</h2>
	<!-- application의 내장객체 getInitParameter : web.xml의 컨텍스트 초기화 매개변수를 가져올 수 있다. -->
	<%
		String driver = application.getInitParameter("OracleDriver");
		String url = application.getInitParameter("OracleURL");
		String id = application.getInitParameter("OracleId");
		String pwd = application.getInitParameter("OraclePwd");
	
		JDBConnect jdbc2 = new JDBConnect(driver, url, id, pwd);
		jdbc2.close();
	%>
	
	<!-- 생성자3 테스트 -->
	<h2>JDBC 테스트3</h2>
	<%
		JDBConnect jdbc3 = new JDBConnect(application);
		jdbc2.close();
	%>
</body>
</html>	