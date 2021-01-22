package org.springframework.samples.petclinic.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Estado;
import org.springframework.samples.petclinic.model.PeriodoVacaciones;
import org.springframework.samples.petclinic.model.Trabajador;
import org.springframework.samples.petclinic.model.Vacaciones;
import org.springframework.samples.petclinic.service.PeriodoVacacionesService;
import org.springframework.samples.petclinic.service.TrabajadoresService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeriodoVacacionesController {

	PeriodoVacacionesService periodoVacacionesService;

	TrabajadoresService trabajadorService;

	@Autowired
	public PeriodoVacacionesController(PeriodoVacacionesService periodoVacacionesService,
			TrabajadoresService trabajadorService) {
		this.periodoVacacionesService = periodoVacacionesService;
		this.trabajadorService = trabajadorService;
	}

	@ModelAttribute("listaVacaciones")
	public List<Vacaciones> getAllVacaciones() {
		List<Vacaciones> va = new ArrayList<Vacaciones>();
		for (Vacaciones v : Vacaciones.values()) {
			va.add(v);
		}

		return va;
	}

	@GetMapping(path = "/trabajador/{trabajadorId}/periodoVacaciones")
	public String crearEquipo(@PathVariable("trabajadorId") int trabajadorId, ModelMap model) {
		Trabajador trabajador = this.trabajadorService.findTrabajador(trabajadorId).get();

		List<PeriodoVacaciones> periodoVacaciones = this.periodoVacacionesService
				.FindPeriodoVacacionesByTrabajador(trabajadorId);

		model.put("periodovacaciones", periodoVacaciones);
		model.put("trabajador", trabajador);

		return "/vacaciones/Vacaciones";
	}

	@GetMapping(path = "/trabajador/{trabajadorId}/periodoVacaciones/new")
	public String crearEquipo1(@PathVariable("trabajadorId") int trabajadorId, ModelMap model) {
		PeriodoVacaciones periodoVacacionesNew = new PeriodoVacaciones();

		Trabajador trabajador = this.trabajadorService.findTrabajador(trabajadorId).get();
		periodoVacacionesNew.setTrabajador(trabajador);

		model.addAttribute("team", periodoVacacionesNew);

		return "/vacaciones/NewVacaciones";
	}

	@PostMapping(value = "/trabajador/{trabajadorId}/periodoVacaciones/new")
	public String saveNewVacaciones(@PathVariable("trabajadorId") int trabajadorId, PeriodoVacaciones team,
			BindingResult result, ModelMap model) {

		Trabajador trabajador = this.trabajadorService.findTrabajadorById(trabajadorId);
		System.out.println(trabajador);
		team.setEstado(Estado.PENDIENTE);
		team.setTrabajador(trabajador);
		System.out.println("hhhhhhhh	");
		System.out.println(team);
		this.periodoVacacionesService.savePeriodo(team);

		return "redirect:/trabajador/{trabajadorId}/periodoVacaciones";

	}

	@GetMapping(path = "/trabajador/periodoVacaciones/Todos")
	public String crearEquipo2(ModelMap model) {

		List<PeriodoVacaciones> periodoVacaciones = this.periodoVacacionesService.findAll();

		model.put("periodovacaciones", periodoVacaciones);

		return "/vacaciones/TodosLosPeriodos";
	}

	@GetMapping(path = "/trabajador/periodoVacaciones/{periodoId}/aceptado")
	public String updateVacas(@PathVariable("periodoId") int periodoId, ModelMap model) {

		this.periodoVacacionesService.UpdateAceptadaVacaciones(periodoId);

		return "redirect:/trabajador/periodoVacaciones/Todos";

	}

	@GetMapping(path = "/trabajador/periodoVacaciones/{periodoId}/denegado")
	public String updateVacasa(@PathVariable("periodoId") int periodoId, ModelMap model) {

		this.periodoVacacionesService.UpdateDenegadoVacaciones(periodoId);

		return "redirect:/trabajador/periodoVacaciones/Todos";

	}

}
