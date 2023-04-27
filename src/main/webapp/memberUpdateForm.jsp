<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 본 어플리케이션의 컨텍스트를 경로를 갖고와서 변수에 저장해놓고 아래서 사용한다  -->
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 수정 화면</title>
</head>
<body>

<form name="frmMember" action="${contextPath}/update" method="post">
	<input type="hidden" name="id" id="id" value="${requestScope.member.id}">
	<table>
		<tr>
			<th>회원 수정</th>
		</tr>
		<tr>
			<th>이름</th>
			<td><input type="text" name="name" value="${requestScope.member.name}"></td>
<!-- 			value 속성을 이용해서 내용을 담아갈 수 있다. -->
		</tr>
		<tr>
			<th>이메일</th>
			<td><input type="text" name="email" value="${requestScope.member.email}"></td>
		</tr>	
	</table>
	
	<input type="submit" value="저장하기">

</form>

</body>
</html>