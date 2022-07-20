package character.job;

public abstract class Job {
    private String name;
    private String info;

    public Job(String name, String info){
        this.name = name;
        this.info = info;
    }

    public void showJobInfo() {
        System.out.println("현재 직업 정보입니다.");
        System.out.println(info);
    }

    public abstract void skill();


    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
