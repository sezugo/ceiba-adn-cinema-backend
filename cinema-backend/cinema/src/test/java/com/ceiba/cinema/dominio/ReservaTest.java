package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.testdatabuilder.ReservaTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;


public class ReservaTest {


    @Test
    public void crearReserva() {
        //Arrange
        Reserva reserva = new ReservaTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(reserva);
    }

}
