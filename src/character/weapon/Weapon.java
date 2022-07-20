package character.weapon;

public abstract class Weapon {

    private String name;
    private String introduce;

    public Weapon(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

    public void showWeaponInfo() {
        System.out.println("현재 무기 정보입니다.");
        System.out.println(introduce);
    }


    public String getName() {
        return name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public abstract void attack();

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }


}
