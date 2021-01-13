package com.ceiba.cinema.dominio.validar;


import com.ceiba.cinema.dominio.excepcion.ExcepcionGeneral;

import java.time.LocalDateTime;

public class ValidarLogicaNegocio {

    private static final Integer DIA_QUE_NO_HAY_SERVICIO_AL_CLIENTE = 30;
    private static final String VIERNES = "FRIDAY";
    private static final String SABADO = "SATURDAY";
    private static final Double PORCENTAJE_VALOR_ADICIONAL = 0.15d;


    public void diaDelMesSinServicio(LocalDateTime fechaActual){
        Integer diaDelMes = fechaActual.getDayOfMonth();
        if(diaDelMes.equals(DIA_QUE_NO_HAY_SERVICIO_AL_CLIENTE)){
            throw new ExcepcionGeneral(ExcepcionGeneral.NO_HAY_RESERVAS_lOS_DIAS_30);
        }
    }

    public Double calcularValorTotal(LocalDateTime fechaReserva, Double valor){
        Double aumento;
        String diaSemana = fechaReserva.getDayOfWeek().toString();
        if (diaSemana.equals(VIERNES) || diaSemana.equals(SABADO)){
            aumento = (valor*PORCENTAJE_VALOR_ADICIONAL);
            return (aumento + valor);
        }
        else{
            return valor;
        }
    }

    public LocalDateTime calcularFechaEntrega(){
        LocalDateTime fechaReserva = LocalDateTime.now();
        return fechaReserva.plusDays(10);
    }


}
