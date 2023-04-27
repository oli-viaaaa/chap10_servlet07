<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
	<h3>회원 정보 상세보기</h3>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>${requestScope.member.id}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${requestScope.member.name}</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>${requestScope.member.email}</td>
		</tr>
		<tr>
			<td>가입일</td>
			<td>${requestScope.member.joinDate}</td>
		</tr>
	</table>
	<br>
	<a href="${contextPath}/updateForm?id=${member.id}">수정</a>
	<a href="${contextPath}/delete?id=${member.id}">삭제</a>
</body>
</html>