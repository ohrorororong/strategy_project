package character.pet.product;

import character.pet.Pet;

public class Cat extends Pet {

    public Cat(String name, String introduce) {
        super(name, introduce);
    }

    @Override
    public void sound() {
        System.out.println("야옹~ 야옹~ 야~옹~");
    }

}
