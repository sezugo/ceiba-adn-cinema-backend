package com.ceiba.cinema.dominio.puerto.repositorio;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;

import java.util.List;

public interface RepositorioPelicula {

    void crearPelicula(Pelicula pelicula);
    void actualizarPelicula(Pelicula pelicula);
    void eliminarPelicula(Integer idPelicula);

    List<PeliculaDTO> listarPeliculas();
}
