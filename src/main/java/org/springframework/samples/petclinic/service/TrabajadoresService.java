package org.springframework.samples.petclinic.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Trabajador;
import org.springframework.samples.petclinic.model.User;
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
public class TrabajadoresService {

	private TrabajadoresRepository trabajadoresRepository;

	@Autowired
	public TrabajadoresService(TrabajadoresRepository trabajadoresRepository) {
		this.trabajadoresRepository = trabajadoresRepository;
	}

	@Transactional
	public void saveTrabajador(Trabajador trabajador) throws DataAccessException {
		trabajadoresRepository.save(trabajador);	
	}
	
	public Optional<Trabajador> findTrabajador(Integer id) {
		return trabajadoresRepository.findById(id);
	}
	
	public Trabajador findTrabajadorById(Integer id) {
		return this.trabajadoresRepository.findTrabajadorByID(id);
	}
	
	public List<Trabajador> findAll(){
		List<Trabajador> trabajador= new ArrayList<Trabajador>();
		this.trabajadoresRepository.findAll().forEach(trabajador::add);
		return trabajador;
		}
	
}
