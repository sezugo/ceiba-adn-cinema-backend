package com.ceiba.cinema.aplicacion.comando.manejador.cliente;

import com.ceiba.cinema.aplicacion.comando.ComandoCliente;
import com.ceiba.cinema.aplicacion.comando.fabrica.FabricaCliente;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioActualizarCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarCliente {

    private final ServicioActualizarCliente servicioActualizarCliente;
    private final FabricaCliente fabricaCliente;

    public ManejadorActualizarCliente(ServicioActualizarCliente servicioActualizarCliente, FabricaCliente fabricaCliente) {
        this.servicioActualizarCliente = servicioActualizarCliente;
        this.fabricaCliente = fabricaCliente;
    }

    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = this.fabricaCliente.crear(comandoCliente);
        this.servicioActualizarCliente.ejecutar(cliente);
    }
}
