package org.springframework.samples.petclinic.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "producto")
public class Producto extends NamedEntity {

	@Column(name = "Precio")
	@NotEmpty
	protected Double precio;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Producto> producto;

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Set<Producto> getProducto() {
		return producto;
	}

	public void setProducto(Set<Producto> producto) {
		this.producto = producto;
	}

//	@Override
//	public String toString() {
//		return "Producto [precio=" + precio + ", producto=" + producto + "]";
//	}

}
