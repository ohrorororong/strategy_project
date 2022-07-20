package character;

import character.portal.Portal;
import character.job.Job;
import character.pet.Pet;
import character.weapon.Weapon;

public class GameCharacter {
    private Weapon weapon; // 무기
    private Job job;// 직업
    // 맵
    private Portal portal;
    // 펫
    private Pet pet; // 펫

    // 현재 무기 정보 보여주기
    public void currentWeaponInfoShow() {
        weapon.showWeaponInfo();
    }
    // 현재 직업 정보 보여주기
    public void currentJobInfoShow() {
        job.showJobInfo();
    }
    // 현재 맵 정보 보여주기
    // 현재 펫 정보 보여주기

    //////////////////////////////////////////////////////

    // 무기 - 공격
    public void attack() {
        weapon.attack();
    }
    // 직업 - 변경
    // 맵 - 이동
    public void movePortal(){
        portal.move();
    }

    // 펫 - 변경

    //////////////////////////////////////////////////////

    // 무기 - 변경
    public void changedWeapon(Weapon weapon) {
        if(weapon != null) {
            this.weapon = weapon;
        }
    }
    // 직업 - 변경
    public void changedJob(Job job) {
        if (job != null) {
            this.job = job;
        }
    }

    // 맵 - 변경
    public void changePortal(Portal portal){
        if(portal != null){
            this.portal = portal;
        }
    }

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
                ", portal=" + portal +
                ", job=" + job +
                '}';
    }
}
