package com.ceiba.cinema.aplicacion.comando.manejador.reserva;

import com.ceiba.cinema.dominio.servicios.reserva.ServicioEliminarReserva;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarReserva {

    private final ServicioEliminarReserva eliminarReserva;

    public ManejadorEliminarReserva(ServicioEliminarReserva eliminarReserva) {
        this.eliminarReserva = eliminarReserva;
    }

    public void ejecutar(Integer idReserva){
        this.eliminarReserva.ejecutar(idReserva);
    }
}
