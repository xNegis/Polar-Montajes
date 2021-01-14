package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.service.ClienteService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteCotroller {

	private ClienteService clienteService;
	private UserService userService;

	@Autowired
	public ClienteCotroller(ClienteService clienteService, UserService userService) {
		super();
		this.clienteService = clienteService;
		this.userService = userService;
	}

	@GetMapping("/clientes")
	public ModelAndView mostrarClientes() {
		ModelAndView mav = new ModelAndView();
//		boolean esAdmin = this.userService.getUserSession().getAuthorities().stream()
//				.anyMatch(x -> x.getAuthority().equals("admin"));
//		if (esAdmin) {
		mav.setViewName("clientes.jsp");
		mav.addObject("clientes", clienteService.getAllClientes());
//		} else {
//			mav.setViewName("welcome.jsp");
//		}
		return mav;
	}

}
