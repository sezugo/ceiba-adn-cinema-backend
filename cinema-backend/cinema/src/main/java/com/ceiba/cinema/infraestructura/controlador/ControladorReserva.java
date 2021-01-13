package com.ceiba.cinema.infraestructura.controlador;

import com.ceiba.cinema.aplicacion.comando.ComandoReserva;
import com.ceiba.cinema.aplicacion.comando.manejador.reserva.ManejadorCrearReserva;
import com.ceiba.cinema.aplicacion.comando.manejador.reserva.ManejadorEliminarReserva;
import com.ceiba.cinema.aplicacion.consulta.manejador.reserva.ManejadorListarReserva;
import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.modelo.dto.ReservaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/reserva")
public class ControladorReserva {

    private final ManejadorCrearReserva manejadorCrearReserva;
    private final ManejadorEliminarReserva manejadorEliminarReserva;
    private final ManejadorListarReserva manejadorListarReserva;

    public ControladorReserva(ManejadorCrearReserva manejadorCrearReserva, ManejadorEliminarReserva manejadorEliminarReserva, ManejadorListarReserva manejadorListarReserva) {
        this.manejadorCrearReserva = manejadorCrearReserva;
        this.manejadorEliminarReserva = manejadorEliminarReserva;
        this.manejadorListarReserva = manejadorListarReserva;
    }

    @PostMapping
    public void crearReserva(@RequestBody ComandoReserva comandoReserva){
        this.manejadorCrearReserva.ejecutar(comandoReserva);
    }

    @GetMapping
    public List<ReservaDTO> listarReserva(){
        return this.manejadorListarReserva.ejecutar();
    }

    @DeleteMapping("/{idReserva}")
    public void eliminarReserva(@PathVariable Integer idReserva){
        this.manejadorEliminarReserva.ejecutar(idReserva);
    }


}

