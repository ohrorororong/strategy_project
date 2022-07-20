package character.pet;

abstract public class Pet {
    private String name;
    private String introduce;

    public Pet(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

    abstract public void sound();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
