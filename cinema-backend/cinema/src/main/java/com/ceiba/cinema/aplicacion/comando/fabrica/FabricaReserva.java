package com.ceiba.cinema.aplicacion.comando.fabrica;

import com.ceiba.cinema.aplicacion.comando.ComandoReserva;
import com.ceiba.cinema.dominio.modelo.Reserva;
import org.springframework.stereotype.Component;

@Component
public class FabricaReserva {

    public Reserva crear(ComandoReserva comandoReserva){
        return new Reserva(comandoReserva.getIdReserva(), comandoReserva.getCliente(), comandoReserva.getPelicula());
    }

}
