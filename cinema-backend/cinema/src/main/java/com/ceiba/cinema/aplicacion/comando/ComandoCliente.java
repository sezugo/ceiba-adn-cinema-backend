package com.ceiba.cinema.aplicacion.comando;

public class ComandoCliente {

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private String dirrecion;
    private String correo;

    public ComandoCliente (Integer idCliente, String nombre, String apellido, String cedula, String celular, String direccion, String correo){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
        this.dirrecion = direccion;
        this.correo = correo;
    }

    public ComandoCliente(){

    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCelular() {
        return celular;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public String getCorreo() {
        return correo;
    }
}
