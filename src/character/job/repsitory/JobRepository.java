package character.job.repsitory;

import character.job.Job;

import java.util.List;

public interface JobRepository {

    List<Job> findAllJob();

    Job findByJobId(Long id);
}
