package com.ceiba.cinema.infraestructura.adaptador.repositorio;

import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.modelo.dto.ReservaDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.cinema.infraestructura.convertir.reserva.ConvertirReserva;
import com.ceiba.cinema.infraestructura.entidades.ReservaEntidad;
import com.ceiba.cinema.infraestructura.repositoriojpa.RepositorioResevaJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioReservaPostgres implements RepositorioReserva {

    private RepositorioResevaJpa repositorioResevaJpa;
    private ConvertirReserva convertirReserva;

    public RepositorioReservaPostgres(RepositorioResevaJpa repositorioResevaJpa, ConvertirReserva convertirReserva) {
        this.repositorioResevaJpa = repositorioResevaJpa;
        this.convertirReserva = convertirReserva;
    }

    @Override
    public void crearReserva(Reserva reserva){
        ReservaEntidad reservaEntidad = convertirReserva.convertirDominioPorEntidad(reserva);
        repositorioResevaJpa.save(reservaEntidad);
    }

    @Override
    public void eliminarReserva(Integer idReserva){
        repositorioResevaJpa.deleteById(idReserva);
    }

    @Override
    public List<ReservaDTO> listarReserva(){
        List<ReservaEntidad> listaReservaEntidad = repositorioResevaJpa.findAll();
        List<ReservaDTO> listaReserva = new ArrayList<>();
        return convertirReserva.convertirListaReservaEntidadAListaReserva(listaReservaEntidad, listaReserva);
    }
}
