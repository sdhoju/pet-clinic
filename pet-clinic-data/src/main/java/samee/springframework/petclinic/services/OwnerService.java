package samee.springframework.petclinic.services;

import java.util.Set;

import samee.springframework.petclinic.model.Owner;

public interface OwnerService {

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
