package com.ceiba.cinema.dominio.servicios.reserva;

import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;

public class ServicioEliminarReserva {

    private final RepositorioReserva repositorioReserva;

    public ServicioEliminarReserva(RepositorioReserva repositorioReserva){
        this.repositorioReserva = repositorioReserva;
    }

    public void ejecutar(Integer idReserva){
        this.repositorioReserva.eliminarReserva(idReserva);
    }
}
