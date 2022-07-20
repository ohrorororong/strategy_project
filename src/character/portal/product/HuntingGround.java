package character.portal.product;

import character.portal.Portal;

public class HuntingGround extends Portal {


    public HuntingGround(String name, String intorduce) {
        super(name, intorduce);
    }

    @Override
    public void move() {
        System.out.println("사냥터로 이동합니다.");

    }
}
