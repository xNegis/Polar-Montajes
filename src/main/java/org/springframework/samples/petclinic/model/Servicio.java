package org.springframework.samples.petclinic.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

public class Servicio extends BaseEntity {

//	@Column(name = "birth_date")        
//	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Integer tiempoEmpleado;

//	@ManyToOne
//	@JoinColumn(name = "type_id")
	private String fechaInicio;

//	@ManyToOne
//	@JoinColumn(name = "owner_id")
	private Integer fechaFin;

	@Column(name = "tipoServcio")
	@NotNull
	private TipoServicio tipoServicio;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

}
