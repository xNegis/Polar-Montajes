package org.springframework.samples.petclinic.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
	@Id
	String username;

	String password;
	String dni;

	boolean enabled;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private Set<Authorities> authorities;
}