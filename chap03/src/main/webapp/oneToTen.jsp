<%@ page language="java" contentType="text/html; charset=EUC-KR" %>
<!DOCTYPE html>
<html>
<head><title>1-10������ ��</title></head>
<body>
<!-- ǥ���� -->
<%
int sum = 0;
for(int i = 1 ; i <= 10 ; i++) {
	sum = sum + i;
}
%>
1���� 10������ ���� <%= sum %> �Դϴ�.
</body>
</html>