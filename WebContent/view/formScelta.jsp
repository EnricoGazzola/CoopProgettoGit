<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background=317121-new-food-background-2032x1208.jpg>
	<form action="../CoopController" method="post">
		<div align="center">
			<img src=1200px-Coop_italia_logo.svg.png height="310" width="750"> <br>
			
<!-- 				<select> -->
<!-- 					<option name = operazione value="">----</option> -->
<!-- 					<option name = operazione value="crea">Crea</option> -->
<!-- 					<option name = operazione value="visualizza">Visualizza</option> -->
<!-- 					<option name = operazione value="modifica">Modifica</option> -->
<!-- 					<option name = operazione value="elimina">Elimina</option> -->
<!-- 				</select> -->
				
<!-- 				<select> -->
<!-- 					<option name = tabella value="">----</option> -->
<!-- 					<option name = tabella value="prodotti">Prodotti</option> -->
<!-- 					<option name = tabella value="fornitori">Fornitori</option> -->
<!-- 					<option name = tabella value="categorie_prodotti">Categorie</option> -->
<!-- 				</select> -->
				
<!-- 			<br><br> -->
<!-- 			<input type="button" onclick="../MainController" value="Avanti"/> -->

		<a href="../CoopController?tabella=prodotti">Prodotti</a>
		<a href="../CoopController?tabella=categorie">Categorie</a>
		<a href="../CoopController?tabella=fornitori">Fornitori</a>
		</div>
	</form>
</body>
</html>