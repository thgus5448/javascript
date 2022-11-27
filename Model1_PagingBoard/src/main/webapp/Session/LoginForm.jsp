<%-- 로그인 화면 
로그인 버튼 클릭시 LoginProcess.jsp로 폼값 전송 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Session</title></head>
<body>
	<!-- 공통 링크 -->
	<jsp:include page="../Common/Link.jsp"/> 
	
	<h2>로그인 페이지</h2>
	<span style="color : red ; font-size : 1.2em;">
		<!-- request 내장 객체 영역에 LoginErrMsg 속성이 있는지 확인 후 그 내용 출력 -->
		<%= request.getAttribute("LoginErrMsg") == null ? 
				"" : request.getAttribute("LoginErrMsg") %>
	</span>
	<% 
		// 로그인 상태 확인
		if(session.getAttribute("UserId") == null) {
			// 로그아웃 상태
	%>
	<script> <!-- 아이디와 패스워드 중 빈 값이 있다면 경고값을 띄움 -->
		function validateForm(form) {	// 아이디를 입력x
			if(!form.user_id.value) {
				alert("아이디를 입력하세요.");
				return false;
			}
			if(!form.user_pse.value) {	// 패스워드 입력x
				alert("패스워드를 입력하세요.");
				return false;
			}
		}
	</script>
	
	<form action="LoginProcess.jsp" method="post" name="loginFrm" onsubmit="return validateForm(this);">
		아이디 : <input type="text" name="user_id"/><br/>
		패스워드 : <input type="password" name="user_pw"/><br/>
		<input type="submit" value="로그인하기"/>
	</form>
	<%
		} else { // 로그인된 상태
	%>
		<%= session.getAttribute("UserName") %> 회원님, 로그인하셨습니다. <br/>
		<a href="Logout.jsp">[로그아웃]</a>
	<%
		}
	%>
</body>
</html>