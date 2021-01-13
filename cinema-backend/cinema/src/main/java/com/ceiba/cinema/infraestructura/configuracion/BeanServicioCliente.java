package com.ceiba.cinema.infraestructura.configuracion;

import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioActualizarCliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioCrearCliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioEliminarCliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioListarCliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServicioCliente {

    @Bean
    public ServicioCrearCliente servicioCrearCliente(RepositorioCliente repositorioCliente){
        return new ServicioCrearCliente(repositorioCliente);
    }

    @Bean
    public ServicioEliminarCliente servicioEliminarCliente(RepositorioCliente repositorioCliente){
        return new ServicioEliminarCliente(repositorioCliente);
    }

    @Bean
    public ServicioActualizarCliente servicioActualizarCliente(RepositorioCliente repositorioCliente){
        return new ServicioActualizarCliente(repositorioCliente);
    }

    @Bean
    public ServicioListarCliente servicioListarCliente(RepositorioCliente repositorioCliente){
        return new ServicioListarCliente(repositorioCliente);
    }

}
