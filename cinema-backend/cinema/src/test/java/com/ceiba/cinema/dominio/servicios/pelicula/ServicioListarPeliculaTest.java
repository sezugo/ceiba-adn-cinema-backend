package com.ceiba.cinema.dominio.servicios.pelicula;

import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.testdatabuilder.PeliculaDTOTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarPeliculaTest {

    public ServicioListarPelicula servicioListarPelicula;
    public RepositorioPelicula repositorioPelicula;


    @Test
    public void listarPeliculaTest(){
        //Arrange
        List<PeliculaDTO> peliculas = new ArrayList<>();
        PeliculaDTO pelicula = new PeliculaDTOTestDataBuilder().build();
        peliculas.add(pelicula);

        repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
        servicioListarPelicula = new ServicioListarPelicula(repositorioPelicula);
        Mockito.when(servicioListarPelicula.ejecutar()).thenReturn(peliculas);

        //Act
        List<PeliculaDTO> peliculasServicio = servicioListarPelicula.ejecutar();

        //Assert
        Assertions.assertEquals(peliculasServicio.get(0).getValor(), 50000d);
        Assertions.assertEquals(peliculasServicio.get(0).getCategoria(), "Terror");

    }

}
