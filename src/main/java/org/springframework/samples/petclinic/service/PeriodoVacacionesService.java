 package org.springframework.samples.petclinic.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.PeriodoVacaciones;
import org.springframework.samples.petclinic.repository.PeriodoVacacionesRepository;
import org.springframework.samples.petclinic.repository.TrabajadoresRepository;
import org.springframework.stereotype.Service;

@Service
public class PeriodoVacacionesService {
	
	private TrabajadoresRepository trabajadoresRepository;
	private PeriodoVacacionesRepository periodoVacacionesRepository;
	
	@Autowired
	public PeriodoVacacionesService(TrabajadoresRepository trabajadoresRepository, PeriodoVacacionesRepository periodoVacacionesRepository) {
		this.trabajadoresRepository = trabajadoresRepository;
		this.periodoVacacionesRepository = periodoVacacionesRepository;
	}
	
	public Iterable<PeriodoVacaciones> findAllPeriodosVacaciones(){
		return this.periodoVacacionesRepository.findAll();
	}
	
	public void savePeriodo(PeriodoVacaciones p ) {
		periodoVacacionesRepository.save(p);
		}
	
	public List<PeriodoVacaciones> FindPeriodoVacacionesByTrabajador (Integer id) {
		return periodoVacacionesRepository.findVacacionesByTrabajador(id);
	}

	public List<PeriodoVacaciones> findAll() {
		return periodoVacacionesRepository.findAll();
	}
	
	public void DeleteVacaciones(Integer id) {
		 periodoVacacionesRepository.deleteById(id);
	}
	
	public Optional<PeriodoVacaciones> findVacacionesById(Integer id) {
		return periodoVacacionesRepository.findById(id);
	}
	
	public void UpdateAceptadaVacaciones(Integer id) {
		periodoVacacionesRepository.actualizarAceptadaVacaciones(id);
	}
	
	public void UpdateDenegadoVacaciones(Integer id) {
		periodoVacacionesRepository.actualizardenegadoVacaciones(id);
	}
}
