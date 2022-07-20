package character.pet.product;

import character.pet.Pet;

public class Hamster extends Pet {
    public Hamster(String name, String introduce) {
        super(name, introduce);
    }

    @Override
    public void sound() {
        System.out.println("햄스터는 말 못해요.");
    }
}
