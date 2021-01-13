package com.ceiba.cinema.dominio.servicios.pelicula;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioActualizarPelicula {

    private RepositorioPelicula repositorioPelicula;

    public ServicioActualizarPelicula(RepositorioPelicula repositorioPelicula){
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(Pelicula pelicula){
        this.repositorioPelicula.actualizarPelicula(pelicula);
    }


}
