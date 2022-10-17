package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Match;
import org.league.repository.MatchRepository;

import javax.persistence.EntityManager;

public class MatchRepositoryImpl extends BaseRepositoryImpl<Match,Long>
        implements MatchRepository {
    public MatchRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Match> getEntityClass() {
        return Match.class;
    }
}
