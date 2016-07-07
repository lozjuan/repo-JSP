<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Affiche catalogue</title>
</head>
<body>

	<!-- bouton ajouter, vider, consulter (rediriger vers affichePanier -->
	<form action="AjouterPanier" method="post">
		<input type="submit" value="ajouter dans le panier" />
	</form>
	
	<form action="ViderPanier" method="post">
		<input type="submit" value="enlever du panier" />
	</form>
	
	<form action="Panier" method="post">
		<input type="submit" value="afficher panier" />
	</form>
	
	<!-- foreach catalogue.item 
		
	-->

</body>
</html>