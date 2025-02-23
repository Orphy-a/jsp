<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user4::list</title>
</head>
<body>

	<h2>user4 list</h2>
	
	<table border="1">
		<tr>
			<td>제품번호</td>
			<td>제품명</td>
			<td>제품가격</td>
			<td>재고</td>
			<td>제조사</td>
			<td>제조일자</td>
			<td>관리</td>
		</tr>
		<c:forEach var="dto" items="${dtos}">
			<tr>
				<td>${dto.getProd_no()}</td>
				<td>${dto.getProd_name()}</td>
				<td>${dto.getProd_price()}</td>
				<td>${dto.getProd_stock()}</td>
				<td>${dto.getProd_company()}</td>
				<td>${dto.getProd_date()}</td>
				<td>
					<a href="/ch10/user4/modify.do?prod_no=${dto.getProd_no()}">수정</a>
					<a href="/ch10/user4/remove.do?prod_no=${dto.getProd_no()}">삭제</a>
				</td>
			</tr>	
		
		</c:forEach>
		
	</table>
</body>
</html>