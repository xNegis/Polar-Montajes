/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura extends BaseEntity {

	@Column(name = "precio_total_sin_iva")
	private Double precioTotalSinIva;

	@Column(name = "iva")
	private Double iva;

	@Column(name = "precio_total_con_iva")
	private Double precioTotalConIva;

	@Enumerated(EnumType.STRING)
	@Column(name = "pago")
	private Pago pago;

	@Column(name = "fecha_vencimiento")
	private String fechaVencimiento;

	@Column(name = "fecha_emision")
	private String fechaEmision;

	@Column(name = "pagado")
	private Boolean pagado;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente")
	private Cliente cliente;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "trabajador")
	private Trabajador trabajador;

	@ManyToOne(cascade = CascadeType.ALL)
	private LineaFactura lineaFactura;

	public Double getPrecioTotalSinIva() {
		return precioTotalSinIva;
	}

	public void setPrecioTotalSinIva(Double precioTotalSinIva) {
		this.precioTotalSinIva = precioTotalSinIva;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getPrecioTotalConIva() {
		return precioTotalConIva;
	}

	public void setPrecioTotalConIva(Double precioTotalConIva) {
		this.precioTotalConIva = precioTotalConIva;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Boolean getPagado() {
		return pagado;
	}

	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
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

	@Override
	public String toString() {
		return "Factura [precioTotalSinIva=" + precioTotalSinIva + ", iva=" + iva + ", precioTotalConIva="
				+ precioTotalConIva + ", pago=" + pago + ", fechaVencimiento=" + fechaVencimiento + ", fechaEmision="
				+ fechaEmision + ", pagado=" + pagado + "]";
	}

}
