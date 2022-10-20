package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.Club;
import org.league.entity.Coach;
import org.league.repository.ClubRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClubRepositoryImpl extends BaseRepositoryImpl<Club, Long> implements ClubRepository {
    public ClubRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Club> getEntityClass() {
        return Club.class;
    }
    @Override

    public Optional<Club> read(String name) {
        try {
            return Optional.ofNullable(entityManager.createQuery("from Club where name = :name", Club.class)
                    .setParameter("name", name).getSingleResult());
        } catch (NoResultException nre) {
            return Optional.empty();
        }
    }

    @Override
    public void removeCoach(Club club) {
        entityManager.createQuery("update Club set coach = null where id = :id and name = :name")
                .setParameter("id", club.getId())
                .setParameter("name", club.getName())
                .executeUpdate();
    }

    @Override
    public void setCoach(Club club, Coach coach) {
        entityManager.createQuery("update Club set coach = :coach where id = :id and name = :name")
                .setParameter("coach", coach)
                .setParameter("id", club.getId())
                .setParameter("name", club.getName())
                .executeUpdate();
    }

    @Override
    public List<Club> getClubLeague() {
        try {
            return entityManager.createQuery("""
                from Club order by score desc, goalFor desc
                """,Club.class).getResultList();
        }
        catch (NoResultException nre) {
            return new ArrayList<>();
        }
    }

    @Override
    public Map<String, List<Club>> getClubsPerCity() {
        return entityManager.createQuery("from Club", Club.class)
                .getResultStream()
                .collect(Collectors.groupingBy(Club::getCity));
    }

}
