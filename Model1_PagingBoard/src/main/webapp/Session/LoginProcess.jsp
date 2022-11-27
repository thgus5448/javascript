<%-- 사용자로부터 받은 폼값(아이디와 패스워드)로 로그인을 처리할 JSP 폼값은 LoginForm.jsp에서 전달받음 --%>
<%@ page import="membership.MemberDAO" %>
<%@ page import="membership.MemberDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 로그인 폼으로부터 받은 아이디와 패스워드
String userId = request.getParameter("user_id");
String  userPwd = request.getParameter("user_pw");

// web.xml에서 가져온 데이터베이스 연결 정보
String oracleDriver = application.getInitParameter("OracleDriver");
String oracleURL = application.getInitParameter("OracleURL");
String oracleId = application.getInitParameter("OracleId");
String oraclePwd = application.getInitParameter("OraclePwd");

// 회원 테이블 DAO를 통해 회원 정보 획득
MemberDAO dao = new MemberDAO(oracleDriver, oracleURL, oracleId, oraclePwd);
MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);
dao.close();

// 로그인 성공 여부에 따른 처리
if(memberDTO.getId() != null){
	// 로그인 성공	: session 영역에 아이디와 이름을 저장한 후 로그인 페이지로 이동
	// session 영역에 저장된 속성값은 웹 브라우저를 닫을 때까지는 모든 페이지에 공유
	session.setAttribute("UserId", memberDTO.getId());
	session.setAttribute("UserName", memberDTO.getName());
	response.sendRedirect("LoginForm.jsp");
} else {
	// 로그인 실패 : request 영역에 오류 메시지를 저장한 후 로그인 페이지로 포워드
	// 포워드로 인해 request 영역에 저장된 속성값(=잘못 입력한 값) LoginForm.jsp로 전달
	request.setAttribute("LoginErrMsg", "로그인 오류입니다.");
	request.getRequestDispatcher("LoginForm.jsp").forward(request, response);

}

%>