package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente extends Person {

	@Column(name = "dni")
	@NotEmpty
	private String dni;

	@Column(name = "telefono")
	@NotNull
	@Digits(fraction = 0, integer = 9)
	private Integer telefono;

	@Column(name = "correo")
	@NotEmpty
	private String correo;

	@Column(name = "direccion")
	@NotEmpty
	private String direccion;

}
