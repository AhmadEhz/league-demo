package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Player;
import org.league.repository.PlayerRepository;

import javax.persistence.EntityManager;

public class PlayerRepositoryImpl extends BaseRepositoryImpl<Player,Long> implements PlayerRepository {
    public PlayerRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }
    @Override
    public Class<Player> getEntityClass() {
        return Player.class;
    }
}
