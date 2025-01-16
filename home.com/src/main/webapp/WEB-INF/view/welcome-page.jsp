<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyCafe</title>
</head>
<body align="center">
	<div>
		<h2>Grey's Cafe</h2>
		<hr>
		<h3>Welcome to Grey's Cafe</h3>
		<h4>Founder : ${myName}</h4>
	</div>
	<form action="processOrder">
	<div>
		<label for="item_name">Item name</label>
		<input type="text" name="foodType" placeholder="Enter item name" id="item_name">
		<input type="button" value="submit">
	</div>
	</form>
	
</body>
</html>