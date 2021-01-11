<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<h3><c:out value="${error}" /></h3>
	<p>What is the code?</p>
	<form action="/survey" method="POST">
		<input type="text" name="code" />
		<input type="submit" value="Try Code" />
	</form>
</body>
</html>