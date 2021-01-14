package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "periodo_vacaciones")
public class PeriodoVacaciones extends BaseEntity {
	
	@Column(name = "FechaInicio")
	@NotEmpty
	protected Date fechaInicio;
	
	@Column(name = "FechaFin")
	@NotEmpty
	protected Date fechaFin;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Vacaciones")
	@NotEmpty
	protected Vacaciones Vacaciones;
	
	@ManyToOne
	@JoinColumn(name = "trabajador")
	private Trabajador trabajador;

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Vacaciones getVacaciones() {
		return Vacaciones;
	}

	public void setVacaciones(Vacaciones vacaciones) {
		Vacaciones = vacaciones;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	@Override
	public String toString() {
		return "PeriodoVacaciones [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", Vacaciones=" + Vacaciones
				+ ", trabajador=" + trabajador + "]";
	}

	

}
