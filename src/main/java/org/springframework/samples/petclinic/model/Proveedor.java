package org.springframework.samples.petclinic.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor extends BaseEntity {

//	@Column(name = "birth_date")        
//	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private String nombre;

//	@ManyToOne
//	@JoinColumn(name = "type_id")
	private String direccion;

//	@ManyToOne
//	@JoinColumn(name = "owner_id")
	private Integer telefono;

//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet", fetch = FetchType.EAGER)
	private String correoElectronico;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor")
	private Set<Pedido> pedidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Proveedor [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", correoElectronico=" + correoElectronico + ", pedidos=" + pedidos + "]";
	}

	
	
	

}
