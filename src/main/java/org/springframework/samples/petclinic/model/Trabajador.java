package org.springframework.samples.petclinic.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Simple JavaBean domain object representing an owner.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Michael Isvy
 */
@Entity
@Table(name = "trabajador")
public class Trabajador extends Person {

	@Column(name="dni")
	private String dni;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "direccion")
	private String direccion;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "es_gerente")
	private Boolean esGerente;
		
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajador")
	private Set<Nomina> nominas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajador")
	private Set<Pedido> pedidos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajador")
	private Set<PeriodoVacaciones> vacaciones;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajador")
	private Set<Factura> facturas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajador")
	private Set<Servicio> servicio;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getEsGerente() {
		return esGerente;
	}

	public void setEsGerente(Boolean esGerente) {
		this.esGerente = esGerente;
	}

	public Set<Nomina> getNominas() {
		return nominas;
	}

	public void setNominas(Set<Nomina> nominas) {
		this.nominas = nominas;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Set<PeriodoVacaciones> getVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(Set<PeriodoVacaciones> vacaciones) {
		this.vacaciones = vacaciones;
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
		return "Trabajador [dni=" + dni + ", email=" + email + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", esGerente=" + esGerente +"]";
	}	
	
	
}