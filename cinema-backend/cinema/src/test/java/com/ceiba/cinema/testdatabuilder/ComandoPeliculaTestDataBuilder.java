package com.ceiba.cinema.testdatabuilder;

import com.ceiba.cinema.aplicacion.comando.ComandoPelicula;

public class ComandoPeliculaTestDataBuilder {

    private Integer idPelicula;
    private String nombre;
    private String categoria;
    private String publicada;
    private Double valor;

    public ComandoPeliculaTestDataBuilder(){
        this.idPelicula = 30;
        this.nombre = "Tiempos Modernos";
        this.categoria = "Comedia";
        this.publicada = "1936";
        this.valor = 50000d;
    }

    public ComandoPeliculaTestDataBuilder conDatos(Integer idPelicula, String categoria){
        this.idPelicula = idPelicula;
        this.categoria = categoria;
        return this;
    }

    public ComandoPelicula build(){
        return new ComandoPelicula(idPelicula, nombre, categoria, publicada, valor);
    }




}
