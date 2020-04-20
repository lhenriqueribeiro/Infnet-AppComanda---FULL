<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Cardapios</title>
</head>
<body>
	<h4>Listagem de Cardapios</h4>
	
	<h4><a href="bebida">Bebida</a> | <a href="/petisco">Petisco</a> | <a href="/sobremesa">Sobremesa</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${cardapios}">
		<h5>${item} <a href="/cardapio/${item.idCardapio}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>