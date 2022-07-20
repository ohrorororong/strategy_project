package character.pet.repository.Impl;

import character.pet.Pet;
import character.pet.product.Cat;
import character.pet.product.Dog;
import character.pet.product.Hamster;
import character.pet.repository.PetRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetRepositoryImpl implements PetRepository {

    private static Map<Long, Pet> store = new HashMap<>();

    public PetRepositoryImpl() {
        petInit();
    }

    private void petInit() {
        store.put(1L, new Dog("강아지", "귀엽습니다."));
        store.put(2L, new Cat("고양이", "게으릅니다."));
        store.put(3L, new Hamster("햄스터", "빠릅니다."));
    }
    @Override
    public List<Pet> findAllPet() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Pet findByPetId(Long id) {
        return store.get(id);
    }
}
