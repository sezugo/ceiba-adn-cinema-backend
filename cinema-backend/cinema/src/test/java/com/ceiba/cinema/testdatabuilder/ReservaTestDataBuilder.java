package com.ceiba.cinema.testdatabuilder;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.modelo.Reserva;

import java.time.LocalDateTime;

public class ReservaTestDataBuilder {

    private static final Cliente CLIENTE = new ClienteTestDataBuilder().build();
    private static final Pelicula PELICULA = new PeliculaTestDataBuilder().build();

    private Integer idReserva;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDateTime fecha;
    private Double valorTotal;

    public ReservaTestDataBuilder(){
        this.idReserva = 1;
        this.cliente = CLIENTE;
        this.pelicula = PELICULA;
        this.fecha = LocalDateTime.of(2021, 1,30,10,01);
        this.valorTotal = 50000d;
    }

    public ReservaTestDataBuilder conId(Integer idReserva){
        this.idReserva = idReserva;
        return this;
    }

    public ReservaTestDataBuilder conFecha(LocalDateTime fecha){
        this.fecha = fecha;
        return this;
    }

    public ReservaTestDataBuilder conDatos(){
        this.cliente = new Cliente(10, "Peter", "Parker", "1036400700", "3135811244", "'CL 3 # 33 - 13'", "peterparker@marvel.com" );
        this.pelicula = new Pelicula(20, "Nosferatu", "Terror", "1922", 50000d);
        return this;
    }

    public ReservaTestDataBuilder conValorTotal(Double valorTotal){
        this.valorTotal = valorTotal;
        return this;
    }

    public Reserva build(){
        return new Reserva(idReserva, cliente, pelicula, fecha, valorTotal);
    }




}
