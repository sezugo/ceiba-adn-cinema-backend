package com.ceiba.cinema.dominio.modelo.dto;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.Pelicula;

import java.time.LocalDateTime;

public class ReservaDTO {

    private Integer idReserva;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDateTime fecha;
    private Double valorTotal;

    public ReservaDTO(Integer idReserva, Cliente cliente, Pelicula pelicula, LocalDateTime fecha, Double valorTotal) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
    }

    public Integer getIdReserva() { return idReserva; }

    public void setIdReserva(Integer idReserva) { this.idReserva = idReserva; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Pelicula getPelicula() { return pelicula; }

    public void setPelicula(Pelicula pelicula) { this.pelicula = pelicula; }

    public LocalDateTime getFecha() { return fecha; }

    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    public Double getValorTotal() { return valorTotal; }

    ReservaDTO(){ }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
