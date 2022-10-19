package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Club;
import org.league.entity.Player;
import org.league.entity.PlayerTransfer;
import org.league.repository.ClubRepository;
import org.league.repository.PlayerTransferRepository;
import org.league.service.PlayerTransferService;
import org.league.util.ApplicationContext;

import java.math.BigDecimal;

public class PlayerTransferServiceImpl extends BaseServiceImpl<PlayerTransfer, Long, PlayerTransferRepository>
        implements PlayerTransferService {
    ClubRepository clubRepository = ApplicationContext.getClubRepository();

    public PlayerTransferServiceImpl(PlayerTransferRepository repository) {
        super(repository);
    }

    @Override
    public void makeTransfer(Player player, Club sourceClub, Club destinationClub, double cost, int contract) {
        PlayerTransfer playerTransfer = new PlayerTransfer(player, sourceClub, destinationClub
                , BigDecimal.valueOf(cost), contract);
        sourceClub.removePlayer(player);
        destinationClub.addPlayer(player);
        try {
            entityManager.getTransaction().begin();
            repository.create(playerTransfer);
            clubRepository.update(sourceClub);
            clubRepository.update(destinationClub);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
