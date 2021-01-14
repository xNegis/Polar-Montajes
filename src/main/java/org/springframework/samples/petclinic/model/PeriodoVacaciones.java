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
	protected String fechaInicio;
	
	@Column(name = "FechaFin")
	
	protected String fechaFin;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Estado")
	
	protected Estado estado;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "Vacaciones")
	@NotEmpty
	protected Vacaciones vacaciones;
	
	@ManyToOne
	@JoinColumn(name = "trabajador")
	private Trabajador trabajador;

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Vacaciones getVacaciones() {
		return vacaciones;
	}

	public void setVacaciones(Vacaciones vacaciones) {
		this.vacaciones = vacaciones;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	@Override
	public String toString() {
		return "PeriodoVacaciones [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado + ", vacaciones=" + vacaciones
				+ ", trabajador=" + trabajador + "]";
	}

	

}
