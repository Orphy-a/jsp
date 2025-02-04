<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>forward2</title>
</head>
<body>
	<h4>forward #2</h4>
	
	<%
		// forward는 서버 자원내에서 제어권 이동이기 때문에 원격지 타 서버 자원으로 이동 불가
		pageContext.forward("https://naver.com"); // forward로 네이버 요청 x
		
	
	
	%>
	
</body>
</html>