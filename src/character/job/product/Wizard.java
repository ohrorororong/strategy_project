package character.job.product;

import character.job.Job;

public class Wizard extends Job {

    public Wizard(String name, String info) {
        super(name, info);
    }

    @Override
    public void skill() {
        System.out.println("*** 장거리 적을 불로 공격할수 있습니다 ***");
    }
}
