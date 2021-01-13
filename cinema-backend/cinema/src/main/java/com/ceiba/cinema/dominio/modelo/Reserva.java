package com.ceiba.cinema.dominio.modelo;


import com.ceiba.cinema.dominio.validar.ValidarParametro;

import java.time.LocalDateTime;

public class Reserva {

    private static final String SE_DEBE_INGRESAR_EL_CLIENTE_QUE_ALQUILA_LA_PELICULA = "Se debe ingresar el cliente que reserva la pelicula";
    private static final String SE_DEBE_INGRESAR_LA_PELICULA_QUE_SE_VA_RESERVAR = "Se debe ingresar la pelicula que se va reservar";

    private static final String VIERNES = "FRIDAY";
    private static final String SABADO = "SATURDAY";
    private static final String DOMINGO = "SUNDAY";
    private static final Double PORCENTAJE_VALOR_ADICIONAL = 0.15d;
    private static final LocalDateTime fechaReserva = LocalDateTime.now();

    private Integer idReserva;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDateTime fecha;
    private Double valorTotal;

    public Reserva(Integer idReserva, Cliente cliente, Pelicula pelicula){

        ValidarParametro.validarObligatorio(cliente, SE_DEBE_INGRESAR_EL_CLIENTE_QUE_ALQUILA_LA_PELICULA);
        ValidarParametro.validarObligatorio(pelicula, SE_DEBE_INGRESAR_LA_PELICULA_QUE_SE_VA_RESERVAR);

        this.idReserva = idReserva;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fechaEntregaReservaCaeDomingo(calcularFechaEntrega());
        this.valorTotal = calcularValorTotal(fechaReserva, pelicula.getValor());

    }

    //Lógica de Negocio referente a la creación de la reserva
    //Metodo para calcular el valor total de la reserva en base al día de la semana
    public Double calcularValorTotal(LocalDateTime fechaReserva, Double valor){
        LocalDateTime fechaReservaActual = fechaReserva;
        Double aumento;
        String diaSemana = fechaReservaActual.getDayOfWeek().toString();
        if (diaSemana.equals(VIERNES) || diaSemana.equals(SABADO)){
            aumento = (valor*PORCENTAJE_VALOR_ADICIONAL);
            return (aumento + valor);
        }
        else{
            return valor;
        }
    }

    //Se cálcula la fecha de entrega de la pelicula
    public LocalDateTime calcularFechaEntrega(){
        LocalDateTime fechaReserva = LocalDateTime.now();
        return fechaReserva.plusDays(10);
    }

    //Se determina si el día de entrega es domingo, si lo es la fecha de entrega
    //se posterga un día despues
    public LocalDateTime fechaEntregaReservaCaeDomingo(LocalDateTime fechaEntrega){
        LocalDateTime fechaEntregaFinal = fechaEntrega;
        String diaSemanaEsDomingo = fechaEntrega.getDayOfWeek().toString();
        if(diaSemanaEsDomingo.equals(DOMINGO)){
            fechaEntregaFinal = fechaEntregaFinal.plusDays(1);
            return fechaEntregaFinal;
        }
        else{
            return fechaEntregaFinal;
        }
    }

    public Integer getIdReserva() { return idReserva; }

    public void setIdReserva(Integer idReserva) { this.idReserva = idReserva; }

    public Cliente getCliente() { return cliente; }

    public Pelicula getPelicula() { return pelicula; }

    public LocalDateTime getFecha() { return fecha; }

    public Double getValorTotal() { return valorTotal; }

}
