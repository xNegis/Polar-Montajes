package org.springframework.samples.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.Trabajador;

public interface TrabajadoresRepository extends CrudRepository<Trabajador, Integer>{

}
