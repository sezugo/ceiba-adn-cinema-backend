package com.ceiba.cinema.dominio.servicios.reserva;
import com.ceiba.cinema.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;

import java.time.LocalDateTime;

public class ServicioCrearReserva {

    private RepositorioReserva repositorioReserva;


    private static final Integer DIA_QUE_NO_HAY_SERVICIO_AL_CLIENTE = 30;


    public ServicioCrearReserva(RepositorioReserva repositorioReserva){
        this.repositorioReserva = repositorioReserva;

    }

    public void ejecutar(Reserva reserva){

        //VALIDAR LOGICA NEGOCIO
        LocalDateTime fechaActualReserva = LocalDateTime.now();
        diaDelMesSinServicio(fechaActualReserva);
        this.repositorioReserva.crearReserva(reserva);

    }

    //Lógica de Negocio referente a la creación de la reserva
    //Metodo para saber si el día del mes es 30, ya que ese día no hay servicio
    public void diaDelMesSinServicio(LocalDateTime fechaActual){
        Integer diaDelMes = fechaActual.getDayOfMonth();
        if(diaDelMes.equals(DIA_QUE_NO_HAY_SERVICIO_AL_CLIENTE)){
            throw new ExcepcionGeneral(ExcepcionGeneral.NO_HAY_RESERVAS_lOS_DIAS_30);
        }
    }


}
