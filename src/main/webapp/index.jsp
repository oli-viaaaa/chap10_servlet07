<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>여기는 index.jsp</h2>
	<br>
	<a href="${pageContext.request.contextPath}/list"> 
	회원 목록보기 
	</a>
	<br>
	<a href="${pageContext.request.contextPath}/memberForm.jsp">회원가입</a>
	
</body>
</html>