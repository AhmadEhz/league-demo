package org.league.repository.impl;

import org.league.base.repository.BaseRepositoryImpl;
import org.league.entity.PlayerTransfer;
import org.league.repository.PlayerTransferRepository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerTransferRepositoryImpl extends BaseRepositoryImpl<PlayerTransfer, Long> implements PlayerTransferRepository {
    public PlayerTransferRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<PlayerTransfer> getEntityClass() {
        return PlayerTransfer.class;
    }

    @Override
    public List<PlayerTransfer> getMostExpensivePlayers() {
        List<PlayerTransfer> playerList = new ArrayList<>();
        Map<Integer, List<PlayerTransfer>> players = entityManager.createQuery("""
                        select PlayerTransfer from PlayerTransfer order by price desc""", PlayerTransfer.class)
                .getResultStream().collect(Collectors.groupingBy((player) -> player.getDate().getYear()));
        for (List<PlayerTransfer> list : players.values()) {
            playerList.add(list.get(0));
        }
        return playerList;
    }
}
