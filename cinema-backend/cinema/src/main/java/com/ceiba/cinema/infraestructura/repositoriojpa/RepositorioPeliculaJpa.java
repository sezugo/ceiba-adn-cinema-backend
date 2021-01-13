package com.ceiba.cinema.infraestructura.repositoriojpa;

import com.ceiba.cinema.infraestructura.entidades.PeliculaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioPeliculaJpa extends JpaRepository<PeliculaEntidad, Serializable> {
}
