package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.cinema.dominio.excepcion.ExcepcionValorVacio;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private static final String NOMBRE = "Peter";
    private static final String APELLIDO = "Parker";
    private static final String CEDULA = "1036400700";
    private static final String CELULAR = "3135811244";
    private static final String DIRECCION = "CL 3 # 33 - 13";
    private static final String CORREO = "peterparker@marvel.com";

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

    @Test
    public void crearClienteConNombre(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder();

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(NOMBRE, cliente.getNombre());
    }

    @Test
    public void crearClienteConApellido(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder();

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(APELLIDO, cliente.getApellido());
    }

    @Test
    public void crearClienteConCedula(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder();

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CEDULA, cliente.getCedula());
    }

    @Test
    public void crearClienteConCelular(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder();

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CELULAR, cliente.getCelular());
    }

    @Test
    public void crearClienteConDireccion(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder();

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(DIRECCION, cliente.getDirrecion());
    }

    @Test
    public void crearClienteConCorreo(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder();

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CORREO, cliente.getCorreo());
    }

}
