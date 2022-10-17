package org.league.base.service;

import org.league.base.entity.BaseEntity;
import org.league.base.repository.BaseRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.function.Consumer;

public class BaseServiceImpl<E extends BaseEntity, ID extends Serializable, R extends BaseRepository<E, ID>> implements BaseService<E, ID, R> {
    private final R repository;
    private final EntityManager entityManager;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
        entityManager = repository.getEntityManager();
    }

    @Override
    public E load(ID id) {
        return repository.read(id);
    }

    @Override
    public void save(E e) {
        execute(e, repository::create);
    }

    @Override
    public void remove(E e) {
        execute(e, repository::delete);
    }

    @Override
    public void update(E e) {
        execute(e,repository::update);
    }

    private void execute(E e, Consumer<E> consumer) {
        try {
            entityManager.getTransaction().begin();
            consumer.accept(e);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            throw ex;
        }
    }
}
