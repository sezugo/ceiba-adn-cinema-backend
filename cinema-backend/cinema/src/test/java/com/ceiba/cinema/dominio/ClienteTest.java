package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.cinema.dominio.excepcion.ExcepcionValorVacio;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {


    private static final String VALOR_VACIO = " ";


    @Test
    void crearCliente() {
        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(cliente);
    }

    @Test
    public void validarNombre(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
            new ClienteTestDataBuilder().conNombre(null).build();
            }, "Se debe ingresar el nombre del cliente"
        );
    }

    @Test
    public void validarNombreNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new ClienteTestDataBuilder().conNombre(VALOR_VACIO).build();
                }, "Se debe ingresar el nombre del cliente"
        );
    }

    @Test
    public void validarApellido(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new ClienteTestDataBuilder().conApellido(null).build();
                }, "Se debe ingresar el apellido del cliente"
        );
    }

    @Test
    public void validarApellidoNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new ClienteTestDataBuilder().conApellido(VALOR_VACIO).build();
                }, "Se debe ingresar el apellido del cliente"
        );
    }

    @Test
    public void validarCedula(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new ClienteTestDataBuilder().conCedula(null).build();
                }, "Se debe ingresar la cedula del cliente"
        );
    }

    @Test
    public void validarCedulaNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new ClienteTestDataBuilder().conCedula(VALOR_VACIO).build();
                }, "Se debe ingresar la cedula del cliente"
        );
    }

    @Test
    public void validarCelular(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new ClienteTestDataBuilder().conCelular(null).build();
                }, "Se debe ingresar el celular del cliente"
        );
    }

    @Test
    public void validarCedularNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new ClienteTestDataBuilder().conCelular(VALOR_VACIO).build();
                }, "Se debe ingresar el celular del cliente"
        );
    }

    @Test
    public void validarDireccion(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new ClienteTestDataBuilder().conDireccion(null).build();
                }, "Se debe ingresar la direccion del cliente"
        );
    }

    @Test
    public void validarDireccionNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new ClienteTestDataBuilder().conDireccion(VALOR_VACIO).build();
                }, "Se debe ingresar la direccion del cliente"
        );
    }

    @Test
    public void validarCorreo(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, ()->{
                    new ClienteTestDataBuilder().conCorreo(null).build();
                }, "Se debe ingresar el correo del cliente"
        );
    }

    @Test
    public void validarCorreoNoVacio(){

        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionValorVacio.class, ()->{
                    new ClienteTestDataBuilder().conCorreo(VALOR_VACIO).build();
                }, "Se debe ingresar el correo del cliente"
        );
    }






}
