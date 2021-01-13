package com.ceiba.cinema.dominio.dto;


import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import com.ceiba.cinema.testdatabuilder.PeliculaDTOTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PeliculaDTOTest {

    private static final String NOMBRE = "Nosferatu";
    private static final String CATEGORIA = "Terror";
    private static final String PUBLICADA = "1922";
    private static final Double VALOR = 50000d;

    @Test
    public void crearPeliculaDTO(){
        //Arrange
        PeliculaDTO pelicula = new PeliculaDTOTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(pelicula);
    }

    @Test
    public void crearPeliculaConNombre(){
        //Arrange
        PeliculaDTOTestDataBuilder peliculaDTOTestDataBuilder = new PeliculaDTOTestDataBuilder();

        //Act
        PeliculaDTO pelicula = peliculaDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(NOMBRE, pelicula.getNombre());
    }

    @Test
    public void crearPeliculaConCategoria(){
        //Arrange
        PeliculaDTOTestDataBuilder peliculaDTOTestDataBuilder = new PeliculaDTOTestDataBuilder();

        //Act
        PeliculaDTO pelicula = peliculaDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CATEGORIA, pelicula.getCategoria());
    }

    @Test
    public void crearPeliculaConPublicada(){
        //Arrange
        PeliculaDTOTestDataBuilder peliculaDTOTestDataBuilder = new PeliculaDTOTestDataBuilder();

        //Act
        PeliculaDTO pelicula = peliculaDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(PUBLICADA, pelicula.getPublicada());
    }

    @Test
    public void crearPeliculaConValor(){
        //Arrange
        PeliculaDTOTestDataBuilder peliculaDTOTestDataBuilder = new PeliculaDTOTestDataBuilder();

        //Act
        PeliculaDTO pelicula = peliculaDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(VALOR, pelicula.getValor());
    }


}
