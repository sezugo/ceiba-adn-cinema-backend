package com.ceiba.cinema.dominio.servicios.pelicula;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.testdatabuilder.PeliculaTestDataBuilder;
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
        List<Pelicula> peliculas = new ArrayList<>();
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        peliculas.add(pelicula);

        repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
        servicioListarPelicula = new ServicioListarPelicula(repositorioPelicula);
        Mockito.when(servicioListarPelicula.ejecutar()).thenReturn(peliculas);

        //Act
        List<Pelicula> peliculasServicio = servicioListarPelicula.ejecutar();

        //Assert
        Assertions.assertEquals(peliculasServicio.get(0).getValor(), 50000d);
        Assertions.assertEquals(peliculasServicio.get(0).getCategoria(), "Terror");

    }
}
