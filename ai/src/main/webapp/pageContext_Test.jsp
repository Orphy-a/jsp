<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("message", "Hello JSP!");
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<h1><%= pageContext.getAttribute("message") %></h1>
</body>
</html>