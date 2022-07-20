package character.portal.product;

import character.portal.Portal;

public class Hospital extends Portal {


    public Hospital(String name, String intorduce) {
        super(name, intorduce);
    }

    @Override
    public void move() {
        System.out.println("병원으로 이동합니다.");

    }
}
