package org.springframework.samples.petclinic.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "pedido")
public class Pedido extends BaseEntity {

	@Column(name = "fecha")
	@NotEmpty
	private String fecha;

	@Column(name = "precio")
	@NotEmpty
	private Double precio;

	@Column(name = "pagado")
	@NotEmpty
	private Boolean pagado;

	@ManyToOne
    @JoinColumn(name = "trabajador")
	private Trabajador trabajador;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	private Set<LineaPedido> lineaspedido;

	@ManyToOne
    @JoinColumn(name = "proveedor")
	private Proveedor proveedor;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
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

	@Override
	public String toString() {
		return "Pedido [fecha=" + fecha + ", precio=" + precio + ", pagado=" + pagado 
				+ ", trabajador=" + trabajador + ", lineaspedido=" + lineaspedido + ", proveedor=" + proveedor + "]";
	}

	

}
