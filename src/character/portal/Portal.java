package character.portal;

public abstract class Portal {

    private String name;
    private String intorduce;

    public Portal(String name, String intorduce) {
        this.name = name;
        this.intorduce = intorduce;
    }

    public abstract void move();


    public void changePortal(){

    }



    @Override
    public String toString() {
        return "Portal{" +
                "name='" + name + '\'' +
                ", intorduce='" + intorduce + '\'' +
                '}';
    }
}
