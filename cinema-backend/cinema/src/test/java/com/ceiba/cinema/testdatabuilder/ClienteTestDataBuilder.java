package com.ceiba.cinema.testdatabuilder;

import com.ceiba.cinema.dominio.modelo.Cliente;

public class ClienteTestDataBuilder {


    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private String dirrecion;
    private String correo;

    public ClienteTestDataBuilder(){
        this.idCliente = 10;
        this.nombre = "Peter";
        this.apellido = "Parker";
        this.cedula = "1036400700";
        this.celular = "3135811244";
        this.dirrecion = "CL 3 # 33 - 13";
        this.correo = "peterparker@marvel.com";
    }

    public ClienteTestDataBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ClienteTestDataBuilder conApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public ClienteTestDataBuilder conCedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public ClienteTestDataBuilder conCelular(String celular){
        this.celular = celular;
        return this;
    }

    public ClienteTestDataBuilder conDireccion(String dirrecion){
        this.dirrecion = dirrecion;
        return this;
    }

    public ClienteTestDataBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }


    public Cliente build(){
        return new Cliente(this.idCliente, this.nombre, this.apellido, this.cedula, this.celular,
                this.dirrecion, this.correo);
    }







}
