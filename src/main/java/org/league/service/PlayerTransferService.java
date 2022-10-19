package org.league.service;

import org.league.base.service.BaseService;
import org.league.entity.Club;
import org.league.entity.Player;
import org.league.entity.PlayerTransfer;
import org.league.repository.PlayerTransferRepository;

public interface PlayerTransferService extends BaseService<PlayerTransfer,Long, PlayerTransferRepository> {
    void makeTransfer(Player player, Club sourceClub, Club destinationClub, double cost, int contract);
}
