package org.springframework.samples.petclinic.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.service.FacturasService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		modelMap.addAttribute("facturas",
				facturaService.getFacturaClienteByDni(userService.getUserSession().getUsername()));
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

//	@GetMapping("/crearFactura")
//	public ModelAndView crearFactura() {
//		ModelAndView mav = new ModelAndView();
//		boolean esTrabajador = this.userService.getUserSession().getAuthorities().stream()
//				.anyMatch(x -> x.getAuthority().equals("gerente"));
//		if (esTrabajador) {
//			mav.setViewName("facturas/crearFactura");
//		} else {
//			mav.setViewName("welcome");
//		}
//		return mav;
//	}

	@RequestMapping(value = "/crearFactura", method = RequestMethod.GET)
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("facturas/crearFactura", "factura", new Factura());
		return mav;
	}

	@RequestMapping(value = "/crearFactura", method = RequestMethod.POST)
	public ModelAndView submit(@Valid @ModelAttribute("factura") Factura factura, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (!result.hasErrors()) {
			mav.setViewName("facturas/crearLineasFacturas");
			this.facturaService.saveFactura(factura);
			mav.addObject("factura", factura);
		} else {
			mav.addObject("errores", result.getAllErrors());
		}
		return mav;
	}

}
