package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.model.Servicio;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	List<Cliente> findAll() throws DataAccessException;

	@Query("SELECT cliente FROM Cliente cliente  WHERE cliente.dni LIKE :dni")
	Cliente getClienteByDni(@Param("dni") String dni);

}
