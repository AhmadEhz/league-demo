package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.GoalScorer;
import org.league.repository.GoalScorerRepository;

import javax.persistence.EntityManager;

public class GoalScorerRepositoryImpl extends BaseRepositoryImpl<GoalScorer,Long> implements GoalScorerRepository {
    public GoalScorerRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<GoalScorer> getEntityClass() {
        return GoalScorer.class;
    }
}
