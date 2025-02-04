<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>request 객체 예제</title>
</head>
<body>
	<h2>클라이언트 및 서버 정보</h2>
	<p>클라이언트 IP : <%=request.getRemoteAddr() %></p>
	<p>요청 URI : <%=request.getRequestURI() %></p>
	<p>컨텍스트 경로 : <%=request.getContextPath() %></p>
	<p>서버이름 : <%=request.getServerName() %></p>
	<p>서버포트 : <%=request.getServerPort() %></p>
	
</body>
</html>