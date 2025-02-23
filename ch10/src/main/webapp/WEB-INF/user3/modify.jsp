<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user3 수정</title>
</head>
<body>
	
	<h2>user3 수정</h2>
	
	<a href="/ch10">처음으로</a>
	<a href="/ch10/user3/list.do">목록이동</a>
	
	<form action="/ch10/user3/modify.do" method="post">
		<table border="1">
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="uid" value="${dto.uid}" readonly="readonly" placeholder="아이디 입력">
			</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<input type="text" name="name" value="${dto.name}" placeholder="이름 입력">
			</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td>
				<input type="text" name="hp" value="${dto.hp}" placeholder="전화번호 입력">
			</td>
		</tr>
		<tr>
			<td>직급</td>
			<td>
				<input type="text" name="pos"value= "${dto.pos}"  placeholder="직급 입력">
			</td>
		</tr>
		<tr>
			<td>입사일</td>
			<td>
				<input type="text" name="rdate" value="${dto.rdate}" readonly="readonly" placeholder="입사일 입력">
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="수정하기">
			</td>
		</tr>
	</table>
	</form>
	
</body>
</html>