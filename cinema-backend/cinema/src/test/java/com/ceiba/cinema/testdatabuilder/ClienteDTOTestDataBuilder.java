package com.ceiba.cinema.testdatabuilder;

import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;

public class ClienteDTOTestDataBuilder {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private String dirrecion;
    private String correo;

    public ClienteDTOTestDataBuilder(){
        this.idCliente = 10;
        this.nombre = "Peter";
        this.apellido = "Parker";
        this.cedula = "1036400700";
        this.celular = "3135811244";
        this.dirrecion = "CL 3 # 33 - 13";
        this.correo = "peterparker@marvel.com";
    }

    public ClienteDTOTestDataBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ClienteDTOTestDataBuilder conApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public ClienteDTOTestDataBuilder conCedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public ClienteDTOTestDataBuilder conCelular(String celular){
        this.celular = celular;
        return this;
    }

    public ClienteDTOTestDataBuilder conDireccion(String dirrecion){
        this.dirrecion = dirrecion;
        return this;
    }

    public ClienteDTOTestDataBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }


    public ClienteDTO build(){
        return new ClienteDTO(this.idCliente, this.nombre, this.apellido, this.cedula, this.celular,
                this.dirrecion, this.correo);
    }



}
