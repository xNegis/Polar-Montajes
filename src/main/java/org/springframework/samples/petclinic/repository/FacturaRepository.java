/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Factura;

/**
 * Repository class for <code>Vet</code> domain objects All method names are
 * compliant with Spring Data naming conventions so this interface can easily be
 * extended for Spring Data See here:
 * http://static.springsource.org/spring-data/jpa/docs/current/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Michael Isvy
 */
public interface FacturaRepository extends CrudRepository<Factura, Integer> {

	/**
	 * Retrieve all <code>Vet</code>s from the data store.
	 * 
	 * @return a <code>Collection</code> of <code>Vet</code>s
	 */
	@Override
	List<Factura> findAll() throws DataAccessException;

	@Query("SELECT factura FROM Factura factura WHERE factura.cliente.dni LIKE :dni")
	List<Factura> findFacturasByDniCliente(@Param("dni") String dni);

	@Query("UPDATE Factura f SET f.precioTotalSinIva = :precioTotal WHERE f.id = :id")
	void actualizarPrecio(@Param("id") Integer id, @Param("precioTotal") Double precioTotal);

}
