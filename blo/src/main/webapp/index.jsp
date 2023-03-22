<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de usuários</title>
</head>
<body>

<%

/* Aqui DENTRE É JAVAA */
String[][] usuario = new String[3][2];

usuario[0][0] = "joão";
usuario[0][1] = "fabricio";
usuario[1][0] = "emanuel";
usuario[1][1] = "hamilton";
usuario[2][0] = "serwerewr";
usuario[2][1] = "werwer";
usuario[3][0] = "jowerweão";

System.out.println("oi");
out.write("Vai para p html");




%>


	<table>
		<thead>
			<tr>
				<th>login</th>
				<th>Senha</th>


			</tr>
		<tbody>
			<tr>
				<td>fabricio</td>
				<td>EMANUEL</td>
			</tr>
			
			<%
			
			for(String[]user : usuario){
				out.write("<tr><td>");
				out.write(user[0]);
				out.write("<tr><td>");
				out.write(user[1]);

			}
			
			%>
		</tbody>
		


		</thead>


	</table>
</body>
</html>