<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style type="text/css">
.titleText {
	border: 1px solid blue;
	box-sizing: border-box;
}
</style>
</head>
<body>
	<div class="container" align="center">
		<h2 class="titleText text-danger">CRM - Customer Relationship
			Manager</h2>
		<h3 class="text-info">New Customer</h3>
		<form:form action="save" method="post" modelAttribute="customer">
			<table class="">
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" required="true" id="fNameInputText"/> <span
						id="fName"></span></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" required="true" id="lNameInputText"/> <span
						id="lName"></span></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input type="email" path="email" required="true" id="emailInputText"/> <span
						id="email"></span></td>
				</tr>
				<tr>
					<td colspan="2"><button class="btn btn-info" type="submit"
							value="Save">Save</button></td>
					<td><a href="/Customer-Web-Application/customer/list">Back
							to List</a></td>
				</tr>
			</table>
		</form:form>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	
</body>
</html>