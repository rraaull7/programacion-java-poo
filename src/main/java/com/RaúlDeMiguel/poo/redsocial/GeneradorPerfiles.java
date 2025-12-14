package com.RaúlDeMiguel.poo.redsocial;

public class GeneradorPerfiles {

    private String usuario;
    private String nombre;
    private String biografia;
    private String pais;


    public GeneradorPerfiles() {
        super();
    }

    public static String crearPerfilPrueba(String nombreUsuario) {

        GeneradorPerfiles perfil = new GeneradorPerfiles();
        perfil.setUsuario(nombreUsuario);
        perfil.setNombre();
        perfil.setBiografia();
        perfil.setPais();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

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

}
