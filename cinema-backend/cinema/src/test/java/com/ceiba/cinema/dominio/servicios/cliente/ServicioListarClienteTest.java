package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.testdatabuilder.ClienteDTOTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ServicioListarClienteTest {

    public ServicioListarCliente servicioListarCliente;
    public RepositorioCliente repositorioCliente;

    @Test
    public void listarClienteTest(){
        //Arrange
        List<ClienteDTO> clientes = new ArrayList<>();
        ClienteDTO cliente = new ClienteDTOTestDataBuilder().build();
        clientes.add(cliente);

        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioListarCliente = new ServicioListarCliente(repositorioCliente);
        Mockito.when(servicioListarCliente.ejecutar()).thenReturn(clientes);

        //Act
        List<ClienteDTO> clientesServicio = servicioListarCliente.ejecutar();

        //Assert
        Assertions.assertEquals(clientesServicio.get(0).getNombre(), "Peter");
        Assertions.assertEquals(clientesServicio.get(0).getIdCliente(), 10);

    }


}
