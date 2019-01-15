<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Effettua il login</h1>
<a href="../index.jsp">home page</a>

<form action="../CoopController" method="post">

	<input type="hidden" name="operazione" value="login">
	<table border="1">

	<tr>
		<td>inserisci username</td>
		<td><input type="text" name="username"></td>
	</tr>
	
	<tr>
		<td>inserisci password</td>
		<td><input type="password" name="password"></td>
	</tr>
	<tr>
		<td><input type="submit" value="INVIA"></td>
		<td><input type="reset" value="AZZERA"></td>
	</tr>


</table>
</form>

</body>
</html>