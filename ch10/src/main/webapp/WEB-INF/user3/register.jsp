<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>user3::register</title>
</head>
<body>
	<h3>user3 등록</h3>
	<a href="/ch10">처음으로</a>
	<a href="/ch10/user3/list.do">목록이동</a>
	
	<form action="/ch10/user3/register.do" method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" placeholder="아이디 입력"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" placeholder="이름 입력"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="hp" placeholder="전화번호 입력"></td>
			</tr>
			<tr>
				<td>직급</td>
				<td><input type="text" name="pos" placeholder="직급 입력"></td>
			</tr>

			<tr>				
				<td colspan="2" align="right">
					<input type="submit" value="등록하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>




