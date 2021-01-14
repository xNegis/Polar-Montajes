package org.springframework.samples.petclinic.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

public class Servicio extends BaseEntity {

	@Column(name = "tiempo_empleado")
	private Double tiempoEmpleado;

	@Column(name = "fecha_inicio")
	@NotNull
	private LocalDate fechaInicio;

	@Column(name = "fecha_fin")
	private LocalDate fechaFin;

	@Column(name = "tipoServcio")
	@NotNull
	private TipoServicio tipoServicio;

	@ManyToOne(cascade = CascadeType.ALL)
	@NotNull
	private Cliente cliente;
	
	public void finalizarServicio() {
		this.setFechaFin(LocalDate.now());
	}

	public Double getTiempoEmpleado() {
		return tiempoEmpleado;
	}

	public void setTiempoEmpleado(Double tiempoEmpleado) {
		this.tiempoEmpleado = tiempoEmpleado;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
