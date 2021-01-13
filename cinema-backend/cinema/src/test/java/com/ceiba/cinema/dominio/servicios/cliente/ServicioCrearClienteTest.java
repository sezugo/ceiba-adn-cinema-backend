package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioCrearClienteTest {

    private static final String EL_CLIENTE_YA_EXISTE = "El cliente ya existe";

    public ServicioCrearCliente servicioCrearCliente;
    public RepositorioCliente repositorioCliente;

    @Test
    public void crearClienteTest(){
        //Arrange
        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioCrearCliente = new ServicioCrearCliente(repositorioCliente);
        Cliente cliente = new ClienteTestDataBuilder().build();

        //Act
        servicioCrearCliente.ejecutar(cliente);

        //Assert
        Assertions.assertEquals(cliente.getCedula(), "1036400700");

    }

    @Test
    public void crearClienteRepetidoTest(){
        //Arrange
        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioCrearCliente = new ServicioCrearCliente(repositorioCliente);
        Cliente cliente = new ClienteTestDataBuilder().build();
        servicioCrearCliente.ejecutar(cliente);
        Cliente cliente2 = new  ClienteTestDataBuilder().build();

        //Act - Assert
        try {
            servicioCrearCliente.ejecutar(cliente2);
        }
        catch (ExcepcionGeneral e){
            Assertions.assertEquals(EL_CLIENTE_YA_EXISTE, e.getMessage());
        }

    }

    @Test
    public void buscarPorCedulaTest(){

        //Arrange
        repositorioCliente = Mockito.mock(RepositorioCliente.class);


        //Act
        Cliente cliente = repositorioCliente.buscarPorCedula(null);

        //Assert
        Assertions.assertEquals(cliente, null);


    }








}
