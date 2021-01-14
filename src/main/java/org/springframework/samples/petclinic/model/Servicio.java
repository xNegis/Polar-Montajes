package org.springframework.samples.petclinic.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "servicio")
public class Servicio extends BaseEntity {

	@Column(name = "tiempo_empleado")
	private Double tiempoEmpleado;

	@Column(name = "fecha_inicio")
	@NotNull
	private String fechaInicio;

	@Column(name = "fecha_fin")
	private String fechaFin;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_servicio")
	@NotNull
	private TipoServicio tipoServicio;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente")
	private Cliente cliente;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trabajador")
	private Trabajador trabajador;
	
	@OneToOne(mappedBy="servicio")
	private LineaFactura lineaFactura;
	
	public void finalizarServicio() {
		this.setFechaFin(LocalDate.now().toString());
	}
	
	public Double getTiempoEmpleado() {
		return tiempoEmpleado;
	}

	public void setTiempoEmpleado(Double tiempoEmpleado) {
		this.tiempoEmpleado = tiempoEmpleado;
	}

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

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public LineaFactura getLineaFactura() {
		return lineaFactura;
	}

	public void setLineaFactura(LineaFactura lineaFactura) {
		this.lineaFactura = lineaFactura;
	}

//	@Override
//	public String toString() {
//		return "Servicio [tiempoEmpleado=" + tiempoEmpleado + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
//				+ ", tipoServicio=" + tipoServicio + "]";
//	}



	
	
	
}
