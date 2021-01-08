<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Update Inventory page</title>
</head>
<body>
	<h1>Update Inventory</h1>
	<form:form method="POST" action="/updateComplete">
		<form:label path="productId">Please input product Id</form:label>
		<form:input path="productId" /><br>
		<form:label path="quantity">Please input quantity</form:label>
		<form:input path="quantity" /><br>
		<form:label path="location">Please input product destination</form:label>
		<form:input path="location" />
		<br><br>
		<input type="submit" value="Search" />
	</form:form>
</body>
</html>