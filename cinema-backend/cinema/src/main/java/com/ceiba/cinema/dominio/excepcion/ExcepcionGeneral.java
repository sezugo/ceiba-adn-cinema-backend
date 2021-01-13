package com.ceiba.cinema.dominio.excepcion;

public class ExcepcionGeneral extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public static final String NO_HAY_RESERVAS_lOS_DIAS_30 = "No se pueden realizar reservas, no hay servicio los días 30.";

    public ExcepcionGeneral(String mensaje){
        super(mensaje);
    }
}
