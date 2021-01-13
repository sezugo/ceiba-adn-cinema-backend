package com.ceiba.cinema.dominio.servicios.pelicula;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.testdatabuilder.PeliculaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioActualizarPeliculaTest {

    public ServicioActualizarPelicula servicioActualizarPelicula;
    public ServicioCrearPelicula servicioCrearPelicula;
    public RepositorioPelicula repositorioPelicula;

    @Test
    public void actualizarPeliculaTest(){
        //Arrange
        repositorioPelicula = Mockito.mock(RepositorioPelicula.class);
        servicioActualizarPelicula = new ServicioActualizarPelicula(repositorioPelicula);
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        servicioCrearPelicula = new ServicioCrearPelicula(repositorioPelicula);
        servicioCrearPelicula.ejecutar(pelicula);
        pelicula.setValor(50000d);

        //Act
        servicioActualizarPelicula.ejecutar(pelicula);

        //Assert
        Assertions.assertEquals(pelicula.getValor(), 50000d);
    }

}
