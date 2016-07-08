
<%@ page errorPage="exception.jsp" %>
<%@ page import="java.util.*" %>
<%@ page import="domaine.Article" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Affiche catalogue</title>
</head>
<body>
       <table align="center" width="80%" cellpadding="1" cellspacing="1" border="1">
          <c:forEach var="article" items="${requestScope.list}" varStatus="status"> 
            <tr>
                 <td>${article}</td>
            </tr>
        </c:forEach>
        </table>
        
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