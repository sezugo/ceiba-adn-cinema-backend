package com.ceiba.cinema.testdatabuilder;
import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;

public class PeliculaDTOTestDataBuilder {

    private  Integer idPelicula;
    private String nombre;
    private String categoria;
    private String publicada;
    private Double valor;

    public PeliculaDTOTestDataBuilder(){
        this.idPelicula = 20;
        this.nombre = "Nosferatu";
        this.categoria = "Terror";
        this.publicada = "1922";
        this.valor = 50000d;
    }

    public PeliculaDTOTestDataBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public PeliculaDTOTestDataBuilder conCategoria(String categoria){
        this.categoria = categoria;
        return this;
    }

    public PeliculaDTOTestDataBuilder conPublicada(String publicada){
        this.publicada = publicada;
        return this;
    }

    public PeliculaDTOTestDataBuilder conValor(Double valor){
        this.valor = valor;
        return this;
    }

    public PeliculaDTO build(){
        return new PeliculaDTO(this.idPelicula, this.nombre, this.categoria, this.publicada, this.valor);
    }


}
