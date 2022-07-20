package test;

import character.weapon.Weapon;
import character.weapon.repository.Impl.WeaponRepositoryImpl;
import character.weapon.repository.WeaponRepository;

import java.util.List;

public class WeaponRepositoryImplTest {
    public static void main(String[] args) {
        WeaponRepository repository =
                new WeaponRepositoryImpl();

        List<Weapon> list = repository.findAllWeapon();
        for (Weapon weapon : list) {
            System.out.println(weapon);
        }
    }
}
