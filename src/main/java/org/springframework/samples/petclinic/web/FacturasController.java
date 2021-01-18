package org.springframework.samples.petclinic.web;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.model.LineaFactura;
import org.springframework.samples.petclinic.model.Trabajador;
import org.springframework.samples.petclinic.service.ClienteService;
import org.springframework.samples.petclinic.service.FacturasService;
import org.springframework.samples.petclinic.service.LineaFacturaService;
import org.springframework.samples.petclinic.service.TrabajadoresService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacturasController {

	private FacturasService facturaService;
	private UserService userService;
	private TrabajadoresService trabajadorService;
	private ClienteService clienteService;
	private LineaFacturaService lineaFacturaService;

	@Autowired
	public FacturasController(UserService userService, FacturasService facturaService,
			TrabajadoresService trabajadorService, ClienteService clienteService,
			LineaFacturaService lineaFacturaService) {
		super();
		this.facturaService = facturaService;
		this.userService = userService;
		this.trabajadorService = trabajadorService;
		this.clienteService = clienteService;
		this.lineaFacturaService = lineaFacturaService;
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

	@GetMapping("/eligeElCliente")
	public ModelAndView vistaElegirCliente() {
		ModelAndView mav = new ModelAndView("facturas/eligeElCliente");
		mav.addObject("cliente", new Cliente());
		return mav;
	}

	@PostMapping("/eligeElCliente")
	public String enviarEleccionCliente(Cliente cliente) {
		return "redirect:/facturas/initFactura/" + cliente.getDni();
	}

	@GetMapping("/facturas/initFactura/{dniCliente}")
	public ModelAndView initFactura(@PathVariable("dniCliente") String dniCliente) {
		System.out.println(dniCliente);
		ModelAndView mav = new ModelAndView("redirect:/facturas/nuevaFactura");
		Factura factura = new Factura();
		Cliente cliente = this.clienteService.getClienteByDni(dniCliente.trim());
		factura.setCliente(cliente);
		factura.setFechaEmision(LocalDate.now().toString());
		factura.setFechaVencimiento(LocalDate.now().plusDays(30).toString());
		factura.setPagado(false);
		String dni = this.userService.getUserSession().getUsername();
		Trabajador trabajador = this.trabajadorService.getTrabajadorByDni(dni);
		factura.setTrabajador(trabajador);
		this.facturaService.saveFactura(factura);
		return mav;
	}

	@GetMapping(value = "/facturas/nuevaFactura")
	public String initCreationForm66(Map<String, Object> model) {
		Factura factura = this.facturaService.findFactura(this.facturaService.getNumFacturas()).get();
		System.out.println(factura.getId());
		List<LineaFactura> lf = this.lineaFacturaService.findLineasFacturaPorFactura(factura.getId());
		if (lf.size() > 0) {
			Double precioTotal = lf.stream().mapToDouble(x -> x.getPrecioUnitario() * x.getCantidad()).sum();
			this.facturaService.actualizarPrecioFactura(factura.getId(), precioTotal);
			model.put("lineasFactura", lf);
		}
		model.put("facturaId", factura.getId());
		return "facturas/nuevaFactura";
	}

	@GetMapping(value = "/facturas/nuevaLineaFactura/{facturaId}")
	public ModelAndView initCreationForm3(@PathVariable("facturaId") String facturaId) {
		ModelAndView mav = new ModelAndView("facturas/nuevaLineaFactura");
		mav.addObject("facturaId", facturaId);
		mav.addObject("lineaFactura", new LineaFactura());
		return mav;
	}

	@PostMapping(value = "/facturas/nuevaLineaFactura/{facturaId}")
	public String initCreationForm5(@PathVariable("facturaId") String facturaId, LineaFactura lineaFactura,
			Map<String, Object> model) {
		Factura factura = this.facturaService.findFactura(Integer.parseInt(facturaId)).get();
		lineaFactura.setFactura(factura);
		this.lineaFacturaService.saveLineaFactura(lineaFactura);
		return "redirect:/facturas/nuevaFactura";
	}

	@GetMapping(value = "/facturas/deleteFactura/{pedidoId}")
	public String initCreationForm533(@PathVariable("pedidoId") Integer facturaId, Map<String, Object> model) {
		this.facturaService.deleteById(facturaId);
		return "redirect:/facturas";
	}

	@GetMapping("/factura/TerminarFactura/{facturaId}")
	public ModelAndView terminarFactura(@PathVariable("facturaId") Integer facturaId) {
		ModelAndView mav = new ModelAndView("redirect:/facturas");
		this.facturaService.terminarFactura(facturaId);
		return mav;

	}

	@GetMapping("/facturas/{facturaId}")
	public ModelAndView visualizarFactura(@PathVariable("facturaId") Integer facturaId) {
		ModelAndView mav = new ModelAndView("facturas/visualizarFactura");
		mav.addObject("factura", this.facturaService.findFactura(facturaId));
		return mav;
	}

	@GetMapping("/facturas/pagarFactura/{facturaId}")
	public ModelAndView pagarFactura(@PathVariable("facturaId") Integer facturaId) {
		ModelAndView mav = new ModelAndView("redirect:/facturas");
		this.facturaService.pagarFactura(facturaId);
		return mav;
	}

}
