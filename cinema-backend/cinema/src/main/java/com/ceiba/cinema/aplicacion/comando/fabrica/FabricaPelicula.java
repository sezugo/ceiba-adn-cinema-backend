package com.ceiba.cinema.aplicacion.comando.fabrica;


import com.ceiba.cinema.aplicacion.comando.ComandoPelicula;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import org.springframework.stereotype.Component;

@Component
public class FabricaPelicula {

    public Pelicula crear(ComandoPelicula comandoPelicula){
        return new Pelicula(comandoPelicula.getIdPelicula(), comandoPelicula.getNombre(), comandoPelicula.getCategoria(),
                comandoPelicula.getPublicada(), comandoPelicula.getValor());
    }


}
