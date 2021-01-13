package com.ceiba.cinema.aplicacion.comando.manejador.pelicula;

import com.ceiba.cinema.dominio.servicios.pelicula.ServicioEliminarPelicula;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarPelicula {

    private final ServicioEliminarPelicula servicioEliminarPelicula;

    public ManejadorEliminarPelicula(ServicioEliminarPelicula servicioEliminarPelicula) {
        this.servicioEliminarPelicula = servicioEliminarPelicula;
    }

    public void ejecutar(Integer idPelicula){
        this.servicioEliminarPelicula.ejecutar(idPelicula);
    }

}
