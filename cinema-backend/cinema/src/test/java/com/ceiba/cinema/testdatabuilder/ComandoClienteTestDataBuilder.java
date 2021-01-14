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
        this.idCliente = 1;
        this.nombre = "Peter1";
        this.apellido = "Parker1";
        this.cedula = "10364007001";
        this.celular = "31358112441";
        this.dirrecion = "CL 3 # 33 - 131";
        this.correo = "peterparker1@marvel.com";
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
