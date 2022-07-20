package server;

import character.GameCharacter;
import character.weapon.Weapon;
import character.weapon.repository.WeaponRepository;

import java.util.List;
import java.util.Scanner;

public class GameServer {

    private final WeaponRepository weaponRepository;
    private Scanner sc = new Scanner(System.in);
    private final GameCharacter character;

    public GameServer(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
        this.character = new GameCharacter();
    }

    public void gameStart() {
        while (true) {
            int menu = chooseMenu();
            if(menu != 100) {
                process(menu);
            } else {
                break;
            }
        }
    }

    private int chooseMenu() {
        showMenu();
        return getMenu();
    }

    private void showMenu() {
        System.out.println("--------------------");
        System.out.println("[1]. 무기 리스트 보기");
        System.out.println("[2]. 직업 리스트 보기");
        System.out.println("[3]. 맵 리스트 보기");
        System.out.println("[4]. 무기 선택하기");
        System.out.println("[5]. 직업 선택하기");
        System.out.println("[6]. 맵 선택하기");
        System.out.println("[7]. 캐릭터 정보 보기");
        System.out.println("[100]. 종료하기");
        System.out.println("--------------------");
    }

    private int getMenu() {
        return sc.nextInt();
    }

    private void process(int menu) {
//        switch (menu) {
//            case 1 -> selectMenu1();
//            case 2 -> selectMenu2();
//            case 3 -> selectMenu3();
//            case 4 -> selectMenu4();
//            case 5 -> selectMenu5();
//            case 6 -> selectMenu6();
//            case 7 -> selectMenu7();
//        }
    }

    private void selectMenu1() {
        System.out.println("[1]. 무기 리스트 보기를 선택하였습니다.");
        List<Weapon> allWeapon = weaponRepository.findAllWeapon();
        allWeapon.forEach(System.out::println);
    }

    private void selectMenu2() {
        System.out.println("[2]. 직업 리스트 보기를 선택하였습니다.");
    }

    private void selectMenu3() {
        System.out.println("[3]. 맵 리스트 보기를 선택하였습니다.");
    }

    private void selectMenu4() {
        System.out.println("[4]. 무기 선택하기를 선택하였습니다.");
        List<Weapon> allWeapon = weaponRepository.findAllWeapon();
        allWeapon.forEach(System.out::println);
        System.out.print("무기를 하나 골라주세요: ");
        int choose = sc.nextInt();
        character.changedWeapon(weaponRepository.findByWeaponId((long) choose));
    }

    private void selectMenu5() {
        System.out.println("[5]. 직업 선택하기를 선택하였습니다.");
    }

    private void selectMenu6() {
        System.out.println("[6]. 맵 선택하기를 선택하였습니다.");
    }

    private void selectMenu7() {
        System.out.println("[7]. 캐릭터 정보 보기를 선택하였습니다.");
        System.out.println(character.toString());
    }
}
