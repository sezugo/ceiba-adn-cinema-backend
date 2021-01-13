package com.ceiba.cinema.dominio.puerto.repositorio;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;


import java.util.List;

public interface RepositorioCliente {

    void crearCliente(Cliente cliente);
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Integer idCliente);
    boolean clienteYaExiste(Cliente cliente);

    ClienteDTO buscarPorCedula(String cedula);
    List<ClienteDTO> listarClientes();

}
