package character.weapon.product;

import character.weapon.Weapon;

public class Bow extends Weapon {

    public Bow(String name, String introduce) {
        super(name, introduce);
    }

    @Override
    public void attack() {
        System.out.println("활로 공격!!!");
    }
}
