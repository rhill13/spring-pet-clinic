package biz.rookware.sfgpetclinic.services;

import java.util.Set;

import biz.rookware.sfgpetclinic.model.Pet;

public interface PetService {
    
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
