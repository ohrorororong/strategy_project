package server;

import character.GameCharacter;
import character.portal.Portal;
import character.portal.repository.*;

import character.portal.repository.Impl.PortalRepositoryImpl;
import character.job.Job;
import character.job.repsitory.Impl.JobRepositoryImpl;
import character.job.repsitory.JobRepository;
import character.pet.Pet;
import character.pet.repository.Impl.PetRepositoryImpl;
import character.pet.repository.PetRepository;
import character.weapon.Weapon;
import character.weapon.repository.WeaponRepository;

import java.util.List;
import java.util.Scanner;

public class GameServer {

    private final WeaponRepository weaponRepository;
    private final PortalRepository portalRepository = new PortalRepositoryImpl();
    private final JobRepository jobRepository = new JobRepositoryImpl();

    private final PetRepository petRepository = new PetRepositoryImpl();

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
        System.out.println("[0]. 펫 리스트 보기");
        System.out.println("[1]. 무기 리스트 보기");
        System.out.println("[2]. 직업 리스트 보기");
        System.out.println("[3]. 맵 리스트 보기");
        System.out.println("[4]. 무기 선택하기");
        System.out.println("[5]. 직업 선택하기");
        System.out.println("[6]. 맵 선택하기");
        System.out.println("[7]. 캐릭터 정보 보기");
        System.out.println("[77]. 펫 선택하기");
        System.out.println("[100]. 종료하기");
        System.out.println("--------------------");
    }

    private int getMenu() {
        return sc.nextInt();
    }

    private void process(int menu) {
        switch (menu) {
            case 0:
                selectMenu0();
                break;
            case 1:
                selectMenu1();
                break;
            case 2:
                selectMenu2();
                break;
            case 3:
                selectMenu3();
                break;
            case 4:
                selectMenu4();
                break;
            case 5:
                selectMenu5();
                break;
            case 6:
                selectMenu6();
                break;
            case 7:
                selectMenu7();
                break;
            case 77:
                selectMenu77();
                break;
            default:
                break;
        }
    }
    private void selectMenu0() {
        System.out.println("[0]. 펫 리스트 보기를 선택하셨습니다. ");
        List<Pet> allPet = petRepository.findAllPet();
        allPet.forEach(System.out::println);

    }
    private void selectMenu1() {
        System.out.println("[1]. 무기 리스트 보기를 선택하였습니다.");
        List<Weapon> allWeapon = weaponRepository.findAllWeapon();
        allWeapon.forEach(System.out::println);
    }

    private void selectMenu2() {
        System.out.println("[2]. 직업 리스트 보기를 선택하였습니다.");
        List<Job> allJob = jobRepository.findAllJob();
        allJob.forEach(System.out::println);
    }

    private void selectMenu3() {
        System.out.println("[3]. 맵 리스트 보기를 선택하였습니다.");
        List<Portal> allPortal = portalRepository.findAllMap();
        allPortal.forEach(System.out::println);
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
        List<Job> allJob = jobRepository.findAllJob();
        allJob.forEach(System.out::println);
        System.out.print("직업을 하나 골라주세요: ");
        int choose = sc.nextInt();
        character.changedJob(jobRepository.findByJobId((long) choose));
    }

    private void selectMenu6() {
        System.out.println("[6]. 맵 선택하기를 선택하였습니다.");
        List<Portal> allPortal = portalRepository.findAllMap();
        for (Portal portal : allPortal){
            System.out.println(portal);
        }
        System.out.print("포탈을 하나 골라주세요: ");
        int choose = sc.nextInt();
        character.changePortal(portalRepository.findByPortalId((long) choose));
    }

    private void selectMenu7() {
        System.out.println("[7]. 캐릭터 정보 보기를 선택하였습니다.");
        System.out.println(character.toString());
    }
    private void selectMenu77() {
        System.out.println("[77] 펫 선택하기를 선택하셨습니다.");
        List<Pet> allPet = petRepository.findAllPet();
        allPet.forEach(System.out::println);
        System.out.println("귀여운 펫을 선택해 주세요: ");
        int choose = sc.nextInt();
        character.changedPet(petRepository.findByPetId((long) choose));
    }
}
