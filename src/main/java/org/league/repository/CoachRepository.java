package org.league.repository;

import org.league.base.repository.BaseRepository;
import org.league.entity.Coach;

import java.util.List;

public interface CoachRepository extends BaseRepository<Coach,Long> {
    List<Coach> getCoachList();
}
