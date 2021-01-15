package org.springframework.samples.petclinic.web;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.Nomina;
import org.springframework.samples.petclinic.model.Servicio;
import org.springframework.samples.petclinic.model.TipoServicio;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.service.ClienteService;
import org.springframework.samples.petclinic.service.FacturasService;
import org.springframework.samples.petclinic.service.ServicioService;
import org.springframework.samples.petclinic.service.TrabajadoresService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServiciosController {
	

	private ServicioService servicioService;
	private ClienteService clienteService;
	private UserService userService;
	private TrabajadoresService trabajadorService;


	@Autowired
	public ServiciosController(ClienteService clienteService, UserService userService,ServicioService servicioService,TrabajadoresService trabajadorService) {
		super();
		this.servicioService= servicioService;
		this.clienteService = clienteService;
		this.userService = userService;
		this.trabajadorService =trabajadorService;
	}

	@GetMapping("/misservicios")
	public String listadoServiciosCliente(ModelMap modelMap) {
		modelMap.addAttribute("servicios", servicioService.getServicioClienteByDni(userService.getUserSession().getUsername()));
		return "clientes/misservicios";
	}

	@GetMapping("/todosservicios")
	public String listadoServicios(ModelMap modelMap) {
		modelMap.addAttribute("servicios", servicioService.consultarServicios());
		return "trabajadores/servicios";
	}
	
	@GetMapping(value = "/nuevoservicio")
	public String nuevaNomina(ModelMap modelMap) {
		Servicio newservicio = new Servicio();
		modelMap.put("servicio", newservicio);
		modelMap.put("tipos", Arrays.asList(TipoServicio.values()));

		return "trabajadores/nuevoservicio";
	}
	
	@PostMapping(value = "/nuevoservicio")
	public String nuevoservicio2(Servicio servicio) {
		servicio.setFechaInicio(LocalDate.now().toString());
		servicio.setCliente(clienteService.getClienteByDni(servicio.getCliente().getDni()));
		servicio.setTrabajador(trabajadorService.getTrabajadorByDni(userService.getUserSession().getUsername()));
		this.servicioService.registrarServicio(servicio);
		return "redirect:/todosservicios";
	}

}
