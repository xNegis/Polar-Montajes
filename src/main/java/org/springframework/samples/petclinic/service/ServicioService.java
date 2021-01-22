package org.springframework.samples.petclinic.service;

import java.util.List;

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
	public ServicioService(ServicioRepository servicioRepository) {
		this.servicioRepository = servicioRepository;
	}

	@Transactional
	public List<Servicio> consultarServicios() throws DataAccessException {
		return servicioRepository.findAll();
	}

	@Transactional
	public void registrarServicio(Servicio servicio) throws DataAccessException {
		servicioRepository.save(servicio);
	}

	public List<Servicio> getServicioClienteByDni(String dni) {
		return servicioRepository.findServiciosByDniCliente(dni);

	}

	public Servicio findById(Integer servicioId) {
		return this.servicioRepository.findById(servicioId).get();

	}

	public void save(Servicio s) {
		this.servicioRepository.save(s);
	}

	public List<Servicio> findAll() {
		return this.servicioRepository.findAll();
	}

}
