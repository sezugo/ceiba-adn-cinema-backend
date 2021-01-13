package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.cinema.dominio.excepcion.ExcepcionValorVacio;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.testdatabuilder.PeliculaTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PeliculaTest {

    private static final String NOMBRE = "Nosferatu";
    private static final String CATEGORIA = "Terror";
    private static final String PUBLICADA = "1922";
    private static final Double VALOR = 50000d;

    private static final String VALOR_VACIO = " ";

    @Test
    public void crearPelicula(){
        //Arrange
        Pelicula pelicula = new PeliculaTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(pelicula);
    }

    @Test
    public void validarNombre(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new PeliculaTestDataBuilder().conNombre(null).build();
                }, "Se debe ingresar el nombre de la pelicula"
        );
    }

    @Test
    public void validarNombreNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new PeliculaTestDataBuilder().conNombre(VALOR_VACIO).build();
                }, "Se debe ingresar el nombre de la pelicula"
        );
    }

    @Test
    public void validarCategoria(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new PeliculaTestDataBuilder().conCategoria(null).build();
                }, "Se debe ingresar la categoria de la pelicula"
        );
    }

    @Test
    public void validarCategoriaNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new PeliculaTestDataBuilder().conCategoria(VALOR_VACIO).build();
                }, "Se debe ingresar la categoria de la pelicula"
        );
    }

    @Test
    public void validarPublicada(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new PeliculaTestDataBuilder().conPublicada(null).build();
                }, "Se debe ingresar la fecha de publicacion de la pelicula"
        );
    }

    @Test
    public void validarPublicadaNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new PeliculaTestDataBuilder().conPublicada(VALOR_VACIO).build();
                }, "Se debe ingresar la fecha de publicacion de la pelicula"
        );
    }

    @Test
    public void crearPeliculaConNombre(){
        //Arrange
        PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder();

        //Act
        Pelicula pelicula = peliculaTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(NOMBRE, pelicula.getNombre());
    }

    @Test
    public void crearPeliculaConCategoria(){
        //Arrange
        PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder();

        //Act
        Pelicula pelicula = peliculaTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CATEGORIA, pelicula.getCategoria());
    }

    @Test
    public void crearPeliculaConPublicada(){
        //Arrange
        PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder();

        //Act
        Pelicula pelicula = peliculaTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(PUBLICADA, pelicula.getPublicada());
    }

    @Test
    public void crearPeliculaConValor(){
        //Arrange
        PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder();

        //Act
        Pelicula pelicula = peliculaTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(VALOR, pelicula.getValor());
    }

}
