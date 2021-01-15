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
package org.springframework.samples.petclinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.repository.FacturaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Mostly used as a facade for all Petclinic controllers Also a placeholder
 * for @Transactional and @Cacheable annotations
 *
 * @author Michael Isvy
 */
@Service
public class FacturasService {

	private FacturaRepository facturaRepository;

	@Autowired
	public FacturasService(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}

	@Transactional
	public void saveFactura(Factura factura) throws DataAccessException {
		facturaRepository.save(factura);
	}

	public Optional<Factura> findFactura(Integer id) {
		return facturaRepository.findById(id);
	}

	public List<Factura> getFacturaClienteByDni(String dni) {
		return facturaRepository.findFacturasByDniCliente(dni);
	}

	public List<Factura> getFacturas() {
		return facturaRepository.findAll();
	}

	public int getNumFacturas() {
		return facturaRepository.findAll().size();
	}

	public void actualizarPrecioFactura(Integer id, Double precioTotal) {
		this.facturaRepository.actualizarPrecio(id, precioTotal);
	}

	public void deleteById(Integer facturaId) {
		this.facturaRepository.deleteById(facturaId);
	}

}
