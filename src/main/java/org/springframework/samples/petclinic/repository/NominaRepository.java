package org.springframework.samples.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.model.Nomina;

public interface NominaRepository extends CrudRepository<Nomina, Integer> {

}
