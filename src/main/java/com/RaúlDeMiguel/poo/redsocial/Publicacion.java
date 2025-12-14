package com.RaúlDeMiguel.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {

    private String texto;
    private LocalTime hora;
    private int likes;


    public Publicacion(String texto) {
        super();
        this.texto = texto;
        this.hora = LocalTime.now();
        this.likes = 0;
    }


    public Publicacion() {
        super();
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

    public void mostrar() {
        System.out.println(this.texto);
        System.out.println(this.likes);
        System.out.println(this.hora);

    }

    public void darLike() {
        this.likes += likes;
        System.out.println(likes);
    }

    public int verLike() {
        return this.likes;
    }

}
