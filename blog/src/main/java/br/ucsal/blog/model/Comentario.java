package br.ucsal.blog.model;

public class Comentario {

	
	
	private int id;
	private String texto;
	private int likes = 0;
	
	
	public Comentario(int id, String texto) {
		this.id = id;
		this.texto = texto;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	
	
}
