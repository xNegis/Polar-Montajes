package org.springframework.samples.petclinic.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.LineaPedido;
import org.springframework.samples.petclinic.model.Nomina;
import org.springframework.samples.petclinic.model.Pedido;

public interface PedidoRepository  extends CrudRepository<Pedido, Integer> {
	List<Pedido> findAll() throws DataAccessException;


	@Query("SELECT l FROM LineaPedido l WHERE l.pedido.id = :id")
	public List<LineaPedido> findLineasPedidoPorPedido(@Param("id") Integer id);

	
	@Transactional
	@Modifying
	@Query("UPDATE Pedido p SET p.precio = :precio WHERE p.id = :id")	
	public void actualizarPrecioPedido(@Param("id") int id,@Param("precio") Double precio);

}
