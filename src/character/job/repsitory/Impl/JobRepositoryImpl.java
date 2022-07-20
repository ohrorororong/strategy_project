package character.job.repsitory.Impl;

import character.job.Job;
import character.job.repsitory.JobRepository;
import character.job.product.Wizard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobRepositoryImpl implements JobRepository {

    private static Map<Long, Job> store = new HashMap<>();

    public JobRepositoryImpl() {
        productInit();
    }

    private void productInit() {
        store.put(1L, new Wizard("마법사", "장거리 공격이 가능합니다."));
        store.put(2L, new Wizard("전사", "근접 공격이 가능합니다."));
    }

    @Override
    public List<Job> findAllJob() {
        return new ArrayList<>(store.values());
    }
}
