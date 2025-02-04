<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 5초 후 네이버로 리다이렉트
	response.setHeader("Refresh", "5;http://www.naver.com");
	
	//HTML 응답 출력
	response.setContentType("text/html; charset=UTF-8");
	response.getWriter().println("<h1>Hello, JSP!<h1>");
	
	//캐시 방지
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
	
    //파일 다운로드
    response.setContentType("application/octet-stream");
    response.setHeader("Content-Disposition", "attachment; filename=\"sample.txt\"");
%>


<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h2>5초 후 네이버로 이동합니다.</h2>
</body>
</html>