package org.league.base.service;

import org.league.base.entity.BaseEntity;
import org.league.base.repository.BaseRepository;

import java.io.Serializable;

public interface BaseService<E extends BaseEntity, ID extends Serializable, R extends BaseRepository<E,ID>> {
    E load(ID id);
    void save(E e);
    void remove(E e);
    void update(E e);
}
