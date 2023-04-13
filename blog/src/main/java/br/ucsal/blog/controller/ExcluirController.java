package br.ucsal.blog.controller;

import java.io.IOException;
import java.util.List;

import br.ucsal.blog.model.Noticia;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/excluir")
public class ExcluirController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Noticia> noticias = (List<Noticia>) request.getSession().getAttribute("noticias");
		String titulo = request.getParameter("titulo");
		int indice = -1;
		for (int i = 0; i < noticias.size(); i++) {
			if(noticias.get(i).getTitulo().equals(titulo)){
				indice = i;
			}
		}
		if(indice != -1) noticias.remove(indice);
		response.sendRedirect("/blog/");

		
	}
	
}
