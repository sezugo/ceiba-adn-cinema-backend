package com.ceiba.cinema.infraestructura.convertir.cliente;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.infraestructura.entidades.ClienteEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirCliente {

    private ModelMapper modelMapper = new ModelMapper();

    public ClienteEntidad convertirDominioPorEntidad(Cliente cliente){
        return modelMapper.map(cliente, ClienteEntidad.class);
    }

    public ClienteDTO convertirClienteEntidadADominio(ClienteEntidad clienteEntidad){
        return modelMapper.map(clienteEntidad, ClienteDTO.class);
    }

    public List<ClienteDTO> convertirListaClienteEntidadAListarCliente(List<ClienteEntidad> listaClienteEntidad, List<ClienteDTO> listaCliente){
        for(ClienteEntidad clienteEntidad: listaClienteEntidad){
            ClienteDTO cliente = modelMapper.map(clienteEntidad, ClienteDTO.class);
            listaCliente.add(cliente);
        }
        return listaCliente;
    }


}
