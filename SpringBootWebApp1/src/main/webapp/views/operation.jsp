<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Operation Form</h1>
	<form action="getDetails">
		User Name: <input id="UName" name="UName"/><br>
		Email Id: <input id="EmailId" name="EmailId"/><br>
		Password : <input type="password" id="password" name="Password"/><br>
		Gender : 
		<input type="radio" name="Gender" value="1" checked=true/>Male<br>
		<input type="radio" name="Gender" value="2" />Female<br>
		<br>
		<input type="checkbox" name="hobby" value="Dancing"/> Dancing
		<input name="hobby" type="checkbox" value="Singing"/> Dancing<br>
		
		<input type="submit"  value="Register Now"/><br>
	</form>
</body>
</html>