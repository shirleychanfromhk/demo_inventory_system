<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Search Inventory page</title>
</head>
<body>
	<h1>Search Inventory</h1>
	<form:form method="POST" action="/inventoryList">
		<form:label path="productId">Please input product Id</form:label>
		<form:input path="productId" />
		<br><br>
		<input type="submit" value="Search" />
	</form:form>
	 <p><a href="${pageContext.request.contextPath}/">Back to home</a></p>
</body>
</html>