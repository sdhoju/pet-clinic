package samee.springframework.petclinic.services;

import java.util.Set;

import samee.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
	
}
