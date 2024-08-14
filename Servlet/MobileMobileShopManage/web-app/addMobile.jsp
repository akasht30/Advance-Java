<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
<link rel="stylesheet"  href="./add.css">

</head>
<body>
	
	<section id="main">
	
		<div class="left">
			
		</div>
		<div id="form">
			<h1>Enter a mobile details</h1>
			<form action="add" method="post">
				<div><input type="text" placeholder="Id" name="mobileId"></div> <br>
				<div><input type="text" placeholder="Model" name="mobileModel"></div><br>
				<div><input type="text" placeholder="Brand" name="mobileBrand"></div><br>
				<div><input type="text" placeholder="Price" name="mobilePrice"></div><br>
				<div><input type="submit" value="ADD"></div>
			</form>
		</div>
		<div class="right">
			
		</div>
	</section>
</body>
</html>
