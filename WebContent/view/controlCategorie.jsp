<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List" %>
<%@ page import="it.sincrono.model.Account" %>     

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coop Web Application</title>
</head>
<body background=317121-new-food-background-2032x1208.jpg>
	<form action="../CoopController" method="post">
		<div align="center">
			<img src=1200px-Coop_italia_logo.svg.png height="310" width="750"> <br>
						
				<%			
				List<Tabella> l=(List<Tabella>)request.getAttribute("tutti");
				
				for(int j=0;j<l.size();j++){
					
				out.println("<tr>");
				
					out.println("<td>");
					out.println(l.get(j).getIdCategorieProdotti());
					out.println("</td>");
					
					out.println("<td>");
					out.println(l.get(j).getCategorie());
					out.println("</td>");	
					
				out.println("</tr>");
				}			
				%>
			
		</div>
	</form>
</body>
</html>