<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

	String custid = request.getParameter("custid");
	String name= request.getParameter("name");
	String hp = request.getParameter("hp");
	String addr = request.getParameter("addr");
	
	try{
		Context context = (Context) new InitialContext().lookup("java:/comp/env");
		DataSource ds = (DataSource) context.lookup("jdbc/shop");
		Connection conn = ds.getConnection();
		
		
		String sql = "insert into `customer` values (?,?,?,?,now())";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, custid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setString(4, addr);
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		context.close();
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("../list.jsp");


%>