<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	//로그아웃시 세션 정보 삭제
	session.removeAttribute("username");
	session.invalidate();
	
	response.sendRedirect("../session.jsp?code=101");


%>