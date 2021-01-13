package com.ceiba.cinema.infraestructura.controlador;

import com.ceiba.cinema.aplicacion.comando.ComandoPelicula;
import com.ceiba.cinema.aplicacion.comando.manejador.pelicula.ManejadorActualizarPelicula;
import com.ceiba.cinema.aplicacion.comando.manejador.pelicula.ManejadorCrearPelicula;
import com.ceiba.cinema.aplicacion.comando.manejador.pelicula.ManejadorEliminarPelicula;
import com.ceiba.cinema.aplicacion.consulta.manejador.pelicula.ManejadorListarPelicula;
import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pelicula")
public class ControladorPelicula {

    private final ManejadorCrearPelicula manejadorCrearPelicula;
    private final ManejadorListarPelicula manejadorListarPelicula;
    private final ManejadorEliminarPelicula manejadorEliminarPelicula;
    private final ManejadorActualizarPelicula manejadorActualizarPelicula;

    public ControladorPelicula(ManejadorCrearPelicula manejadorCrearPelicula, ManejadorListarPelicula manejadorListarPelicula, ManejadorEliminarPelicula manejadorEliminarPelicula, ManejadorActualizarPelicula manejadorActualizarPelicula) {
        this.manejadorCrearPelicula = manejadorCrearPelicula;
        this.manejadorListarPelicula = manejadorListarPelicula;
        this.manejadorEliminarPelicula = manejadorEliminarPelicula;
        this.manejadorActualizarPelicula = manejadorActualizarPelicula;
    }

    @PostMapping
    public void crearPelicula(@RequestBody ComandoPelicula comandoPelicula){
        this.manejadorCrearPelicula.ejecutar(comandoPelicula);
    }

    @GetMapping
    public List<PeliculaDTO> listarPelicula(){
        return this.manejadorListarPelicula.ejecutar();
    }

    @PutMapping
    public void actualizarPelicula(@RequestBody ComandoPelicula comandoPelicula){
        this.manejadorActualizarPelicula.ejecutar(comandoPelicula);
    }

    @DeleteMapping(value = "/{idPelicula}")
    public void eliminarPelicula(@PathVariable Integer idPelicula){
        this.manejadorEliminarPelicula.ejecutar(idPelicula);

    }





}
