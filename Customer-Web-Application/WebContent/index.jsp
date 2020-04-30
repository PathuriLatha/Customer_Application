<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
</head>
<body>
<div align="center">
<h1>Welcome page</h1>
<a href="customer/list">view customers</a>
</div>
</body>
</html> --%>


<% response.sendRedirect("customer/list"); %>