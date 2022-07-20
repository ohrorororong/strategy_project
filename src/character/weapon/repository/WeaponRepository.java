package character.weapon.repository;

import character.weapon.Weapon;

import java.util.List;

public interface WeaponRepository {
    List<Weapon> findAllWeapon();
    Weapon findByWeaponId(Long id);
}
