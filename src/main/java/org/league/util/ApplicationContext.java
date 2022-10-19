package org.league.util;

import org.league.repository.*;
import org.league.repository.impl.*;
import org.league.service.*;
import org.league.service.impl.*;

public class ApplicationContext {
    private  static final ClubRepository clubRepository =
            new ClubRepositoryImpl(HibernateUtil.createEntityManager());
    private  static final CoachRepository coachRepository =
            new CoachRepositoryImpl(HibernateUtil.createEntityManager());
    private  static final CoachTransferRepository coachTransferRepository =
          new CoachTransferRepositoryImpl(HibernateUtil.createEntityManager());
    private  static final MatchRepository matchRepository =
            new MatchRepositoryImpl(HibernateUtil.createEntityManager());
    private  static final PlayerRepository playerRepository =
            new PlayerRepositoryImpl(HibernateUtil.createEntityManager());
    private  static final PlayerTransferRepository playerTransferRepository =
         new PlayerTransferRepositoryImpl(HibernateUtil.createEntityManager());
    private  static final SeasonRepository seasonRepository =
            new SeasonRepositoryImpl(HibernateUtil.createEntityManager());

    private static final ClubService clubService =
            new ClubServiceImpl(clubRepository);
    private static   final CoachService coachService =
            new CoachServiceImpl(coachRepository);
    private  static final CoachTransferService coachTransferService =
            new CoachTransferServiceImpl(coachTransferRepository);
    private  static final MatchService matchService =
            new MatchServiceImpl(matchRepository);
    private  static final PlayerService playerService =
            new PlayerServiceImpl(playerRepository);
    private static final PlayerTransferService playerTransferService =
            new PlayerTransferServiceImpl(playerTransferRepository);
    private static final SeasonService seasonService =
            new SeasonServiceImpl(seasonRepository);

    public static ClubRepository getClubRepository() {
        return clubRepository;
    }

    public static CoachRepository getCoachRepository() {
        return coachRepository;
    }

    public static CoachTransferRepository getCoachTransferRepository() {
        return coachTransferRepository;
    }

    public static MatchRepository getMatchRepository() {
        return matchRepository;
    }

    public static PlayerRepository getPlayerRepository() {
        return playerRepository;
    }

    public static PlayerTransferRepository getPlayerTransferRepository() {
        return playerTransferRepository;
    }

    public static SeasonRepository getSeasonRepository() {
        return seasonRepository;
    }

    public static ClubService getClubService() {
        return clubService;
    }

    public static CoachService getCoachService() {
        return coachService;
    }

    public static CoachTransferService getCoachTransferService() {
        return coachTransferService;
    }

    public static MatchService getMatchService() {
        return matchService;
    }

    public static PlayerService getPlayerService() {
        return playerService;
    }

    public static PlayerTransferService getPlayerTransferService() {
        return playerTransferService;
    }

    public static SeasonService getSeasonService() {
        return seasonService;
    }
}
