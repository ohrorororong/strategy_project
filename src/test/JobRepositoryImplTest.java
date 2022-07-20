package test;


import character.job.Job;
import character.job.repsitory.Impl.JobRepositoryImpl;
import character.job.repsitory.JobRepository;

import javax.sound.sampled.Line;
import java.util.List;

public class JobRepositoryImplTest {
    public static void main(String[] args) {
        JobRepository repository = new JobRepositoryImpl();

        repository.findAllJob();

        List<Job> allJob = repository.findAllJob();

        for (Job job : allJob) {
            System.out.println(job);
        }
    }

}
