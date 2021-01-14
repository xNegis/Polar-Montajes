package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class PeriodoVacaciones extends BaseEntity {
	
	@Column(name = "FechaInicio")
	@NotEmpty
	protected Date fechaInicio;
	
	@Column(name = "FechaFin")
	@NotEmpty
	protected Date fechaFin;
	
	@Column(name = "Vacaciones")
	@NotEmpty
	protected Vacaciones Vacaciones;

}
