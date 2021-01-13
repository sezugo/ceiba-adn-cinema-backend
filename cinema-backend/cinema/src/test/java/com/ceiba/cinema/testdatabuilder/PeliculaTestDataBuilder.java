package com.ceiba.cinema.testdatabuilder;

import com.ceiba.cinema.dominio.modelo.Pelicula;

public class PeliculaTestDataBuilder {

    private  Integer idPelicula;
    private String nombre;
    private String categoria;
    private String publicada;
    private Double valor;

    public PeliculaTestDataBuilder(){
        this.idPelicula = 20;
        this.nombre = "Nosferatu";
        this.categoria = "Terror";
        this.publicada = "1922";
        this.valor = 50000d;
    }

    public PeliculaTestDataBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public PeliculaTestDataBuilder conCategoria(String categoria){
        this.categoria = categoria;
        return this;
    }

    public PeliculaTestDataBuilder conPublicada(String publicada){
        this.publicada = publicada;
        return this;
    }

    public PeliculaTestDataBuilder conValor(Double valor){
        this.valor = valor;
        return this;
    }

    public Pelicula build(){
        return new Pelicula(this.idPelicula, this.nombre, this.categoria, this.publicada, this.valor);
    }
}
