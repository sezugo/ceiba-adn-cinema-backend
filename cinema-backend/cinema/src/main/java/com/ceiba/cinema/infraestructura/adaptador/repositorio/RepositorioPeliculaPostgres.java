package com.ceiba.cinema.infraestructura.adaptador.repositorio;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.infraestructura.convertir.pelicula.ConvertirPelicula;
import com.ceiba.cinema.infraestructura.entidades.PeliculaEntidad;
import com.ceiba.cinema.infraestructura.repositoriojpa.RepositorioPeliculaJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioPeliculaPostgres implements RepositorioPelicula {

    private RepositorioPeliculaJpa repositorioPeliculaJpa;
    private ConvertirPelicula convertirPelicula;

    public RepositorioPeliculaPostgres(RepositorioPeliculaJpa repositorioPeliculaJpa, ConvertirPelicula convertirPelicula) {
        this.repositorioPeliculaJpa = repositorioPeliculaJpa;
        this.convertirPelicula = convertirPelicula;
    }

    @Override
    public void crearPelicula(Pelicula pelicula){
        PeliculaEntidad peliculaEntidad = convertirPelicula.convertirPeliculaDominioAPeliculaEntidad(pelicula);
        repositorioPeliculaJpa.save(peliculaEntidad);
    }

    @Override
    public void eliminarPelicula(Integer idPelicula){
        repositorioPeliculaJpa.deleteById(idPelicula);
    }

    @Override
    public void actualizarPelicula(Pelicula pelicula){
        PeliculaEntidad peliculaEntidad = convertirPelicula.convertirPeliculaDominioAPeliculaEntidad(pelicula);
        repositorioPeliculaJpa.save(peliculaEntidad);
    }

    @Override
    public List<PeliculaDTO> listarPeliculas(){
        List<PeliculaEntidad> listaPeliculaEntidad = repositorioPeliculaJpa.findAll();
        List<PeliculaDTO> listaPelicula = new ArrayList<>();
        return convertirPelicula.convertirListaPeliculaEntidadAListaPelicula(listaPeliculaEntidad, listaPelicula);
    }


}
