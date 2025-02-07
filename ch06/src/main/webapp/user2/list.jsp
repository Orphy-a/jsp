
<%@page import="entity.User2"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

	String host = "jdbc:mysql://127.0.0.1:3306/studydb";
	String user = "root";
	String pass = "1234";

	List<User2> users = new ArrayList<>();
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from `user2`");
		
		while(rs.next()){
			User2 user2 = new User2();
			user2.setUid(rs.getString(1));
			user2.setName(rs.getString(2));
			user2.setBirth(rs.getString(3));
			user2.setAddr(rs.getString(4));
			users.add(user2);
			
		}
		
		rs.close();
		stmt.close();
		stmt.close();
		
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}

	


%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	
	<h2>user2 목록</h2>
	
	<a href="../1.jdbc.jsp">처음으로</a>
	<a href="./register.jsp">등록하기</a>
	
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>생년월일</td>
			<td>주소</td>
			<td>관리</td>
		</tr>
		<%for(User2 user2 : users) {%>
		<tr>
			<td><%=user2.getUid() %></td>
			<td><%=user2.getName() %></td>
			<td><%=user2.getBirth() %></td>
			<td><%=user2.getAddr() %></td>
			<td>
				<a href="./modify.jsp?uid=<%= user2.getUid() %>">수정</a>
				<a href="./proc/delete.jsp?uid=<%= user2.getUid() %>">삭제</a>
			</td>
		</tr>
		<%} %>
	</table>
	
	
</body>
</html>