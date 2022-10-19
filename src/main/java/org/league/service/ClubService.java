package org.league.service;

import org.league.base.service.BaseService;
import org.league.entity.Club;
import org.league.entity.Coach;
import org.league.repository.ClubRepository;

import java.util.List;
import java.util.Map;

public interface ClubService extends BaseService<Club,Long, ClubRepository> {
    void removeCoach(Club club);

    void setCoach(Club club, Coach coach);

    List<Club> getClubLeague();

    Map<String, List<Club>> getClubsPerCity();

    Club getWinner();
}
