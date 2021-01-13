package com.ceiba.cinema.testdatabuilder;

import com.ceiba.cinema.aplicacion.comando.ComandoReserva;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.Pelicula;

import java.time.LocalDateTime;

public class ComandoReservaTestDataBuilder {

    private static final Cliente CLIENTE = new ClienteTestDataBuilder().build();
    private static final Pelicula PELICULA = new PeliculaTestDataBuilder().build();

    private Integer idReserva;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDateTime fecha;
    private Double valorTotal;

    public ComandoReservaTestDataBuilder(){
        this.idReserva = 1;
        this.cliente = CLIENTE;
        this.pelicula = PELICULA;
        this.fecha = LocalDateTime.of(2021, 1,30,10,01);
        this.valorTotal = 50000d;
    }

    public ComandoReserva build(){
        return new ComandoReserva(idReserva, cliente, pelicula);
    }


}
