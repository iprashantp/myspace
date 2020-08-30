<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Form</h1>
	<form action="/operation">
		User Id By: <input id="uid" name="UId"/><br>
		<select name="ddlFlag">
			<option value="select">Select Records</option>
			<option value="delete">Delete Records</option>
			<option value="update">Update Records</option>
		</select>
		<br>
		<input type="submit"  value="Click Now"/><br>
	</form>
</body>
</html>