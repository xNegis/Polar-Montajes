package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LineaPedido extends BaseEntity {

	@Column(name = "cantidad")
	@NotNull
	private Integer cantidad;

	@Column(name = "descripcion")
	@NotEmpty
	private String descripcion;

}
