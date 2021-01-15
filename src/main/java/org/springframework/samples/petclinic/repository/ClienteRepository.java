package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	@Override
	List<Cliente> findAll() throws DataAccessException;

	@Query(value = "SELECT * FROM CLIENTE WHERE CLIENTE.DNI LIKE ?1", nativeQuery = true)
	Cliente getClienteByDni(String dni);

}
