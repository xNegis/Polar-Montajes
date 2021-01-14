package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "linea_pedido")
public class LineaPedido extends BaseEntity {

	@Column(name = "cantidad")
	@NotNull
	private Integer cantidad;

	@Column(name = "descripcion")
	@NotEmpty
	private String descripcion;
	
	@ManyToOne
	private Pedido pedido;

	@ManyToOne
	private Producto producto;

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "LineaPedido [cantidad=" + cantidad + ", descripcion=" + descripcion + ", pedido=" + pedido
				+ ", producto=" + producto + "]";
	}

	
	
}
