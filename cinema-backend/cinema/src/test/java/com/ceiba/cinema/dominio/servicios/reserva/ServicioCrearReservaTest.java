package com.ceiba.cinema.dominio.servicios.reserva;

import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.cinema.testdatabuilder.ReservaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioCrearReservaTest {

    public ServicioCrearReserva servicioCrearReserva;
    public RepositorioReserva repositorioReserva;

    @Test
    public void crearReservaTest(){
        //Arrange
        repositorioReserva = Mockito.mock(RepositorioReserva.class);
        servicioCrearReserva = new ServicioCrearReserva(repositorioReserva);
        Reserva reserva = new ReservaTestDataBuilder().build();

        //Act
        servicioCrearReserva.ejecutar(reserva);


        //Assert
        Assertions.assertEquals(reserva.getValorTotal(), 50000d);
    }



}
