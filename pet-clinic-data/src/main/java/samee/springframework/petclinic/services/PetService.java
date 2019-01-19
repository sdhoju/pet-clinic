package samee.springframework.petclinic.services;

import java.util.Set;

import samee.springframework.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
