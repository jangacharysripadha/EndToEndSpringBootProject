<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location</title>
</head>
<body>
	<form action="saveLoc" method="post">
		Id:<input type="text" name="id" /> <br /> Code:<input type="text"
			name="name" /> <br /> Type:Urban<input type="radio" name="type" />
		Rural<input type="radio" name="type" /> <br /> <input type="submit"
			value="save" />
	</form>
</body>
</html>