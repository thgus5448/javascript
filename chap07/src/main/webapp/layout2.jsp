<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head><title>layout</title></head>
<body>

<table width="400" border="1" cellpadding="0" cellspacing="0">
<tr> <!-- 상단 -->
	<td colspan="2">
		<jsp:include page="/module/top.jsp" flush="false" />
	</td>
</tr>
<tr> 
	<!-- 좌측 -->
	<td width="100" valign="top">
		<jsp:include page="/module/left.jsp" flush="false" />
	</td>
	<!-- 우측 -->
	<td width="300" valign="top">
		<!-- 내용 부분 : 시작 -->
		이 부분은 layout2.jsp가 생성한다.<br>
		레이아웃2
		<br><br><br>
		<!-- 내용 부분 : 끝 -->
	</td>
</tr>
<tr> <!-- 하단 -->
	<td colspan="2">
		<jsp:include page="/module/bottom.jsp" flush="false" />
	</td>
</tr>
</table>

</body>
</html>