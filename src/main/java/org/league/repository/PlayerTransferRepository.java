package org.league.repository;

import org.league.base.repository.BaseRepository;
import org.league.entity.PlayerTransfer;

import java.util.List;

public interface PlayerTransferRepository extends BaseRepository<PlayerTransfer,Long> {
    List<PlayerTransfer> getMostExpensivePlayers();
}
