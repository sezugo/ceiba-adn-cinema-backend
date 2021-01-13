package com.ceiba.cinema.infraestructura.convertir.reserva;

import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.modelo.dto.ReservaDTO;
import com.ceiba.cinema.infraestructura.entidades.ReservaEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirReserva {

    private ModelMapper modelMapper = new ModelMapper();

    public ReservaEntidad convertirDominioPorEntidad(Reserva reserva){
        return modelMapper.map(reserva, ReservaEntidad.class);
    }

    public List<ReservaDTO> convertirListaReservaEntidadAListaReserva(List<ReservaEntidad> listaReservaEntidad, List<ReservaDTO> listaReserva ){
        for(ReservaEntidad reservaEntidad: listaReservaEntidad){
            ReservaDTO reserva = modelMapper.map(reservaEntidad, ReservaDTO.class);
            listaReserva.add(reserva);
        }
        return listaReserva;
    }




}
