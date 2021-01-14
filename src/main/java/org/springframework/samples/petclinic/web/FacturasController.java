package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.service.FacturasService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacturasController {

	private FacturasService facturaService;
	private UserService userService;

	@Autowired
	public FacturasController(UserService userService, FacturasService facturaService) {
		super();
		this.facturaService = facturaService;
		this.userService = userService;
	}

	@GetMapping("/misfacturas")

	public String listadoFacturasCliente(ModelMap modelMap) {
System.out.println(userService.getUserSession().getDni());
		modelMap.addAttribute("facturas", facturaService.getFacturaClienteByDni(userService.getUserSession().getUsername()));
		return "clientes/misfacturas";
	}

	@GetMapping("/facturas")
	public ModelAndView mostrarFacturas() {
		ModelAndView mav = new ModelAndView();
		boolean esTrabajador = this.userService.getUserSession().getAuthorities().stream()
				.anyMatch(x -> x.getAuthority().equals("gerente"));
		if (esTrabajador) {
			mav.setViewName("facturas/facturas");
			mav.addObject("facturas", this.facturaService.getFacturas());
		} else {
			mav.setViewName("welcome");
		}
		return mav;

	}

}
