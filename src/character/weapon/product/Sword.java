package character.weapon.product;

import character.weapon.Weapon;

public class Sword extends Weapon {


    public Sword(String name, String introduce) {
        super(name, introduce);
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " 공격!");
    }
}
