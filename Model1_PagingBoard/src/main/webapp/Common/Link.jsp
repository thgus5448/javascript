<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<table border="1" width="90%">
	<td align="center">
	<!-- 로그인 여부에 따른 메뉴 변화 -->
	<% if(session.getAttribute("UserId") == null) { %>
	<a href="../Session/LoginForm.jsp">로그인</a>
	<% } else { %>
	<a href="">로그아웃</a>
	<% } %>
	&nbsp &nbsp &nbsp <!-- 메뉴 사이의 공백(space) 확보용 특수 문자 -->
	<a href="../Board/List.jsp">게시판(페이징x)</a>
	&nbsp &nbsp &nbsp
	<a href="">게시판(페이징o)</a>
	</td>
</table>