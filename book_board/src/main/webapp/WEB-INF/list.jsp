<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 목록</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>게시판 목록</h1>
        <table id="boardTable">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일</th>
                    <th>조회수</th>
                </tr>
            </thead>
            <tbody id="boardList">
                <!-- 게시글 목록이 여기에 동적으로 추가됩니다 -->
            </tbody>
        </table>
        <div class="pagination" id="pagination">
            <!-- 페이지 번호가 여기에 동적으로 추가됩니다 -->
        </div>
        <button id="writeBtn">글쓰기</button>
    </div>
    <script src="script.js"></script>
</body>
</html>