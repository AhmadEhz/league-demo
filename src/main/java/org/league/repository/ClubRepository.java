package org.league.repository;

import org.league.base.repository.BaseRepository;
import org.league.entity.Club;
import org.league.entity.Coach;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ClubRepository extends BaseRepository<Club, Long> {
    Optional<Club> read(String name);

    void removeCoach(Club club);

    void setCoach(Club club, Coach coach);

    List<Club> getClubLeague();

    Map<String, List<Club>> getClubsPerCity();
}
