package com.RaúlDeMiguel.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {

	private String texto;
	private LocalTime hora;
	private int likes;
	
	
	
	
	public Publicacion(String texto, LocalTime hora, int likes) {
		super();
		this.texto = texto;
		this.hora =  LocalTime.now();
		this.likes = likes;
	}




	public String getTexto() {
		return texto;
	}




	public void setTexto(String texto) {
		this.texto = texto;
	}




	public LocalTime getHora() {
		return hora;
	}




	public void setHora(LocalTime hora) {
		this.hora = hora;
	}




	public int getLikes() {
		return likes;
	}




	public void setLikes(int likes) {
		this.likes = likes;
	}




	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}


public void mostrar() {
System.out.println(this.texto);
System.out.println(this.likes);
System.out.println(this.hora);
	
}
	public void darLike() {
		this.likes ++;
		
	}
	

	public int verLike() {
		return this.likes;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Publicacion p = new Publicacion();
p.mostrar();
p.darLike();
p.mostrar();
		
		
		
	}

}
