package com.ceiba.cinema.infraestructura.entidades;


import javax.persistence.*;

@Entity
@Table(name = "pelicula")
public class PeliculaEntidad {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Integer idPelicula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "publicada")
    private String publicada;

    @Column(name = "valor")
    private Double valor;

    public PeliculaEntidad(Integer idPelicula, String nombre, String categoria, String publicada, Double valor){
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.categoria = categoria;
        this.publicada = publicada;
        this.valor = valor;
    }

    public PeliculaEntidad(){

    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPublicada() {
        return publicada;
    }

    public void setPublicada(String publicada) {
        this.publicada = publicada;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
