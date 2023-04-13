<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Formulario de Noticias</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<jsp:useBean id="noticias" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
<body>
<div class="container">

	Formulario:<br>
	<form action="/blog/editar" method="post">
		<div class="form-floating mb-3">
  			<input name="titulo" readonly="readonly" value="${noticia.titulo}" required="required" type="text" class="form-control" id="tituloId" placeholder="Seu Titulo...">
  			<label for="tituloId" class="form-label">Titulo:</label>
		</div>
		<div class="form-floating mb-3">
  			<textarea required="required" class="form-control" placeholder=" " id="textoId"  name="texto" >${noticia.texto}</textarea>
  			<label for="textoId">Texto:</label>
		</div>
		<button class="btn btn-primary" type="submit">Salvar</button>
	</form>
</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>