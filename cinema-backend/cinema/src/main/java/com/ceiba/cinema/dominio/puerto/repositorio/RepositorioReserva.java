package com.ceiba.cinema.dominio.puerto.repositorio;


import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.modelo.dto.ReservaDTO;

import java.util.List;

public interface RepositorioReserva {

    void crearReserva(Reserva reserva);
    void eliminarReserva(Integer idAlquiler);
    List<ReservaDTO> listarReserva();


}
