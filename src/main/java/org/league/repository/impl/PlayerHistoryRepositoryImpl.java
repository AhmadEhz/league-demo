package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.PlayerHistory;
import org.league.repository.PlayerHistoryRepository;

import javax.persistence.EntityManager;

public class PlayerHistoryRepositoryImpl extends BaseRepositoryImpl<PlayerHistory,Long> implements PlayerHistoryRepository {
    public PlayerHistoryRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<PlayerHistory> getEntityClass() {
        return PlayerHistory.class;
    }
}
