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

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Simple business object representing a pet.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 */
@Entity
@Table(name = "facturas")  
public class Factura extends BaseEntity {

	@Column(name = "precioTotalSinIva")        
	private Double precioTotalSinIva;

	
	@Column(name = "iva")        
	private int iva;

	
	@Column(name = "precioTotalConIva")        
	private Double precioTotalConIva;
	
	@Column(name = "pago")        
	private Pago pago;

	
	@Column(name = "fechaVencimiento")        
	private LocalDate fechaVencimiento;
	
	

	@Column(name = "fechaEmision")        
	private LocalDate fechaEmision;
	

	@Column(name = "pagado")        
	private Boolean pagado;


	public Double getPrecioTotalSinIva() {
		return precioTotalSinIva;
	}


	public void setPrecioTotalSinIva(Double precioTotalSinIva) {
		this.precioTotalSinIva = precioTotalSinIva;
	}


	public int getIva() {
		return iva;
	}


	public void setIva(int iva) {
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


	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	public LocalDate getFechaEmision() {
		return fechaEmision;
	}


	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}


	public Boolean getPagado() {
		return pagado;
	}


	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}
	


	

}
