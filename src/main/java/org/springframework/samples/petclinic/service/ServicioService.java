package org.springframework.samples.petclinic.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Servicio;
import org.springframework.samples.petclinic.repository.ServicioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioService {

	private ServicioRepository servicioRepository;

	@Autowired
	public ServicioService (ServicioRepository servicioRepository) {
		this.servicioRepository = servicioRepository;
	}

	@Transactional
	public List<Servicio> consultarServicios() throws DataAccessException {
		return (List<Servicio>) servicioRepository.findAll();	
	}
	
	@Transactional
	public void registrarServicio(Servicio servicio) throws DataAccessException {
		servicioRepository.save(servicio);	
	}
	
//	public Optional<Servicio> findFactura(Integer id) {
//		return servicioRepository.findById(id);
//	}
}
