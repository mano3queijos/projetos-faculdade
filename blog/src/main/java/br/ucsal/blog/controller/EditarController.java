package br.ucsal.blog.controller;

import java.io.IOException;
import java.util.List;

import br.ucsal.blog.model.Noticia;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editar")
public class EditarController extends HttpServlet {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 654946466474688065L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Noticia> noticias = (List<Noticia>) request.getSession().getAttribute("noticias");
		String id = request.getParameter("id");
		int idvalue =Integer.parseInt(id);
		Noticia noticia = null;
		for (int i = 0; i < noticias.size(); i++) {
			if(noticias.get(i).getId() == idvalue){
				noticia = noticias.get(i);
			}
		}
		request.setAttribute("noticia", noticia);
		RequestDispatcher rd = request.getRequestDispatcher("editarform.jsp");
		rd.forward(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		List<Noticia> noticias = (List<Noticia>) request.getSession().getAttribute("noticias");
		String titulo = request.getParameter("titulo");
		String texto = request.getParameter("texto");
		String id = request.getParameter("id");
		int idvalue =Integer.parseInt(id);
		Noticia noticia = null;
		for (int i = 0; i < noticias.size(); i++) {
			if(noticias.get(i).getId() == idvalue){
				noticia = noticias.get(i);
			}
		}
		noticia.setTitulo(titulo);
		noticia.setTexto(texto);
		request.getSession().setAttribute("noticias",noticias);
		response.sendRedirect("/blog/");
	}
	
}
