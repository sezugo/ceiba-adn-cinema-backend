package com.ceiba.cinema.dominio.servicios.pelicula;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioEliminarPelicula {

    private RepositorioPelicula repositorioPelicula;

    public ServicioEliminarPelicula(RepositorioPelicula repositorioPelicula){
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(Integer idPelicula){
        this.repositorioPelicula.eliminarPelicula(idPelicula);
    }

}
