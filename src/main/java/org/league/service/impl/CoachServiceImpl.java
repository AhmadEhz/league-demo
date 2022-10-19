package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Coach;
import org.league.repository.CoachRepository;
import org.league.service.CoachService;

import java.util.Comparator;
import java.util.List;

public class CoachServiceImpl extends BaseServiceImpl<Coach,Long, CoachRepository>
        implements CoachService {
    public CoachServiceImpl(CoachRepository repository) {
        super(repository);
    }
    @Override
    public List<Coach> getCoachList() {
        return repository.getCoachList();
    }
    public Coach getMostExpensiveCoach() {
        List<Coach> coachList = repository.getCoachList();
        return coachList.stream().max(Comparator.comparingDouble(Coach::getSalary)).get();
    }

}
