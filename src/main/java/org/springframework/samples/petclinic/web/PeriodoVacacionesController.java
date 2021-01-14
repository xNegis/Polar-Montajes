package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.PeriodoVacaciones;
import org.springframework.samples.petclinic.service.PeriodoVacacionesService;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PeriodoVacacionesController {
	
	PeriodoVacacionesService periodoVacacionesService;
	
//	TrabajadorService trabajadorService;
	
	@Autowired
	public PeriodoVacacionesController(PeriodoVacacionesService periodoVacacionesService) {
		this.periodoVacacionesService = periodoVacacionesService;
	//	this.trabajadorService = trabajadorService;
	}
	
	@GetMapping(path = "/Trabajador/{trabajadorId}/PeriodoVacaciones")
	public String crearEquipo(@PathVariable("trabajadorId") int trabajadorId, ModelMap model) {
		PeriodoVacaciones periodoVacacionesNew = new PeriodoVacaciones();
		
	//	List<PeriodoVacaciones> periodoVacaciones = this.periodoVacacionesService.fi
		
		model.put("PeriodoVacacionesNew", periodoVacacionesNew);
		

		return "/Trabajador/PeriodoVacaciones";
	}
}
	
	
