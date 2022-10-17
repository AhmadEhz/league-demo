package org.league.base.repository;

import org.league.base.entity.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;

public interface BaseRepository<E extends BaseEntity,ID extends Serializable> {
    E read(ID id);
    void create (E e);
    void delete (E e);
    void update (E e);
    Class<E> getEntityClass();
    EntityManager getEntityManager();
}
