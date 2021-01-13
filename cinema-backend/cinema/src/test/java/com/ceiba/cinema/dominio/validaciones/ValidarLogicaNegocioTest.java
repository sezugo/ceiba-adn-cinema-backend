package com.ceiba.cinema.dominio.validaciones;


import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.testdatabuilder.ClienteTestDataBuilder;
import com.ceiba.cinema.testdatabuilder.PeliculaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.time.LocalDateTime;


public class ValidarLogicaNegocioTest {


    private static final LocalDateTime fechaViernes = LocalDateTime.of(2021, 1, 15, 12, 12);
    private static final LocalDateTime fechaSabado = LocalDateTime.of(2021, 1, 16, 12, 12);
    private static final LocalDateTime fechaEntregaDomingo = LocalDateTime.of(2021, 1, 17, 12, 12);
    private static final LocalDateTime fechaEntregaNoEsDomingo = LocalDateTime.of(2021, 1, 13, 12, 12);
    private static final LocalDateTime fechaSemana = LocalDateTime.of(2021, 1, 12, 12, 12);


    @Test
    public void calcularValorReservaDiaViernesTest(){

        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        Reserva reserva = new Reserva(1, cliente, pelicula);
        double precio = 50000d;

        //Act
        double resultado = reserva.calcularValorTotal(fechaViernes, precio);

        //Assert
        Assertions.assertEquals(resultado, 57500d);

    }

    @Test
    public void calcularValorReservaDiaSabadoTest(){

        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        Reserva reserva = new Reserva(1, cliente, pelicula);
        double precio = 50000d;

        //Act
        double resultado = reserva.calcularValorTotal(fechaSabado, precio);

        //Assert
        Assertions.assertEquals(resultado, 57500d);

    }

    @Test
    public void calcularValorReservaDiaSemanaTest(){

        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        Reserva reserva = new Reserva(1, cliente, pelicula);
        double precio = 50000d;

        //Act
        double resultado = reserva.calcularValorTotal(fechaSemana, precio);

        //Assert
        Assertions.assertEquals(resultado, 50000d);

    }

    @Test
    public void calcularFechaEntregaTest(){

        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        Reserva reserva = new Reserva(1, cliente, pelicula);
        Integer fechaEntrega = LocalDateTime.now().plusDays(10).getDayOfMonth();

        //Act
        Integer resultado = reserva.calcularFechaEntrega().getDayOfMonth();

        //Assert
        Assertions.assertEquals(resultado, fechaEntrega);

    }

    @Test
    public void calcularFechaEntregaDomingoTest(){

        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        Reserva reserva = new Reserva(1, cliente, pelicula);
        Integer fechaEntrega = fechaEntregaDomingo.plusDays(1).getDayOfMonth();

        //Act
        Integer resultado = reserva.fechaEntregaReservaCaeDomingo(fechaEntregaDomingo).getDayOfMonth();

        //Assert
        Assertions.assertEquals(resultado, fechaEntrega);

    }

    @Test
    public void calcularFechaEntregaNoEsDomingoTest(){

        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();
        Pelicula pelicula = new PeliculaTestDataBuilder().build();
        Reserva reserva = new Reserva(1, cliente, pelicula);
        Integer fechaEntrega = fechaEntregaNoEsDomingo.getDayOfMonth();

        //Act
        Integer resultado = reserva.fechaEntregaReservaCaeDomingo(fechaEntregaNoEsDomingo).getDayOfMonth();

        //Assert
        Assertions.assertEquals(resultado, fechaEntrega);

    }


}
