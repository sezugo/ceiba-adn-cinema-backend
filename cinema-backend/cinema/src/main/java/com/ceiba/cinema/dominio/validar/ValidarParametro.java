package com.ceiba.cinema.dominio.validar;

import com.ceiba.cinema.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.cinema.dominio.excepcion.ExcepcionValorVacio;

public class ValidarParametro {

    private ValidarParametro(){
    }

    public static void validarObligatorio(Object valor, String mensaje){
        if (valor == null){
            throw new ExcepcionObligatorio(mensaje);
        }
    }

    public static void validarNoVacio(String valor, String mensaje){
        if (valor.trim().isEmpty()){
            throw  new ExcepcionValorVacio(mensaje);
        }
    }

}
