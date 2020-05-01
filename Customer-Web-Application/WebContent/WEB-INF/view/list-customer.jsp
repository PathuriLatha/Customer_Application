<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<title>Customer Relationship Management</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style type="text/css">
	.titleText{
		border: 1px solid blue;
		box-sizing: border-box;
	}
</style>	
</head>
<body>
	<div class="container" align="center">
		<h2 class="titleText text-danger">CRM - Customer Relationship Manager</h2>
		<form method="get" action="search">
			Search Customer : &nbsp; <input type="text" name="keyword" /> &nbsp;
			<input type="submit" value="Search" class="btn btn-info search"/>
		</form>
		<br>
		<div class="table-responsive text-center">
			<table class="table table-hover table-striped" >
				<tr class="bg-primary text-white">
					<!-- <th>ID</th> -->
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach items="${listCustomer}" var="customer">
					<tr>
						<%-- <td>${customer.id}</td> --%>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td><a
							href="/Customer-Web-Application/customer/edit?id=${customer.id}">Update</a>
							&nbsp; | &nbsp;&nbsp; <a
							onclick="if(!confirm('Are you sure you want to delete this customer?')) return false;"
							href="/Customer-Web-Application/customer/delete?id=${customer.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br>
		<div align="">
			<input type="button" class="btn btn-success" value="Add Customer"
				onclick="window.location.href='new'; return false;" />
		</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>