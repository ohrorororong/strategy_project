package character.pet.product;

import character.pet.Pet;

public class Dog extends Pet {

    public Dog(String name, String introduce) {
        super(name, introduce);
    }

    @Override
    public void sound() {
        System.out.println("멍~~ 멍~~ 크왕~~");
    }
}
