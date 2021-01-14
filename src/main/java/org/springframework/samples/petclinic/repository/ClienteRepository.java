package org.springframework.samples.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
