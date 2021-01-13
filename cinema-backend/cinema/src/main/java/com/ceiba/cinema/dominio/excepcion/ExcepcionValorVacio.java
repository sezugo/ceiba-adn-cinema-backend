package com.ceiba.cinema.dominio.excepcion;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExcepcionValorVacio extends RuntimeException{

    private static final long serialVersionUID = 1l;

    public ExcepcionValorVacio (String message){
        super(message);
    }
}
