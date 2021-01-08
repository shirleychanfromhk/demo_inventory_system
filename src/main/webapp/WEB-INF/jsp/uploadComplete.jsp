<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Inventory upload Complete</title>
</head>
<body>
	<h1>Inventory upload complete.</h1>
	<br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Product ID</th>
          <th>Product Name</th>
          <th>Quantity</th>
          <th>Location</th>
        </tr>
        <c:forEach items="${productList}" var ="productList">
        <tr>
          <%-- <td>${productList.productId}</td>
          <td>${productList.productName}</td>
          <td>${productList.quantity}</td>
          <td>${productList.location}</td>--%>
        </tr>
        </c:forEach>
      </table>
    </div>
    <p><a href="${pageContext.request.contextPath}/uploadInventory">Back to upload page</a></p>
	<p><a href="${pageContext.request.contextPath}/">Back to home</a></p>
</body>
</html>