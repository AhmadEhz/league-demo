package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Club;
import org.league.entity.Coach;
import org.league.repository.ClubRepository;
import org.league.service.ClubService;

import java.util.List;
import java.util.Map;

public class ClubServiceImpl extends BaseServiceImpl<Club,Long, ClubRepository>
        implements ClubService {
    public ClubServiceImpl(ClubRepository repository) {
        super(repository);
    }
    @Override
    public void removeCoach(Club club) {
        repository.removeCoach(club);
    }
    @Override
    public void setCoach(Club club, Coach coach) {
        repository.setCoach(club,coach);
    }
    @Override
    public List<Club> getClubLeague() {
        return repository.getClubLeague();
    }
    @Override
    public Map<String, List<Club>> getClubsPerCity() {
        return repository.getClubsPerCity();
    }
    @Override
    public Club getWinner() {
        return repository.getClubLeague().get(0);
    }

}
