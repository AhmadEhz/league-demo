package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.*;
import org.league.repository.ClubRepository;
import org.league.repository.CoachTransferRepository;
import org.league.service.CoachTransferService;
import org.league.util.ApplicationContext;

public class CoachTransferServiceImpl extends BaseServiceImpl<CoachTransfer, Long, CoachTransferRepository> implements CoachTransferService {
    ClubRepository clubRepository = ApplicationContext.getClubRepository();

    public CoachTransferServiceImpl(CoachTransferRepository repository) {
        super(repository);
    }

    public void makeTransfer(Coach coach, Club sourceClub, Club destinationClub, double cost, int contract) {
        CoachTransfer coachTransfer = new CoachTransfer(coach, sourceClub, destinationClub, cost, contract);
        try {
            entityManager.getTransaction().begin();
            repository.create(coachTransfer);
            clubRepository.removeCoach(sourceClub);
            clubRepository.setCoach(destinationClub, coach);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
