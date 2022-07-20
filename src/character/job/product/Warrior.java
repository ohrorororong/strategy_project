package character.job.product;

import character.job.Job;

public class Warrior extends Job {

    public Warrior(String name, String info) {
        super(name, info);
    }

    @Override
    public void skill() {
        System.out.println("*** 근접한 적을 칼로 공격할 수 있습니다 ***");
    }
}
