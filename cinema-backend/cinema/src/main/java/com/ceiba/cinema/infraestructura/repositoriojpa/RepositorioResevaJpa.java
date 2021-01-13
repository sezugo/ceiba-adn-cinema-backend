package com.ceiba.cinema.infraestructura.repositoriojpa;


import com.ceiba.cinema.infraestructura.entidades.ReservaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioResevaJpa extends JpaRepository<ReservaEntidad, Serializable> {


}
