package character.pet.repository;

import character.pet.Pet;

import java.util.List;

public interface PetRepository {
    List<Pet> findAllPet();
    Pet findByPetId(Long id);

}
