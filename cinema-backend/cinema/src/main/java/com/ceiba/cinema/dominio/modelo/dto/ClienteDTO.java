package com.ceiba.cinema.dominio.modelo.dto;

import com.ceiba.cinema.dominio.modelo.Cliente;

public class ClienteDTO {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private String dirrecion;
    private String correo;

    public ClienteDTO(Integer idCliente, String nombre, String apellido, String cedula, String celular, String dirrecion, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
        this.dirrecion = dirrecion;
        this.correo = correo;
    }

    public Integer getIdCliente() { return idCliente; }

    public void setIdCliente(Integer idCliente) { this.idCliente = idCliente; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCedula() { return cedula; }

    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getCelular() { return celular; }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDirrecion() { return dirrecion; }

    public void setDirrecion(String dirrecion) { this.dirrecion = dirrecion; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public ClienteDTO(){ }

    public Cliente construir(){
        return new Cliente(this.idCliente, this.nombre, this.apellido, this.cedula, this.celular, this.dirrecion, this.correo);
    }


}
