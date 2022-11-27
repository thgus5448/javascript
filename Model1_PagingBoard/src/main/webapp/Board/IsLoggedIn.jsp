<%-- 로그인여부 확인 --%>
<%@ page import="utils.JSFunction" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
//session영역에 userId가 없다면 경고창을 띄운 후, 로그인 페이지로 이동
if(session.getAttribute("UserId") == null) {
	JSFunction.alertLocation("로그인 후 이용해주십시오.", "../Session/LoginForm.jsp", out);
	
	return;
}
%>