package com.ceiba.cinema.infraestructura.controlador;

import com.ceiba.cinema.aplicacion.comando.ComandoCliente;
import com.ceiba.cinema.aplicacion.comando.manejador.cliente.ManejadorActualizarCliente;
import com.ceiba.cinema.aplicacion.comando.manejador.cliente.ManejadorCrearCliente;
import com.ceiba.cinema.aplicacion.comando.manejador.cliente.ManejadorEliminarCliente;
import com.ceiba.cinema.aplicacion.consulta.manejador.cliente.ManejadorListarCliente;
import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/cliente")

public class ControladorCliente {

    private final ManejadorCrearCliente manejadorCrearCliente;
    private final ManejadorListarCliente manejadorListarCliente;
    private final ManejadorActualizarCliente manejadorActualizarCliente;
    private final ManejadorEliminarCliente manejadorEliminarCliente;


    public ControladorCliente(ManejadorCrearCliente manejadorCrearCliente, ManejadorListarCliente manejadorListarCliente, ManejadorActualizarCliente manejadorActualizarCliente, ManejadorEliminarCliente manejadorEliminarCliente) {
        this.manejadorCrearCliente = manejadorCrearCliente;
        this.manejadorListarCliente = manejadorListarCliente;
        this.manejadorActualizarCliente = manejadorActualizarCliente;
        this.manejadorEliminarCliente = manejadorEliminarCliente;
    }

    @PostMapping
    public void crearCliente(@RequestBody ComandoCliente comandoCliente) {
        this.manejadorCrearCliente.ejecutar(comandoCliente);
    }


    @GetMapping
    public List<ClienteDTO> listarClientes(){
        return this.manejadorListarCliente.ejecutar();
    }

    @PutMapping
    public void actualizarCliente(@RequestBody ComandoCliente comandoCliente){
        this.manejadorActualizarCliente.ejecutar(comandoCliente);
    }

    @DeleteMapping(value = "/{cedula}")
    public void eliminarCLiente(@PathVariable String cedula){
        this.manejadorEliminarCliente.ejecutar(cedula);
    }




}
