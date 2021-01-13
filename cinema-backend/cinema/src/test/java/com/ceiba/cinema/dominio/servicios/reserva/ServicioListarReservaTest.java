package com.ceiba.cinema.dominio.servicios.reserva;

import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.cinema.testdatabuilder.ReservaTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarReservaTest {

    public ServicioListarReserva servicioListarReserva;
    public RepositorioReserva repositorioReserva;

    @Test
    public void listarReservaTest(){
        //Arrange
        List<Reserva> reservas = new ArrayList<>();
        Reserva reserva = new ReservaTestDataBuilder().build();
        reservas.add(reserva);

        repositorioReserva = Mockito.mock(RepositorioReserva.class);
        servicioListarReserva = new ServicioListarReserva(repositorioReserva);
        Mockito.when(servicioListarReserva.ejecutar()).thenReturn(reservas);

        //Act
        List<Reserva> reservasLista = servicioListarReserva.ejecutar();

        //Assert
        Assertions.assertEquals(reservasLista.get(0).getValorTotal(), 50000d);
        Assertions.assertEquals(reservasLista.get(0).getCliente().getNombre(), "Peter");

    }

}
