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

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.LineaPedido;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pedido;
import org.springframework.samples.petclinic.model.Proveedor;
import org.springframework.samples.petclinic.model.Trabajador;
import org.springframework.samples.petclinic.service.AuthoritiesService;
import org.springframework.samples.petclinic.service.LineaPedidoService;
import org.springframework.samples.petclinic.service.OwnerService;
import org.springframework.samples.petclinic.service.PedidoService;
import org.springframework.samples.petclinic.service.ProveedorService;
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
public class PedidoController {


	private final PedidoService pedidoService;
	private final LineaPedidoService lineaPedidoService;
	private final ProveedorService proveedorService;

	@Autowired
	public PedidoController(PedidoService pedidoService,LineaPedidoService lineaPedidoService
			,ProveedorService proveedorService) {
		this.pedidoService = pedidoService;
		this.lineaPedidoService=lineaPedidoService;
		this.proveedorService=proveedorService;
	}


	@GetMapping(value = "/pedidos")
	public String initCreationForm(Map<String, Object> model) {
		List<Pedido> pedidos = this.pedidoService.findAll();
		System.out.println(pedidos);
		model.put("pedidos", pedidos);
		return "pedidos/pedidosList";
	}
	
	
	@GetMapping(value = "/pedidos/{pedidoId}")
	public String initCreationForm2(@PathVariable("pedidoId") String pedidoId,Map<String, Object> model) {
		List<LineaPedido> pedidos = this.pedidoService.findLineasPedidoPorPedido(Integer.parseInt(pedidoId));

		model.put("pedidos", pedidos);
		return "pedidos/lineaPedidoPedidoX";
	}


	@GetMapping(value = "/pedidos/pedidosEligeProveedor")
	public String nuevoTrabajador(Map<String, Object> model) {
		
		model.put("proveedor", new Proveedor());
		return "pedidos/eligeProveedor";
	}

	
	@PostMapping(value = "/pedidos/pedidosEligeProveedor")
	public String nuevoTrabajador2(Proveedor proveedor,Map<String, Object> model) {
		System.out.println(proveedor);
		return "redirect:/pedidos/NP/"+proveedor.getId();
	}
	
	
	@GetMapping(value = "/pedidos/NP/{provId}")
	public String initCreationForm35(@PathVariable("provId") String provId,Map<String, Object> model) {
		Pedido pedido = new Pedido();
		pedido.setFecha(LocalDate.now().toString());
		pedido.setId(this.pedidoService.findAll().size()+1);
		pedido.setProveedor(this.proveedorService.findById(Integer.parseInt(provId)));
		this.pedidoService.savePedido(pedido);
		return "redirect:/pedidos/nuevoPedido";
	}
	
	@GetMapping(value = "/pedidos/nuevoPedido")
	public String initCreationForm66(Map<String, Object> model) {
		Pedido pedido =this.pedidoService.findPedido(this.pedidoService.findAll().size()).get();
	
		List<LineaPedido> lp = this.pedidoService.findLineasPedidoPorPedido(pedido.getId());
		Double precioTotal =0.;
		for(int i=0;i<lp.size();i++) {
			precioTotal= precioTotal+(lp.get(i).getProducto().getPrecio()*lp.get(i).getCantidad());
		}
		this.pedidoService.actualizarPrecioPedido(pedido.getId(),precioTotal);
//		System.out.println(lp);
		model.put("lineaPedido", lp);
		model.put("pedidoId", pedido.getId());
		return "pedidos/nuevoPedido";
	}
	
	@GetMapping(value = "/pedidos/nuevoPedido/nuevaLineaPedido/{pedidoId}")
	public String initCreationForm3(@PathVariable("pedidoId") String pedidoId,Map<String, Object> model) {
		model.put("pedidoId", pedidoId);
		model.put("lineaPedido", new LineaPedido());
		return "pedidos/nuevaLineaPedido";
	}
	@PostMapping(value = "/pedidos/nuevoPedido/nuevaLineaPedido/{pedidoId}")
	public String initCreationForm5(@PathVariable("pedidoId") String pedidoId,LineaPedido lineaPedido,Map<String, Object> model) {
		Pedido pedido = this.pedidoService.findPedido(Integer.parseInt(pedidoId)).get();
		lineaPedido.setPedido(pedido);
		this.lineaPedidoService.saveLineaPedido(lineaPedido);
		return "redirect:/pedidos/nuevoPedido";
	}
	@GetMapping(value = "/pedidos/deletePedido/{pedidoId}")
	public String initCreationForm533(@PathVariable("pedidoId") String pedidoId,LineaPedido lineaPedido,Map<String, Object> model) {
		this.pedidoService.deleteById(Integer.parseInt(pedidoId));
		
		return "redirect:/pedidos/nuevoPedido";
	}
	


}
