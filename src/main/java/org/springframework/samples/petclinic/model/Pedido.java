package org.springframework.samples.petclinic.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

public class Pedido extends BaseEntity{
	
	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;
	
	@Column(name = "Precio")
	@NotEmpty
	private Double precio;
	
	@Column(name = "Pagado")
	@NotEmpty
	private Boolean pagado;
	
	@Column(name = "PrecioTotal")
	@NotEmpty
	private Double precioTotal;
	
	@ManyToOne
	private Trabajador trabajador;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	private Set<LineaPedido> lineaspedido;
	
	@ManyToOne
	private Proveedor proveedor;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean getPagado() {
		return pagado;
	}

	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public Set<LineaPedido> getLineaspedido() {
		return lineaspedido;
	}

	public void setLineaspedido(Set<LineaPedido> lineaspedido) {
		this.lineaspedido = lineaspedido;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
}
