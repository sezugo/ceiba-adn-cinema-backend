package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;

import java.util.List;

public class ServicioListarCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioListarCliente(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public List<ClienteDTO> ejecutar(){
        return this.repositorioCliente.listarClientes();
    }


}
