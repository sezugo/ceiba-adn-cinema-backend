package com.ceiba.cinema.dominio.servicios.pelicula;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioCrearPelicula {

    private RepositorioPelicula repositorioPelicula;

    public ServicioCrearPelicula(RepositorioPelicula repositorioPelicula){
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(Pelicula pelicula){
        this.repositorioPelicula.crearPelicula(pelicula);


    }

}
