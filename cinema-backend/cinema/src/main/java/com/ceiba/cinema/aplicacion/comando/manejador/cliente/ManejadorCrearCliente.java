package com.ceiba.cinema.aplicacion.comando.manejador.cliente;


import com.ceiba.cinema.aplicacion.comando.ComandoCliente;
import com.ceiba.cinema.aplicacion.comando.fabrica.FabricaCliente;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioCrearCliente;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearCliente {


    private final ServicioCrearCliente servicioCrearCliente;
    private final FabricaCliente fabricaCliente;

    public ManejadorCrearCliente(ServicioCrearCliente servicioCrearCliente, FabricaCliente fabricaCliente ){
        this.servicioCrearCliente = servicioCrearCliente;
        this.fabricaCliente = fabricaCliente;

    }

    public void ejecutar(ComandoCliente comandoCliente){
        Cliente cliente = this.fabricaCliente.crear(comandoCliente);
        this.servicioCrearCliente.ejecutar(cliente);
    }




}
