package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Transfer;
import org.league.repository.TransferRepository;

import javax.persistence.EntityManager;

public class TransferRepositoryImpl extends BaseRepositoryImpl<Transfer,Long> implements TransferRepository {
    public TransferRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }
    @Override
    public Class<Transfer> getEntityClass() {
        return Transfer.class;
    }
}
