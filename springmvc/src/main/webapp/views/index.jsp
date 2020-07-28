<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring boot app</title>
</head>
<body>
	<h1> Hi Prashant</h1>
	<form action="addAlienDAO">
	Enter 1st number: <input type="text" name="aid"/><br>
	Enter 2nd number: <input type="text" name="aname"/><br>
	<input type="submit"/>
	</form>
	<hr>
	<form action="getAlien" method="get">
		Enter your id : <input type="text" name="aid">
		<input type="submit">
	</form>
</body>
</html>