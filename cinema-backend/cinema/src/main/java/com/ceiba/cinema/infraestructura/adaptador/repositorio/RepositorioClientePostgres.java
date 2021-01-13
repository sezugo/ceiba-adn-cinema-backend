package com.ceiba.cinema.infraestructura.adaptador.repositorio;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.infraestructura.convertir.cliente.ConvertirCliente;
import com.ceiba.cinema.infraestructura.entidades.ClienteEntidad;
import com.ceiba.cinema.infraestructura.repositoriojpa.RepositorioClienteJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioClientePostgres implements RepositorioCliente {

    private RepositorioClienteJpa repositorioClienteJpa;
    private ConvertirCliente convertirCliente;

    public RepositorioClientePostgres(RepositorioClienteJpa repositorioClienteJpa,ConvertirCliente convertirCliente){
        this.repositorioClienteJpa = repositorioClienteJpa;
        this.convertirCliente = convertirCliente;
    }

    @Override
    public void crearCliente(Cliente cliente){
        ClienteEntidad clienteEntidadCrear = convertirCliente.convertirDominioPorEntidad(cliente);
        repositorioClienteJpa.save(clienteEntidadCrear);
    }

    @Override
    public List<ClienteDTO> listarClientes(){
        List<ClienteEntidad> listaClienteEntidad = repositorioClienteJpa.findAll();
        List<ClienteDTO> listaCliente = new ArrayList<>();
        return convertirCliente.convertirListaClienteEntidadAListarCliente(listaClienteEntidad, listaCliente);
    }


    @Override
    public void actualizarCliente(Cliente cliente){
        ClienteEntidad clienteEntidadActualizar = convertirCliente.convertirDominioPorEntidad(cliente);
        repositorioClienteJpa.save(clienteEntidadActualizar);
    }

    @Override
    public void eliminarCliente(Integer idCliente){
        repositorioClienteJpa.deleteById(idCliente);
    }

    @Override
    public boolean clienteYaExiste(Cliente cliente){
        String cedulaCliente = cliente.getCedula();
        return (repositorioClienteJpa.findByCedula(cedulaCliente)) != null;
    }

    public ClienteDTO buscarPorCedula(String cedula){
        ClienteEntidad clienteEntidad = repositorioClienteJpa.findByCedula(cedula);
        return (clienteEntidad == null ? null : convertirCliente.convertirClienteEntidadADominio(clienteEntidad));
    }

}
