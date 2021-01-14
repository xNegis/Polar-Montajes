package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.service.ClienteService;
import org.springframework.samples.petclinic.service.FacturasService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacturasController {
	
	private FacturasService facturaService;
	private ClienteService clienteService;
	private UserService userService;

	@Autowired
	public FacturasController(ClienteService clienteService, UserService userService,FacturasService facturaService) {
		super();
		this.facturaService= facturaService;
		this.clienteService = clienteService;
		this.userService = userService;
	}

	@GetMapping("/misfacturas")
	public ModelAndView mostrarFacturasCliente() {
		ModelAndView mav = new ModelAndView();
		boolean esCliente = this.userService.getUserSession().getAuthorities().stream()
				.anyMatch(x -> x.getAuthority().equals("cliente"));
		if (esCliente) {
			mav.setViewName("misfacturas");
			mav.addObject("facturas", facturaService.getFacturaClienteByDni(this.userService.getUserSession().getDni()));
		} else {
			mav.setViewName("welcome.jsp");
		}
		return mav;
	}

}
