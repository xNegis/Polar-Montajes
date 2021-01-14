package org.springframework.samples.petclinic.service;


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
	
//	public FindPeriodoVacacionesByTrabajador (Integer id) {
//		
//	}
	
}
