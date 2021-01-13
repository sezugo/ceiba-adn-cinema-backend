package com.ceiba.cinema.dominio.dto;

import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.testdatabuilder.ClienteDTOTestDataBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteDTOTest {

    private static final String NOMBRE = "Peter";
    private static final String APELLIDO = "Parker";
    private static final String CEDULA = "1036400700";
    private static final String CELULAR = "3135811244";
    private static final String DIRECCION = "CL 3 # 33 - 13";
    private static final String CORREO = "peterparker@marvel.com";


    @Test
    void crearClienteDTO() {
        //Arrange
        ClienteDTO cliente = new ClienteDTOTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(cliente);
    }

    @Test
    public void crearClienteDTOConNombre(){
        //Arrange
        ClienteDTOTestDataBuilder clienteDTOTestDataBuilder = new ClienteDTOTestDataBuilder();

        //Act
        ClienteDTO cliente = clienteDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(NOMBRE, cliente.getNombre());
    }

    @Test
    public void crearClienteDTOConApellido(){
        //Arrange
        ClienteDTOTestDataBuilder clienteDTOTestDataBuilder = new ClienteDTOTestDataBuilder();

        //Act
        ClienteDTO cliente = clienteDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(APELLIDO, cliente.getApellido());
    }

    @Test
    public void crearClienteDTOConCedula(){
        //Arrange
        ClienteDTOTestDataBuilder clienteDTOTestDataBuilder = new ClienteDTOTestDataBuilder();

        //Act
        ClienteDTO cliente = clienteDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CEDULA, cliente.getCedula());
    }

    @Test
    public void crearClienteDTOConCelular(){
        //Arrange
        ClienteDTOTestDataBuilder clienteDTOTestDataBuilder = new ClienteDTOTestDataBuilder();

        //Act
        ClienteDTO cliente = clienteDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CELULAR, cliente.getCelular());
    }

    @Test
    public void crearClienteDTOConDireccion(){
        //Arrange
        ClienteDTOTestDataBuilder clienteDTOTestDataBuilder = new ClienteDTOTestDataBuilder();

        //Act
        ClienteDTO cliente = clienteDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(DIRECCION, cliente.getDirrecion());
    }

    @Test
    public void crearClienteDTOConCorreo(){
        //Arrange
        ClienteDTOTestDataBuilder clienteDTOTestDataBuilder = new ClienteDTOTestDataBuilder();

        //Act
        ClienteDTO cliente = clienteDTOTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CORREO, cliente.getCorreo());
    }


}
