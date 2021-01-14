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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;

/**
 * Simple JavaBean domain object representing an owner.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Michael Isvy
 */
@Entity 
@Table(name = "nomina")
public class Nomina extends BaseEntity {

	@Column(name="sueldo_neto")
	private Integer sueldoNeto;
	
	@Column(name="sueldo_bruto")
	private Integer sueldoBruto;
	
	@Column(name="retenciones")
	private Double retenciones;
	
	@Column(name="horas_trabajadas")
	private Integer horasTrabajadas;
	
	@Column(name="horas_extra")
	private Integer horasExtra;
	
	@Column(name="precio_hora")
	private Integer precioHora; 
	
	@Column(name="precio_hora_extra")
	private Integer precioHoraExtra;
	
	@Column(name = "mes_año")
	private String mesAño;
	
	@ManyToOne
	@JoinColumn(name = "trabajador")
	private Trabajador trabajador;

	public Integer getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(Integer sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}

	public Integer getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(Integer sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public Double getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(Double retenciones) {
		this.retenciones = retenciones;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public Integer getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(Integer horasExtra) {
		this.horasExtra = horasExtra;
	}

	public Integer getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(Integer precioHora) {
		this.precioHora = precioHora;
	}

	public Integer getPrecioHoraExtra() {
		return precioHoraExtra;
	}

	public void setPrecioHoraExtra(Integer precioHoraExtra) {
		this.precioHoraExtra = precioHoraExtra;
	}

	public String getMesAño() {
		return mesAño;
	}

	public void setMesAño(String mesAño) {
		this.mesAño = mesAño;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	
	
	
	
		

}
