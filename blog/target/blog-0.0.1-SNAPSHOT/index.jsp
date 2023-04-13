<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lista de Noticias</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<jsp:useBean id="noticias" scope="session" class="java.util.ArrayList"></jsp:useBean>
</head>
<body>
<div class="container">

	<table class="table table-striped-columns">

		<!-- INICIO TABELA -->
		<thead>
			<!-- CABEÇALHO -->
			<tr>
				<!--  LINHA Tabela Row -->
				<th>Titulo</th>
				<th>Texto</th>
			</tr>

		</thead>
		<tbody>
			<!-- CORPO -->
			
			<c:forEach var="n" items="${noticias}">
			<tr>
				<td>${n.titulo}</td>
				<td>${n.texto} </td>
				<td><a href="/blog/excluir?titulo=${n.titulo}">EXCLUIR</a> </td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>