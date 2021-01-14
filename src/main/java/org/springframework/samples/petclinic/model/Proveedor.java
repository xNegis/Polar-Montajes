package org.springframework.samples.petclinic.model;

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
	

}
