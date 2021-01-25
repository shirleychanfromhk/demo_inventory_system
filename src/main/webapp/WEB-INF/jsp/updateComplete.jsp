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
    <h2>Receiver's updated inventory</h2>
    <div>
      <table border="1">
        <tr>
          <th>Product ID</th>
          <th>Product Name</th>
          <th>Quantity</th>
          <th>Location</th>
        </tr>
        <tr>
          <td>${productId}</td>
          <td>${productName}</td>
          <td>${quantity}</td>
          <td>${location}</td>
        </tr>
      </table>
    </div>
    <p><a href="${pageContext.request.contextPath}/">Back to home</a></p>
  </body>
  
</html>