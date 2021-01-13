package com.ceiba.cinema.dominio.modelo.dto;

import com.ceiba.cinema.dominio.modelo.Pelicula;

public class PeliculaDTO {

    private Integer idPelicula;
    private String nombre;
    private String categoria;
    private String publicada;
    private Double valor;

    public PeliculaDTO(Integer idPelicula, String nombre, String categoria, String publicada, Double valor) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.categoria = categoria;
        this.publicada = publicada;
        this.valor = valor;
    }

    public Integer getIdPelicula() { return idPelicula; }

    public void setIdPelicula(Integer idPelicula) { this.idPelicula = idPelicula; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getPublicada() { return publicada; }

    public void setPublicada(String publicada) { this.publicada = publicada; }

    public Double getValor() { return valor; }

    public void setValor(Double valor) { this.valor = valor; }

    public PeliculaDTO(){ }

    public Pelicula construir(){
        return new Pelicula(this.idPelicula, this.nombre, this.categoria, this.publicada, this.valor);
    }

}
