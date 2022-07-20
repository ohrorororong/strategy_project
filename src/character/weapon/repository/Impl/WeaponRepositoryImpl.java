package character.weapon.repository.Impl;

import character.weapon.Weapon;
import character.weapon.product.Sword;
import character.weapon.repository.WeaponRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeaponRepositoryImpl implements WeaponRepository {

    private static Map<Long, Weapon> store = new HashMap<>();

    public WeaponRepositoryImpl() {
        weaponInit();
    }

    private void weaponInit() {
        store.put(1L, new Sword("기본 칼222", "초보자용 입니다."));
    }

    @Override
    public List<Weapon> findAllWeapon() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Weapon findByWeaponId(Long id) {
        return store.get(id);
    }
}
