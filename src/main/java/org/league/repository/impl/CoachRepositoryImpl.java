package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Coach;
import org.league.repository.CoachRepository;

import javax.persistence.EntityManager;

public class CoachRepositoryImpl extends BaseRepositoryImpl<Coach,Long> implements CoachRepository {
    public CoachRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Coach> getEntityClass() {
        return Coach.class;
    }
}
