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
	<h3>getAddressInfo</h3>
	<form action="#" method="post">
		<table border="1" cellspacing="5" cellpadding="5">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>등록일</th>
			</tr>
			<tr>
				<td>방법1</td>
			</tr>
			<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.userId}</td>
				<td>${dto.userName}</td>
				<td>${dto.regDate}</td>
			</tr>
			</c:forEach>
			<tr>
				<td>방법2</td>
			</tr>
			<c:forEach var="dto2" items="${list2}">
			<tr>
				<td>${dto2.userId}</td>
				<td>${dto2.userName}</td>
				<td>${dto2.regDate}</td>
			</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>