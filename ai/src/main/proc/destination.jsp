<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String name = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
</head>
<body>
	<h2>전달된 값: <%= name %></h2>
</body>
</html>