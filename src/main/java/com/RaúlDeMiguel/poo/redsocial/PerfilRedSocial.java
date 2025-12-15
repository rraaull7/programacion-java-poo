package com.RaúlDeMiguel.poo.redsocial;

import java.util.ArrayList;


public class PerfilRedSocial {
	
	private String usuario;
	private String nombre;
	private String biografia;
	private String pais;
	private int seguidores;
	
	
	private boolean verificada;
	private Estado estado;
	private ArrayList<Publicacion> publicaciones;
 
	
	
	
	
	
	public PerfilRedSocial(String usuario, String nombre, String biografia, String pais, int seguidores,
			boolean verificada, Estado estado) {
		super();
		
		
		this.usuario = usuario;
		this.nombre = nombre;
		this.biografia = biografia;
		this.pais = pais;
		this.seguidores = seguidores;
		this.verificada = verificada;
		this.estado = estado;
		this.publicaciones = new ArrayList<Publicacion>();
	}
 
	public PerfilRedSocial() {
		super();
		// TODO Auto-generated constructor stub
	}
 
 
	public String getUsuario() {
		return usuario;
	}
 
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
 
	public String getNombre() {
		return nombre;
	}
 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public String getBiografia() {
		return biografia;
	}
 
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
 
	public String getPais() {
		return pais;
	}
 
	public void setPais(String pais) {
		this.pais = pais;
	}
 
	public int getSeguidores() {
		return seguidores;
	}
 
	public void setSeguidores(int seguidores) {
		this.seguidores = seguidores;
	}
 
	public int getTotalPublicaciones() {
		return publicaciones.size();
	}
 
 
	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}
 
	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
 
	public boolean isVerificada() {
		return verificada;
	}
 
	public void setVerificada(boolean verificada) {
		this.verificada = verificada;
	}
 
	public Estado getEstado() {
		return estado;
	}
 
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
 
	
	
	
	public void mostrarInformacion() {
 
		System.out.println(this.nombre);
	}
 
	public void añadirSeguidores(int seguidores) {
		this.seguidores += seguidores;
 
	}
 
	public void cambiarEstadoPerfil(Estado estado) {
		this.estado = estado;
	}
 
	public boolean activo(boolean verificada) {
		if (this.verificada) {
			System.out.println("no esta activo");
		} else {
			System.out.println("esta activo");
		}
		return this.verificada;
	}
 
	public void crearPublicacion(String tituloPub) {
		Publicacion p = new Publicacion();
		this.publicaciones.add(p);
	}
 
	
	
	
	public void mostrarPublicaciones() {
		for (Publicacion publicacion : publicaciones) {
			System.out.println(publicacion);
		}
	}
}



