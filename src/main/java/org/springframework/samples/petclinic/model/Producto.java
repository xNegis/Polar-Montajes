package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class Producto extends BaseEntity{
	
	@Column(name = "Name")
	@NotEmpty
	protected String name;

	@Column(name = "Precio")
	@NotEmpty
	protected Double precio;
	
	
}
