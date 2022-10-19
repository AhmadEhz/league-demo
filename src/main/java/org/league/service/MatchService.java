package org.league.service;

import org.league.base.service.BaseService;
import org.league.entity.Match;
import org.league.repository.MatchRepository;

import java.util.List;

public interface MatchService extends BaseService<Match,Long, MatchRepository>  {
    void setMatch(Long homeClubId, Long awayClubId, int homeClubGoals, int awayClubGoals);

    List<Match> getDerbies();
}
