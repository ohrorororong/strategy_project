package character;

import character.pet.Pet;
import character.weapon.Weapon;

public class GameCharacter {
    private Weapon weapon; // 무기
    // 직업
    // 맵
    private Pet pet; // 펫

    // 현재 무기 정보 보여주기
    public void currentWeaponInfoShow() {
        weapon.showWeaponInfo();
    }
    // 현재 직업 정보 보여주기
    // 현재 맵 정보 보여주기
    // 현재 펫 정보 보여주기

    //////////////////////////////////////////////////////

    // 무기 - 공격
    public void attack() {
        weapon.attack();
    }
    // 직업 - 변경
    // 맵 - 이동
    // 펫 - 변경

    //////////////////////////////////////////////////////

    // 무기 - 변경
    public void changedWeapon(Weapon weapon) {
        if(weapon != null) {
            this.weapon = weapon;
        }
    }
    // 직업 - 변경
    // 맵 - 변경
    // 펫 - 변경
    public void changedPet(Pet pet) {
        if (pet != null) {
            this.pet = pet;
        }
    }


    @Override
    public String toString() {
        return "GameCharacter{" +
                "weapon=" + weapon +
                ", pet=" + pet +
                '}';
    }
}
