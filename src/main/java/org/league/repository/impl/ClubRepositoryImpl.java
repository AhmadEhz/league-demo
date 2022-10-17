package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Club;
import org.league.repository.ClubRepository;

import javax.persistence.EntityManager;

public class ClubRepositoryImpl extends BaseRepositoryImpl<Club,Long> implements ClubRepository {
    public ClubRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }
    @Override
    public Class<Club> getEntityClass() {
        return Club.class;
    }
}
