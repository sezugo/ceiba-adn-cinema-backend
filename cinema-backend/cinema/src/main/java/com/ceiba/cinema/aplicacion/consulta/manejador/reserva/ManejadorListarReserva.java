package com.ceiba.cinema.aplicacion.consulta.manejador.reserva;



import com.ceiba.cinema.dominio.modelo.dto.ReservaDTO;
import com.ceiba.cinema.dominio.servicios.reserva.ServicioListarReserva;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarReserva {

    private final ServicioListarReserva servicioListarReserva;

    public ManejadorListarReserva(ServicioListarReserva servicioListarReserva) {
        this.servicioListarReserva = servicioListarReserva;
    }

    public List<ReservaDTO> ejecutar(){
        return this.servicioListarReserva.ejecutar();
    }

}
