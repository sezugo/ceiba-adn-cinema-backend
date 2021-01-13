package com.ceiba.cinema.aplicacion.comando.manejador.pelicula;

import com.ceiba.cinema.aplicacion.comando.ComandoPelicula;
import com.ceiba.cinema.aplicacion.comando.fabrica.FabricaPelicula;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.servicios.pelicula.ServicioActualizarPelicula;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarPelicula {

    private final ServicioActualizarPelicula servicioActualizarPelicula;
    private final FabricaPelicula fabricaPelicula;

    public ManejadorActualizarPelicula(ServicioActualizarPelicula servicioActualizarPelicula, FabricaPelicula fabricaPelicula) {
        this.servicioActualizarPelicula = servicioActualizarPelicula;
        this.fabricaPelicula = fabricaPelicula;
    }

    public void ejecutar(ComandoPelicula comandoPelicula){
        Pelicula pelicula = this.fabricaPelicula.crear(comandoPelicula);
        this.servicioActualizarPelicula.ejecutar(pelicula);
    }



}
