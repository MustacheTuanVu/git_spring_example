<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 10. JPA | MVC | H2 Example -->
	<form action="addAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="submit" name="submit" value="add alien"><br>
	</form>
	
	<!-- 11. JPA | MVC | H2 Example Part 2 -->
	<form action="getAlien">
		<input type="text" name="aid"><br>
		<input type="submit" name="submit" value="search alien"><br>
	</form>
</body>
</html>