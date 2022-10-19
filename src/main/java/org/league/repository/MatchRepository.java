package org.league.repository;

import org.league.base.repository.BaseRepository;
import org.league.entity.Match;

import java.util.List;

public interface MatchRepository extends BaseRepository<Match,Long> {
    List<Match> getDerbies();
}
