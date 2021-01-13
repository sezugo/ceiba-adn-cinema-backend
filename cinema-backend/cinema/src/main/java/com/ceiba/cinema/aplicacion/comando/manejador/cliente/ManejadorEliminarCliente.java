package com.ceiba.cinema.aplicacion.comando.manejador.cliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioEliminarCliente;
import org.springframework.stereotype.Component;


@Component
public class ManejadorEliminarCliente {

    private final ServicioEliminarCliente servicioEliminarCliente;


    public ManejadorEliminarCliente(ServicioEliminarCliente servicioEliminarCliente) {
        this.servicioEliminarCliente = servicioEliminarCliente;

    }

    public void ejecutar(String cedula){
        this.servicioEliminarCliente.ejecutar(cedula);
    }

}
