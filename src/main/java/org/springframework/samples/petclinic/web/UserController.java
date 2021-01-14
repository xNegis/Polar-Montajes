/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.web;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.service.AuthoritiesService;
import org.springframework.samples.petclinic.service.ClienteService;
import org.springframework.samples.petclinic.service.OwnerService;
import org.springframework.samples.petclinic.service.TrabajadoresService;
import org.springframework.samples.petclinic.service.VetService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 */
@Controller
public class UserController {

	private static final String VIEWS_OWNER_CREATE_FORM = "users/createUserForm";

	private final UserService userService;
	private final AuthoritiesService authoritiesService;
	private final ClienteService clienteService;
	private final TrabajadoresService trabajadorService;


	@Autowired
	public UserController(UserService userService,AuthoritiesService authoritiesService,ClienteService clienteService,TrabajadoresService trabajadorService) {
		this.userService = userService;
		this.authoritiesService = authoritiesService;
		this.clienteService = clienteService;
		this.trabajadorService = trabajadorService;
	}

	@InitBinder
	public void setAllowedFields(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}

	@GetMapping(value = "/users/new")
	public String initCreationForm(Map<String, Object> model) {
		User user = new User();
		model.put("user", user);
		return VIEWS_OWNER_CREATE_FORM;
	}

	@PostMapping(value = "/users/new")
	public String processCreationForm(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return VIEWS_OWNER_CREATE_FORM;
		}
		else {
			//creating owner, user, and authority
			this.userService.saveUser(user);
			
			authoritiesService.saveAuthorities(user.getUsername(), "cliente");
			return "redirect:/welcome";
		}
	}
	
	  
	  @GetMapping({"/welcomeCliente"})
	  public String welcomeCliente(ModelMap modelMap) {	    
			modelMap.addAttribute("usuario", clienteService.getClienteByDni(userService.getUserSession().getUsername()));

	    return "clientes/welcomecliente";
	  }
	  
	  @GetMapping({"/welcomeTrabajador"})
	  public String welcomeTrabajador(ModelMap modelMap) {	    
			modelMap.addAttribute("usuario", trabajadorService.getTrabajadorByDni(userService.getUserSession().getUsername()));

	    return "Trabajador/welcometrabajador";
	  }

}
