<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Inventory upload page</title>
</head>
<body>
	<h1>Inventory upload page</h1>
	<form method="POST" action="/uploadComplete" enctype="multipart/form-data">
	    <table>
	        <tr>
	            <td><form:label path="file">Select a csv file to upload</form:label></td>
	            <td><input type="file" name="file" /></td>
	        </tr>
	        <tr>
	            <td><input type="submit" value="Submit" /></td>
	        </tr>
	    </table>
	</form>
	<p><a href="${pageContext.request.contextPath}/">Back to home</a></p>
</body>
</html>