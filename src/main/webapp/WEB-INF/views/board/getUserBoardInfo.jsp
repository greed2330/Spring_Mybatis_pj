<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>getBoardInfo</h3>
	<form action="#" method="post">
		<table border="1" cellspacing="5" cellpadding="5">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>등록일</th>
				<th colspan="3">게시글</th><!-- 글번호 타이틀 -->
			</tr>
			<c:forEach var="dto" items="${list}">
				<c:forEach var="boardDTO" items="${dto.boardDTO}">
					<tr>
						<td align="center">${dto.userId}</td>
						<td align="center">${dto.userName}</td>
						<td align="center">${dto.regDate}</td>
						<td align="center">${boardDTO.boardNum}</td>
						<td align="center">${boardDTO.boardTitle}</td>
						<td align="center">${boardDTO.boardContent}</td>
					</tr>
				</c:forEach>			
			</c:forEach>
		</table>
	</form>
</body>
</html>