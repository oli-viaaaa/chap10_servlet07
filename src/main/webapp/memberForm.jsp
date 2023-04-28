<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>

<!-- 본 어플리케이션의 컨텍스트 경로를 갖고와서 변수에 저장해놓고 아래서 사용 -->
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입폼</title>
</head>
<body>
	<form name="frmMember" action="${contextPath}/insert">
		<table>
			<tr>
				<th>회원 가입</th>
			</tr>
			
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" required="required"></td>
<!-- 				반드시 채워져야 할 내용을 required="required"로 제어한다. -->
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" required="required"></td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email"></td>
			</tr>
	</table>
	
	<input type="submit" value="가입하기">
	<input type="reset" value="다시입력">

</form>

</body>
</html>