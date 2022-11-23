<%-- 삭제 처리 페이징 --%>
<%@page import="org.apache.webbeans.jsf.JsfConversationService"%>
<%@page import="model1.board.BoardDAO"%>
<%@page import="model1.board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./IsLoggedIn.jsp" %>	<!-- 로그인 여부 확인 -->
<%
String num = request.getParameter("num");	// 일련번호 얻기

BoardDTO dto = new BoardDTO();				// dto 객체 생성
BoardDAO dao = new BoardDAO(application);	// dao 객체 생성
dto = dao.selectView(num);					// 주어진 일련번호에 해당하는 기존 게시물 얻기

// 로그인 사용자 ID 얻기
String sessionId = session.getAttribute("UserId").toString();

int delResult = 0;	// 삭제 성공 시 값이 1

// 작성자가 본인인지 확인
if (sessionId.equals(dto.getId())){
	// 작성자가 본인이라면
	dto.setNum(num);
	delResult = dao.deletePost(dto);	// 삭제
	dao.close();
	
	// 성공 & 실패 처리
	if (delResult == 1) {
		// 성공 시 목록 페이지로 이동
		JSFunction.alertLocation("삭제되었습니다.", "List.jsp", out);
	} else {
		// 실패 시 이전 페이지로 이동
		JSFunction.alertBack("삭제에 실패하였습니다.", out);
	}
} 
else {
	// 작성자 본인이 아니라면 이전 페이지로 이동
	JSFunction.alertBack("본인만 삭제할 수 있습니다.", out);
	
	return;
}
%>