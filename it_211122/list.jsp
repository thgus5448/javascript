<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String nowPage = "1";
String findStr = "";

if(request.getParameter("nowPage") != null){
	nowPage = request.getParameter("nowPage");
}
if(request.getParameter("findStr") != null){
	findStr = request.getParameter("findStr");
}

%>

	<div id="member">
		<h2>회원관리</h2>
		
		<form name="frm_member" method="post">
			
			<div class="frnZone">
				<input type="button" value="입력" name="btnInsert">
				<input type="text" size="30" name="findStr">
				<input type="text" value="검색" name="btnFind">
				<input type="text" name="nowPage">
				<input type="text" name="mid">
			</div>
		</form>
		
		<div id="rows">
		
			<%for(int i=0 ; i<20 ; i++) {%>
			<div class="item" onclick="member.view(<%=i%>)">
				<span class="item_title">아이디</span>>
				<span class="item_volue">홍길동</span>
				<br>
				<span class="item_title">성명</span>
				<span class="item_value">홍길동</span>
				<br>
				<span class="item_title">연락처</span>
				<span class="item_value">010-1111-1111</span>
				<br>
				<span class="item_title">주소</span>
				<span class="item_value">제주도 제주시</span>
				<br>
				<img src="http://placehold.it/100x125">
				<label></label>
			</div>
			
			<%} %>
		</div>
		
		<div id="btnZone">
			<input type="button" value="&lt" onclick="member.move(%=nowPage -1%)">
			<input type="button" value="&gt" onclick="member.move(%=nowPage +1%)">
		</div>
		
		<input type="text" name="nowPage" value="<%=nowPage%>">
		<input type="text" name="findStr" value="<%=findStr %>">
	</div>
	
	<script>member()</script>
</body>
</html>