<%@page import="login.User"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>


<%
	// 세션을 가져온다.
	User user = (User) session.getAttribute("username");
	
	//로그인하지 않고 성공페이지에 접속한 경우
	if(user == null){
		
		// 다시 로그인 페이지로 보낸다.
		response.sendRedirect("../sesstion.jsp?code=102");
		return;
	}

%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h3>로그인 성공!</h3>
	
	<p>
	<%=user.getName() %>님 반갑습니다.
	</p>
	
	<a href="logout.jsp">로그아웃</a>
	
</body>
</html>