<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>4.application</title>
	<!-- 
		날짜 : 2025/02/04
		이름 : 오재영
		내용 : 내장객체 application 실습
		
		application 내장객체
		- 현재 웹 애플리케이션을 실행하는 WAS(Tomcat)환경정보 객체
		- 애플리케이션 환경정보(Context)를 설정하고 참조 기능 제공
		- 애플리케이션 WAS로 실행되는 시스템 경로 기능 제공
		
	 -->
</head>
<body>
	<h3>4.application</h3>
	
	<h4>서버정보</h4>
	<p>
		서버 : <%=application.getServerInfo() %><br>
		서블렛 버전 : <%=application.getMajorVersion() %>.<%=application.getMinorVersion() %><br>
		JSP 버전 : <%=JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %>
	</p>
	
	<h4>환경정보</h4>
	<%
	// 애플리케이션이 WAS에 초기화(최초 실행) 될때 Context 환경정보 반영
	String param1 = application.getInitParameter("PARAM1"); 
	String param2 = application.getInitParameter("PARAM2"); 
	
	%>
	
	<h4>자원정보</h4>
	<%=application.getRealPath("./4.application.jsp") %>
	
	
</body>
</html>