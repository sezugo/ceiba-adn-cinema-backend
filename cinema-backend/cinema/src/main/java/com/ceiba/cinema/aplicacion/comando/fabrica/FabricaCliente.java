package com.ceiba.cinema.aplicacion.comando.fabrica;

import com.ceiba.cinema.aplicacion.comando.ComandoCliente;
import com.ceiba.cinema.dominio.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class FabricaCliente {

    public Cliente crear(ComandoCliente comandoCliente){
        return new Cliente(comandoCliente.getIdCliente(), comandoCliente.getNombre(),
                comandoCliente.getApellido(), comandoCliente.getCedula(), comandoCliente.getCelular(),
                comandoCliente.getDirrecion(), comandoCliente.getCorreo());

    }

}
