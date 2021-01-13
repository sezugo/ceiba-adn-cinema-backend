package com.ceiba.cinema.dominio.modelo;

import com.ceiba.cinema.dominio.validar.ValidarParametro;

public class Pelicula {


    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_PELICULA = "Se debe ingresar el nombre de la pelicula";
    private static final String SE_DEBE_INGRESAR_LA_CATEGORIA_DE_LA_PELICULA = "Se debe ingresar la categoria de la pelicula";
    private static final String SE_DEBE_INGRESAR_EL_AÑO_DE_PUBLICACION_DE_LA_PELICULA = "Se debe ingresar el año de publicacion de la pelicula";

    private Integer idPelicula;
    private String nombre;
    private String categoria;
    private String publicada;
    private Double valor;

    public Pelicula (Integer idPelicula, String nombre, String categoria, String publicada, Double valor){

        ValidarParametro.validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_PELICULA);
        ValidarParametro.validarNoVacio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE_DE_LA_PELICULA);

        ValidarParametro.validarObligatorio(categoria, SE_DEBE_INGRESAR_LA_CATEGORIA_DE_LA_PELICULA);
        ValidarParametro.validarNoVacio(categoria, SE_DEBE_INGRESAR_LA_CATEGORIA_DE_LA_PELICULA);

        ValidarParametro.validarObligatorio(publicada, SE_DEBE_INGRESAR_EL_AÑO_DE_PUBLICACION_DE_LA_PELICULA);
        ValidarParametro.validarNoVacio(publicada, SE_DEBE_INGRESAR_EL_AÑO_DE_PUBLICACION_DE_LA_PELICULA);

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

    public Pelicula(){ }
}
