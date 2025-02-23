<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>user3::list</title>
</head>
<body>
	<h2>user3 목록</h2>
	
	<a href="/ch10">처음으로</a>
	<a href="/ch10/user3/register.do">등록하기</a>
	
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>직급</td>
			<td>입사일</td>
			<td>관리</td>
		</tr>
		<c:forEach var="dto" items="${dtos}">
			<tr>
				<td>${dto.getUid()}</td>
				<td>${dto.getName()}</td>
				<td>${dto.getHp()}</td>
				<td>${dto.getPos()}</td>
				<td>${dto.getRdate()}</td>
				<td>
					<a href="/ch10/user3/modify.do?uid=${dto.getUid()}">수정</a>
					<a href="/ch10/user3/remove.do?uid=${dto.getUid()}">삭제</a>
				</td>
			</tr>
		
		</c:forEach>	
	
	</table>
	
</body>
</html>