<%@page import="login.User"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	
	// 데이터 수신
	String uid = request.getParameter("uid");
	String pass = request.getParameter("pass");
	
	if(uid.equals("abc") && pass.equals("1234")){
		
		User user = new User();
		user.setUid(uid);
		user.setPass(pass);
		user.setName("오재영");
		
		
		// 세션 저장 ★
		session.setAttribute("username", user);
		
		// 성공페이지 이동
		response.sendRedirect("https://naver.com");
		
	}else{
		response.sendRedirect("../session.jsp?code=100");
	}
	
%>




