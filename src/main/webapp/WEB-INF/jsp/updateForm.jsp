<%@ page language="java" contentType="text/html; charset=BIG5" pageEncoding="BIG5"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Update Inventory page</title>
</head>
<body>
	<h1>Update Inventory</h1><br>
	<h2>Current inventory</h2>
    <div>
      <table border="1">
        <tr>
          <th>Product ID</th>
          <th>Product Name</th>
          <th>Quantity</th>
          <th>Location</th>
        </tr>
        <c:forEach items="${productList}" var ="product">
        <tr>
          <td>${product.productId}</td>
          <td>${product.productName}</td>
          <td>${product.quantity}</td>
          <td>${product.location}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
    <br>
	<form:form method="POST" action="/updateComplete">
		<form:label path="productId">Please input product Id</form:label>
		<form:input path="productId" /><br>
		<form:label path="originalLocation">Which warehouse the product come from</form:label>
		<form:input path="originalLocation" /><br>
		<form:label path="newLocation">Which warehouse the product transfer to</form:label>
		<form:input path="newLocation" /><br>
		<form:label path="quantity">How many items you want to transfer out</form:label>
		<form:input path="quantity"/><br>
		<br><br>
		<input type="submit" value="Update" />
	</form:form>
</body>
</html>