package org.league.base.repository;

import org.league.base.entity.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;

public abstract class BaseRepositoryImpl<E extends BaseEntity, ID extends Serializable> implements BaseRepository<E, ID> {
    private EntityManager entityManager;

    public BaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public E read(ID id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public void create(E e) {
        entityManager.persist(e);
    }

    @Override
    public void delete(E e) {
        entityManager.remove(e);
    }

    @Override
    public void update(E e) {
        entityManager.merge(e);
    }
    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public abstract Class<E> getEntityClass();
}
