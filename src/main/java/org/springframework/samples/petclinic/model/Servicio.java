package org.springframework.samples.petclinic.model;

public class Servicio extends BaseEntity {

//	@Column(name = "birth_date")        
//	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Integer tiempoEmpleado;

//	@ManyToOne
//	@JoinColumn(name = "type_id")
	private String fechaInicio;

//	@ManyToOne
//	@JoinColumn(name = "owner_id")
	private Integer fechaFin;

//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pet", fetch = FetchType.EAGER)
	private TipoServicio tipoServicio;	
}
