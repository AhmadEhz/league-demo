package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Coach;
import org.league.entity.CoachTransfer;
import org.league.repository.CoachTransferRepository;

import javax.persistence.EntityManager;

public class CoachTransferRepositoryImpl extends BaseRepositoryImpl<CoachTransfer,Long> implements CoachTransferRepository {
    public CoachTransferRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<CoachTransfer> getEntityClass() {
        return CoachTransfer.class;
    }
}
