<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Update Inventory List</title>
  </head>
  <body>
    <h1>Update Inventory Successful</h1>
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Product ID</th>
          <th>Product Name</th>
          <th>Quantity</th>
          <th>Location</th>
        </tr>
        <c:forEach items="${product}" var ="product">
        <tr>
          <td>${product.productId}</td>
          <td>${product.productName}</td>
          <td>${product.quantity}</td>
          <td>${product.location}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
    <p><a href="${pageContext.request.contextPath}/searchInventory">Back to search</a></p>
    <p><a href="${pageContext.request.contextPath}/">Back to home</a></p>
  </body>
  
</html>