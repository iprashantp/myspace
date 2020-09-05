<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
	var data;
	$(document).ready(function(){
		$('#btnClick').click(function(){
			console.log('btnClick clicked')
			$.ajax({
				url:"/getUserByID/"+$('#uid').val(),
				//data:$('#uid').val(),
				contentType:"application/json",
				dataType:"json",
				success:function(r){
					data=r;
					//alert(r);
					console.log(data);
				}
			})
		})
		//alert("jquery loaded")
	})
</script>
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
		<input id="btnClick" type="button"  value="Click Now"/><br>
	</form>
</body>
</html>
