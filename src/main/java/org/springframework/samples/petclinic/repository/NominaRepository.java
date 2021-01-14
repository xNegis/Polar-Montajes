package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.LineaPedido;
import org.springframework.samples.petclinic.model.Nomina;

public interface NominaRepository extends CrudRepository<Nomina, Integer> {
	List<Nomina> findAll() throws DataAccessException;

}
