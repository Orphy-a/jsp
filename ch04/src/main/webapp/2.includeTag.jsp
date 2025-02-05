<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<!-- 
		날짜 : 2025/02/05
		이름 : 오재영
		내용 : include 액션태그
	 -->
	
</head>
<body>
	<h3>2.include 액션태그</h3>
	
	
	<!-- 정적타임에 삽입 -->
	<h4>include 지시자</h4>
	<%@ include file="./inc/_header.jsp" %>
	<%@ include file="./inc/_footer.jsp" %>
	
	<!-- 동적타임에 삽입 -->
	<h4>include 매서드</h4>
	<%
		pageContext.include("./inc/_header.jsp");
		pageContext.include("./inc/_footer.jsp");
	%>
	
	<!-- 동적타임에 삽입 -->
	<h4>include 액션태그</h4>
	<jsp:include page="./inc/_header.jsp"></jsp:include>
	<jsp:include page="./inc/_footer.jsp"></jsp:include>
	
</body>
</html>