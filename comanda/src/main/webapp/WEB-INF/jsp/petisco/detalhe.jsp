<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>livro</title>
</head>
<body>

	<form action="/livro" method="post">
		Descri��o: <input type="text" name="descricao">
		T�tulo: <input type="text" name="titulo">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>