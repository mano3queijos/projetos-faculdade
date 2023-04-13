package br.ucsal.blog.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import br.ucsal.blog.model.Comentario;
import br.ucsal.blog.model.Noticia;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/like")
public class LikeController extends HttpServlet {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 654946466474688065L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Noticia> noticias = (List<Noticia>) request.getSession().getAttribute("noticias");
		String id = request.getParameter("id");
		int idvalue =Integer.parseInt(id);
		String n = request.getParameter("n");
		int nvalue =Integer.parseInt(n);
		Noticia noticia = null;
		Comentario c = null;
		for (int i = 0; i < noticias.size(); i++) {
			if(noticias.get(i).getId() == nvalue){
				noticia = noticias.get(i);
				for (Comentario comentario : noticia.getComentarios()) {
					if(comentario.getId() == idvalue) {
						int l = comentario.getLikes()+1;
						comentario.setLikes(l);
					}
				}
			}
		}
		
		request.setAttribute("noticia", noticia);
		RequestDispatcher rd = request.getRequestDispatcher("editarform.jsp");
		rd.forward(request, response);
	}
	
	

	
}
