package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {

    public static final String El_CLIENTE_YA_EXISTE = "Cliente ya existe. Verifica las credenciales";

    private RepositorioCliente repositorioCliente;

    public ServicioCrearCliente(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente){
        if(repositorioCliente.clienteYaExiste(cliente)){
            throw new ExcepcionGeneral(El_CLIENTE_YA_EXISTE);
        }
        else{
            this.repositorioCliente.crearCliente(cliente);
        }
    }

}
