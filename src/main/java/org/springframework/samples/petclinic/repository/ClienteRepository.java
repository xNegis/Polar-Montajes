package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.Factura;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	List<Cliente> findAll() throws DataAccessException;

}
