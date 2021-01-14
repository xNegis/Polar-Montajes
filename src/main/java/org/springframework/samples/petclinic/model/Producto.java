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
public class Producto extends BaseEntity{
	
	@Column(name = "Name")
	@NotEmpty
	protected String name;

	@Column(name = "Precio")
	@NotEmpty
	protected Double precio;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
	private Set<Producto> producto;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Producto [name=" + name + ", precio=" + precio + ", producto=" + producto + "]";
	}

	
}
