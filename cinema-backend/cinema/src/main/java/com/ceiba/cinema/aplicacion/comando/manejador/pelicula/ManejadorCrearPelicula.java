package com.ceiba.cinema.aplicacion.comando.manejador.pelicula;

import com.ceiba.cinema.aplicacion.comando.ComandoPelicula;
import com.ceiba.cinema.aplicacion.comando.fabrica.FabricaPelicula;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.servicios.pelicula.ServicioCrearPelicula;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearPelicula {


    private final ServicioCrearPelicula servicioCrearPelicula;
    private final FabricaPelicula fabricaPelicula;

    public ManejadorCrearPelicula(ServicioCrearPelicula servicioCrearPelicula, FabricaPelicula fabricaPelicula) {
        this.servicioCrearPelicula = servicioCrearPelicula;
        this.fabricaPelicula = fabricaPelicula;
    }

    public void ejecutar(ComandoPelicula comandoPelicula){
        Pelicula pelicula = this.fabricaPelicula.crear(comandoPelicula);
        this.servicioCrearPelicula.ejecutar(pelicula);
    }

}
