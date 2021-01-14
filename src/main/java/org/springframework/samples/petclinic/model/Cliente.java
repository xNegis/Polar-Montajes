package org.springframework.samples.petclinic.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private Set<Factura> facturas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private Set<Servicio> servicio;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Set<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}

	public Set<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(Set<Servicio> servicio) {
		this.servicio = servicio;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion
				+ ", facturas=" + facturas + ", servicio=" + servicio + "]";
	}
	
	
}
