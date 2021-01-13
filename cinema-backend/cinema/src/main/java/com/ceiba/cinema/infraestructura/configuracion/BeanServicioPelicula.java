package com.ceiba.cinema.infraestructura.configuracion;


import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.dominio.servicios.pelicula.ServicioActualizarPelicula;
import com.ceiba.cinema.dominio.servicios.pelicula.ServicioCrearPelicula;
import com.ceiba.cinema.dominio.servicios.pelicula.ServicioEliminarPelicula;
import com.ceiba.cinema.dominio.servicios.pelicula.ServicioListarPelicula;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioPelicula {

    @Bean
    public ServicioCrearPelicula servicioCrearPelicula(RepositorioPelicula repositorioPelicula){
        return new ServicioCrearPelicula(repositorioPelicula);
    }

    @Bean
    public ServicioListarPelicula servicioListarPelicula(RepositorioPelicula repositorioPelicula){
        return new ServicioListarPelicula(repositorioPelicula);
    }

    @Bean
    public ServicioActualizarPelicula servicioActualizarPelicula(RepositorioPelicula repositorioPelicula){
        return new ServicioActualizarPelicula(repositorioPelicula);
    }

    @Bean
    public ServicioEliminarPelicula servicioEliminarPelicula(RepositorioPelicula repositorioPelicula){
        return new ServicioEliminarPelicula(repositorioPelicula);
    }

}
