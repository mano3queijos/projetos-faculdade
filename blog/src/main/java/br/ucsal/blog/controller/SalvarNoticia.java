package br.ucsal.blog.controller;

import java.io.IOException;
import java.util.List;

import br.ucsal.blog.model.Comentario;
import br.ucsal.blog.model.Noticia;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/salvar")
public class SalvarNoticia extends HttpServlet {
 
	
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String texto = request.getParameter("texto");
		List<Noticia> noticias = (List<Noticia>) request.getSession().getAttribute("noticias");
		if(titulo != null){
			Noticia noticia = new Noticia(titulo, texto);
			noticias.add(noticia);
			noticia.getComentarios().add(new Comentario(1, "texto"));
			noticia.getComentarios().add(new Comentario(2, "texto"));
		}
//		resp.getWriter().append("ok");
//		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//		rd.forward(request, resp);
		resp.sendRedirect("/blog/");
		
		
	}
	
}
