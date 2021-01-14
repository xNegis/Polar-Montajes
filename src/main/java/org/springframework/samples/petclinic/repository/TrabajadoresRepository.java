package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.Nomina;
import org.springframework.samples.petclinic.model.PeriodoVacaciones;
import org.springframework.samples.petclinic.model.Trabajador;

public interface TrabajadoresRepository extends CrudRepository<Trabajador, Integer>{
	List<Trabajador> findAll() throws DataAccessException;
	
	@Query(value="SELECT * FROM TRABAJADOR WHERE TRABAJADOR.ID =?1", nativeQuery = true)
	public Trabajador findTrabajadorByID(Integer id);

}
