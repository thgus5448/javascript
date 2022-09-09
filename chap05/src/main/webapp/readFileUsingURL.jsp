<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ page import="java.io.*"%>
<%@ page import = "java.net.URL" %>
<html>
<head><title>application 개본 객체 사용하여 자원 읽기2</title></head>
<body>

<%
	String resourcePath = "/message/notice.txt";
	char[] buff = new char[128];
	int len = -1;
	URL url = application.getResource(resourcePath);
	try(InputStreamReader br = new InputStreamReader(application.getResourceAsStream(resourcePath), "UTF-8") ) {
		while( (len = br.read(buff) != -1 ) {
			out.print(new String(buff, O, len));
		}
	} catch(IOException ex) {
		out.println("익셉션 발생: " + ex.getMessage());
	}
%>
</body>
</html>