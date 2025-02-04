<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>forward1</title>
</head>
<body>
	<h4>forward #1</h4>
	
	<%
		pageContext.forward("../1.request.jsp");
	
	
	%>
	
</body>
</html>