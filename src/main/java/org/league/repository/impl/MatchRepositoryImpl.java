package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Match;
import org.league.repository.MatchRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class MatchRepositoryImpl extends BaseRepositoryImpl<Match,Long>
        implements MatchRepository {
    public MatchRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Match> getEntityClass() {
        return Match.class;
    }
    @Override
    public List<Match> getDerbies() {
        return entityManager.createQuery("""
            from Match where homeClub.city = awayClub.city
            """,Match.class).getResultList();
    }
}
