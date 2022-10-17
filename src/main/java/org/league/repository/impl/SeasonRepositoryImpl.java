package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Season;
import org.league.repository.SeasonRepository;

import javax.persistence.EntityManager;

public class SeasonRepositoryImpl extends BaseRepositoryImpl<Season,Long> implements SeasonRepository {
    public SeasonRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Season> getEntityClass() {
        return Season.class;
    }
}
