package com.ceiba.cinema.aplicacion.comando;

public class ComandoPelicula {

    private Integer idPelicula;
    private String nombre;
    private String categoria;
    private String publicada;
    private Double valor;

    public ComandoPelicula (Integer idPelicula, String nombre, String categoria, String publicada, Double valor){
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.categoria = categoria;
        this.publicada = publicada;
        this.valor = valor;
    }

    public ComandoPelicula(){

    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPublicada() {
        return publicada;
    }

    public Double getValor() {
        return valor;
    }
}
