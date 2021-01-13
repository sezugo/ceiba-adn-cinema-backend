package com.ceiba.cinema.testdatabuilder;

import com.ceiba.cinema.aplicacion.comando.ComandoCliente;

public class ComandoClienteTestDataBuilder {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private String dirrecion;
    private String correo;

    public ComandoClienteTestDataBuilder(){
        this.idCliente = 10;
        this.nombre = "Peter";
        this.apellido = "Parker";
        this.cedula = "1036400700";
        this.celular = "3135811244";
        this.dirrecion = "CL 3 # 33 - 13";
        this.correo = "peterparker@marvel.com";
    }

    public ComandoClienteTestDataBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ComandoClienteTestDataBuilder conCedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public ComandoClienteTestDataBuilder conDatos(String cedula, Integer idCliente){
        this.cedula = cedula;
        this.idCliente = idCliente;
        return this;
    }


    public ComandoCliente build(){
        return new ComandoCliente(idCliente, nombre, apellido, cedula, celular, dirrecion, correo);
    }


}
