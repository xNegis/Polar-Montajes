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

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Trabajador;
import org.springframework.samples.petclinic.service.AuthoritiesService;
import org.springframework.samples.petclinic.service.OwnerService;
import org.springframework.samples.petclinic.service.TrabajadoresService;
import org.springframework.samples.petclinic.service.VetService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
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
public class TrabajadoresController {

	private static final String VIEWS_OWNER_CREATE_FORM = "users/createOwnerForm";

	private final TrabajadoresService trabajadoresService;

	@Autowired
	public TrabajadoresController(TrabajadoresService trabajadoresService) {
		this.trabajadoresService = trabajadoresService;
	}


	@GetMapping(value = "/trabajadores")
	public String initCreationForm(Map<String, Object> model) {
		List<Trabajador> listaTrabajadores = trabajadoresService.findAll();
		System.out.println(listaTrabajadores);
		model.put("trabajadores", listaTrabajadores);
		return "trabajadores/listaTrabajadores";
	}
	
	@GetMapping(value = "/trabajadores/nuevoTrabajador")
	public String nuevoTrabajador(Map<String, Object> model) {
		
		model.put("trabajador", new Trabajador());
		return "trabajadores/nuevoTrabajador";
	}

	
	@PostMapping(value = "/trabajadores/nuevoTrabajador")
	public String nuevoTrabajador2(Trabajador trabajador,Map<String, Object> model) {
		this.trabajadoresService.saveTrabajador(trabajador);
		return "redirect:/trabajadores";
	}
	



}
