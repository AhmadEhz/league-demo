package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.GoalScorer;
import org.league.repository.GoalScorerRepository;
import org.league.service.GoalScorerService;

public class GoalScorerServiceImpl extends BaseServiceImpl<GoalScorer,Long, GoalScorerRepository> implements GoalScorerService {
    public GoalScorerServiceImpl(GoalScorerRepository repository) {
        super(repository);
    }
}
