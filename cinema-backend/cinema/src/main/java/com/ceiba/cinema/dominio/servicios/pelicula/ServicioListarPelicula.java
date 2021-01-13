package com.ceiba.cinema.dominio.servicios.pelicula;


import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

import java.util.List;

public class ServicioListarPelicula {

    private RepositorioPelicula repositorioPelicula;

    public ServicioListarPelicula(RepositorioPelicula repositorioPelicula){
        this.repositorioPelicula = repositorioPelicula;
    }

    public List<PeliculaDTO> ejecutar(){
        return this.repositorioPelicula.listarPeliculas();
    }

}
