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
	<a href="/ch10/user4/list.do">목록이동</a>
	
	<form action="/ch10/user4/modify.do" method="post">
		<table border="1">
		<tr>
			<td>제품번호</td>
			<td>
				<input type="text" name="prod_no" value="${dto.getProd_no()}" readonly="readonly">
			</td>
		</tr>
		<tr>
			<td>제품명</td>
			<td>
				<input type="text" name="prod_name" value="${dto.getProd_name()}" placeholder="제품명 입력">
			</td>
		</tr>
		<tr>
			<td>제품가격</td>
			<td>
				<input type="text" name="prod_price" value="${dto.getProd_price()}" placeholder="제품가격 입력">
			</td>
		</tr>
		<tr>
			<td>제품수량</td>
			<td>
				<input type="text" name="prod_stock"value= "${dto.getProd_stock()}"  placeholder="제품수량 입력">
			</td>
		</tr>
		<tr>
			<td>제조사</td>
			<td>
				<input type="text" name="prod_company"value= "${dto.getProd_company()}"  placeholder="제조사 입력">
			</td>
		</tr>
		<tr>
			<td>제조일자</td>
			<td>
				<input type="text" name="prod_date" value="${dto.getProd_date()}" readonly="readonly">
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