<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de produtos</title>
</head>
<body>
	<form action="/TesteSpringProjeto/produtos" method="post">
		<div>
			<label>Titulo:</label>
			<input type="text" name="titulo"/>
		</div>
		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="desc"></textarea>
		</div>
		<div>
			<label>Numero paginas</label>
			<input type="text" name="numPagina"/>
		</div>
		<div>
			<input type="submit" value="Salvar"/>
		</div>
	</form>
</body>
</html>