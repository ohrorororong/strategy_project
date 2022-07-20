package character.job;

public abstract class Job {
    private String name;
    private String info;

    public Job(String name, String info){
        this.name = name;
        this.info = info;
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
