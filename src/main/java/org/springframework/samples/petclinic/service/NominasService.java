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


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.model.Nomina;
import org.springframework.samples.petclinic.model.Trabajador;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.repository.FacturaRepository;
import org.springframework.samples.petclinic.repository.NominaRepository;
import org.springframework.samples.petclinic.repository.TrabajadoresRepository;
import org.springframework.samples.petclinic.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Mostly used as a facade for all Petclinic controllers Also a placeholder
 * for @Transactional and @Cacheable annotations
 *
 * @author Michael Isvy
 */
@Service
public class NominasService {

	private NominaRepository nominaRepository;

	@Autowired
	public NominasService(NominaRepository nominaRepository) {
		this.nominaRepository = nominaRepository;
	}

	@Transactional
	public void saveNomina(Nomina nomina) throws DataAccessException {
		nominaRepository.save(nomina);	
	}
	
	public Optional<Nomina> findFactura(Integer id) {
		return nominaRepository.findById(id);
	}
	
	public List<Nomina> findAll(){
	
		return this.nominaRepository.findAll();
		 
		}

	public List<Nomina> findNominasByTrabajador(String dni) {
		return nominaRepository.findNominaByTrabajador(dni);
	}
}
