package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class Pedido extends BaseEntity{
	
	@Column(name = "fecha")
	@NotEmpty
	protected Date fecha;
	
	@Column(name = "Precio")
	@NotEmpty
	protected Double precio;
	
	@Column(name = "Pagado")
	@NotEmpty
	protected Boolean pagado;
	
	@Column(name = "PrecioTotal")
	@NotEmpty
	protected Double precioTotal;

}
