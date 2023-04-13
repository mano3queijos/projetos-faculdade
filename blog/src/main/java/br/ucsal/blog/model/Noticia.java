package br.ucsal.blog.model;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
	
	private int id;
	
	private String titulo;
	
	private String texto;
	
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public List<Comentario> getComentarios() {
		return comentarios;
	}



	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	private static int index = 0;
	

	public Noticia() {
		
	}
	
	
	
	public Noticia(String titulo, String texto) {
		super();
		index = index + 1;
		this.id = index;
		this.titulo = titulo;
		this.texto = texto;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	//...
	
	

}
