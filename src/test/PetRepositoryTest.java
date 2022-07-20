package test;

import character.pet.Pet;
import character.pet.repository.Impl.PetRepositoryImpl;
import character.pet.repository.PetRepository;

import java.util.List;

public class PetRepositoryTest {
    public static void main(String[] args) {
        PetRepository repository = new PetRepositoryImpl();

        List<Pet> list = repository.findAllPet();
        for (Pet pet : list) {
            System.out.println(pet);
        }

    }
}
