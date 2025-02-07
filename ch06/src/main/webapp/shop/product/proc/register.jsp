<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%

	String prodName = request.getParameter("prodName");
	String stock= request.getParameter("stock");
	String price = request.getParameter("price");
	String company = request.getParameter("company");
	
	try{
		Context context = (Context) new InitialContext().lookup("java:/comp/env");
		DataSource ds = (DataSource) context.lookup("jdbc/shop");
		Connection conn = ds.getConnection();
		
		
		String sql = "insert into `product` (`prodName`,`stock`,`price`,`company`) values (?,?,?,?)";
		
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, prodName);
		psmt.setString(2, stock);
		psmt.setString(3, price);
		psmt.setString(4, company);
		
		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		context.close();
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("/ch06/shop/product/list.jsp");


%>