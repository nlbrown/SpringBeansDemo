<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Norm's Java EE World</title>
</head>
<body>
	<h1>Hello! This is Norm's JSP page!</h1>
	<form action="helloServlet" method="post">
Enter your name: <input type="text" name="yourName" size="20">
Enter your Last name: <input type="text" name="lastName" size="20">
<input type="submit" value="Call Servlet" />
</form>
</body>
</html>