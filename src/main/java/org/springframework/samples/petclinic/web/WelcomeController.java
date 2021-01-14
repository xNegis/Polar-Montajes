package org.springframework.samples.petclinic.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping({ "/", "/welcome" })
	public String welcome(Map<String, Object> model) {
		return "welcome";
	}

	@GetMapping("/contacto")
	public ModelAndView contacto() {
		ModelAndView mav = new ModelAndView("contacto");
		return mav;
	}
}
