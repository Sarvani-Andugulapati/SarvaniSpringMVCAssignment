<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Global Fest - Index</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
.data {
	font-size: Large;
	color: orange;
	font-family: 'Lucida Sans', 'Lucida Sans regular', 'Lucida Grande';
}
</style>
</head>

<body>
	<div class="container p-3 my-3 bg-primary text-white">
		<h1 style="text-align: centre;">Aurora's College of Engineering</h1>
		<hr style="background-color: yellow; height: 1px;">
		<h3 style="text-align: centre;">Global Fest 2022!!</h3>
		<hr style="background-color: green; height: 1px;">
		<p>
			<a href="students/list" class="btn btn-outline-warning btn-lg">participants-Global
				Fest</a> 
				<a href="StudentReg" class="btn btn-outline-warning btn-lg">Add
				Participants</a>
		</p>
		<hr style="background-color: rgb(0, 255, 119); height: 1px;">
		
		<div class="container">
		<h4 style= "text-align:center;"> Students Registration form</h4>
			
			<form action="Save" method= "post">
			
				<div class="form-group">
					<input type="hidden" class="form-control" placeholder="Enter Id"
						name="id" value="$(student.id)">
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Enter Name"
						name="name" value="$(student.name)">
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="Enter Department" name="Department"
						value="$(student.Department)">
				</div>
				
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Enter Country"
						name="Country" value="$(student.Country)">
				</div>
				
				<button type="submit" class="btn btn-primary"
					class="btn btn-outline-warning btn-lg">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>