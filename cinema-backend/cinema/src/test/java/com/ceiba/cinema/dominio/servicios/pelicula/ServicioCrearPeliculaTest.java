package com.ceiba.cinema.dominio.servicios.pelicula;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.testdatabuilder.PeliculaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioCrearPeliculaTest {

    public ServicioCrearPelicula servicioCrearPelicula;
    public RepositorioPelicula repositorioPelicula;


    @Test
    public void crearPeliculaTest(){
        //Arrange
        repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
        servicioCrearPelicula = new ServicioCrearPelicula(repositorioPelicula);
        Pelicula pelicula = new PeliculaTestDataBuilder().build();

        //Act
        servicioCrearPelicula.ejecutar(pelicula);

        //Assert
        Assertions.assertEquals(pelicula.getValor(), 50000d);

    }



}
