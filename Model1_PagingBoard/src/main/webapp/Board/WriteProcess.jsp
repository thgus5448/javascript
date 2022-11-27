<%-- 글쓰기 처리 페이지 : 사용자가 글을 입력할 글쓰기 페이지(Write.jsp)와 글 내용을 데이터 베이스에 저장해줄 DAO 객체를 연결 --%>
<%@page import="utils.JSFunction"%>
<%@ page import="model1.board.BoardDAO" %>
<%@ page import="model1.board.BoardDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="IsLoggedIn.jsp" %>
<!DOCTYPE html>
<%
// 인코딩
request.setCharacterEncoding("UTF-8");

// 폼값 받기
String title = request.getParameter("title");
String content = request.getParameter("content");

// 폼값을 DTO 객체에 저장
BoardDTO dto = new BoardDTO();
dto.setTitle(title);
dto.setContent(content);
dto.setId(session.getAttribute("UserId").toString());
	// session 영역에 저장되어있는 사용자 아이디까지 DTO에 담은 이유 
	// board테이블의 id 컬럼 = member 테이블의 id 컬럼과 외래키로 설정되어있으므로
	// id가 빈 값이면 INSERT할 때 제약조건 위배로 오류가 발생하기 때문
 

// DAO 객체를 통해 DB에 DTO 저장
BoardDAO dao = new BoardDAO(application);
//int iResult = dao.insertWrite(dto);	//원래코드
//페이징 처리를 위한더미데이터 100개 추가
int iResult = 0;
for(int i = 1; i <= 100; i++){
	dto.setTitle(title + "-" + i);
	iResult = dao.insertWrite(dto);
}
dao.close();

// 성공 or 실패
if (iResult == 1) {	// 성공하면 목록 페이지로 이동
	response.sendRedirect("List.jsp");
} else {	// 실패하면 경고창을 띄운 후 이전 페이지(글쓰기 페이지)로 이동
	JSFunction.alertBack("글쓰기에 실패하였습니다.", out);
}
%>