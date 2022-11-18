<!-- 로그인은 쿠키보다는 세션을 이용해 구현하는 것이 좋다
★ 쿠키 ★
- 저장 위치/형식 : 클라이언트 PC에 text로 저장
- 보안 :  클라이언트에 저장되므로 보안에 위험
- 자원/속도 : 서버 자원을 사용하지 않으므로 세션보다 빠름
- 용량 :  용량의 제한이 있다.
- 유지 시간 : 쿠키 생성 시 설정. 단 설정된 시간이 경과하면 무조건 삭제

★ 세션
클라이언트가 웹 브라우저를 통해 서버에 접속한 후 웹 브라우저를 닫을 때까지의 단위
- 저장 위치/형식 : 웹 서버에 Object 타입으로 저장
- 보안 : 서버에 저장되므로 보안에 안정
- 자원/속도 : 서버 자원을 사용하므로 쿠키보다 느림
- 용량 : 서버가 허용하는 한 제한 없음
- 유지 시간 : 서버의 web.xml에서 설정. 설정된 시간 내라도 동작이 있따면 삭제되지 않고 유지
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 방법 1 : 회원인증정보 속성 삭제
session.removeAttribute("UserId");
session.removeAttribute("UserName");

// 방법 2 : 모든 속성 한번에 삭제
session.invalidate();

// 속성 삭제 후 페이지 이동
response.sendRedirect("LoginForm.jsp");
%>