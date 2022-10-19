package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Club;
import org.league.entity.Match;
import org.league.repository.ClubRepository;
import org.league.repository.MatchRepository;
import org.league.service.MatchService;
import org.league.util.ApplicationContext;
import org.league.util.exception.EntityNotFoundException;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MatchServiceImpl extends BaseServiceImpl<Match, Long, MatchRepository>
        implements MatchService {
    ClubRepository clubRepository = ApplicationContext.getClubRepository();

    public MatchServiceImpl(MatchRepository repository) {
        super(repository);
    }

    @Override
    public void setMatch(Long homeClubId, Long awayClubId, int homeClubGoals, int awayClubGoals) {
        Optional<Club> homeClub = clubRepository.read(homeClubId);
        Optional<Club> awayClub = clubRepository.read(awayClubId);
        if (homeClub.isEmpty() && awayClub.isEmpty())
            throw new EntityNotFoundException("Club not found!");
        Match match = new Match(homeClub.get(), homeClubGoals, awayClub.get(), awayClubGoals);
        setClubs(homeClub.get(), awayClub.get(), homeClubGoals, awayClubGoals);
        try {
            entityManager.getTransaction().begin();
            repository.create(match);
            clubRepository.update(homeClub.get());
            clubRepository.update(awayClub.get());
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    private void setClubs(Club homeClub, Club awayClub, int homeClubGoals, int awayClubGoals) {
        if (homeClubGoals > awayClubGoals) {
            homeClub.addWin();
            homeClub.addScore(3);

            awayClub.addLose();
        } else if (homeClubGoals < awayClubGoals) {
            homeClub.addLose();

            awayClub.addWin();
            awayClub.addScore(3);
        } else {
            homeClub.addDraw();
            homeClub.addScore(1);

            awayClub.addDraw();
            awayClub.addScore(1);
        }
        homeClub.addGoalFor(homeClubGoals);
        homeClub.addGoalAgainst(awayClubGoals);
        awayClub.addGoalFor(awayClubGoals);
        awayClub.addGoalAgainst(homeClubGoals);
    }
    @Override
    public List<Match> getDerbies() {
        return repository.getDerbies();
    }
    public Match getMostGoalsDerby() {
        List<Match> derbyList = repository.getDerbies();
        return derbyList.stream().max(Comparator.comparingInt
                (match -> (match.getAwayClubGoals() + match.getHomeClubGoals()))).get();
    }
}
