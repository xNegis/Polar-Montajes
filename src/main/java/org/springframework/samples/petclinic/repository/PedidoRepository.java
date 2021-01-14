package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.Nomina;
import org.springframework.samples.petclinic.model.Pedido;

public interface PedidoRepository  extends CrudRepository<Pedido, Integer> {
	List<Pedido> findAll() throws DataAccessException;

}
