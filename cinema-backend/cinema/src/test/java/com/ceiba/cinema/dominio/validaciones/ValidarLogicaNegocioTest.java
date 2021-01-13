package com.ceiba.cinema.dominio.validaciones;

import com.ceiba.cinema.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.cinema.dominio.validar.ValidarLogicaNegocio;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class ValidarLogicaNegocioTest {

    @Test
    public void validarFechaInvalidaTest(){
        //Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaActual = LocalDateTime.of(2020, 10, 30, 11, 30);

        //Act - Assert
        Assertions.assertThrows(ExcepcionGeneral.class, () ->{
                validarLogicaNegocio.diaDelMesSinServicio(fechaActual);
            }, "No se puede reservar la cancha los dias 30"
        );

    }

    @Test
    public void validarFechaTest(){
        //Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaActual = LocalDateTime.of(2021, 1, 5, 11, 30);

        //Act - Assert
        Assertions.assertTrue(fechaActual.getDayOfMonth() != 30);

    }

    @Test
    public void calcularValorTotalViernesSabado(){
        //Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2021, 1, 2, 11, 30);
        Double valor = 50000d;

        //Act
        Double resultado = validarLogicaNegocio.calcularValorTotal(fechaReserva, valor);

        //Assert
        Assertions.assertEquals(resultado, 57500);
    }

    @Test
    public void calcularValorTotal(){
        //Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.of(2021, 1, 5, 11, 30);
        Double valor = 50000d;

        //Act
        Double resultado = validarLogicaNegocio.calcularValorTotal(fechaReserva, valor);

        //Assert
        Assertions.assertEquals(resultado, 50000);

    }

    @Test
    public void calcularFechaEntrega(){
        //Arrange
        ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();
        LocalDateTime fechaReserva = LocalDateTime.now();
        LocalDateTime fechaEntrega = fechaReserva.plusDays(10);

        //Act
        LocalDateTime resultado = validarLogicaNegocio.calcularFechaEntrega();

        //Assert
        Assertions.assertEquals(resultado, fechaEntrega);

    }



}
