package com.RaúlDeMiguel.poo.redsocial;

public class GeneradorPerfiles {

	


	
	public static PerfilRedSocial crearPerfilPrueba(String nombreUsuario) {
		
	PerfilRedSocial perfil = new PerfilRedSocial();
	perfil.setNombre(nombreUsuario);
	perfil.setPais("España");
		return perfil;
	}

	public static PerfilRedSocial crearPerfilPrueba(String nombreUsuario, int numeroPublicaciones) {
		PerfilRedSocial perfil = crearPerfilPrueba(nombreUsuario);
		return perfil;

	}

	
	
	public static void main(String[] args) {
		PerfilRedSocial perfil = new PerfilRedSocial();
		perfil.setNombre("Raul");
		System.out.println(perfil.getNombre());
		perfil.setNombre("Ivan");
		System.out.println(perfil.getNombre());
		
		
		
		
	}

}
