package com.ceiba.cinema.aplicacion.comando;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.Pelicula;

public class ComandoReserva {

    private Integer idReserva;
    private Cliente cliente;
    private Pelicula pelicula;

    public ComandoReserva(Integer idReserva, Cliente cliente, Pelicula pelicula){
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.pelicula = pelicula;
    }

    public ComandoReserva(){

    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

}
