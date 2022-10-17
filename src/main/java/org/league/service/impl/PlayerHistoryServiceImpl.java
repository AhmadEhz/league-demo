package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.PlayerHistory;
import org.league.repository.PlayerHistoryRepository;
import org.league.service.PlayerHistoryService;

public class PlayerHistoryServiceImpl extends BaseServiceImpl<PlayerHistory, Long, PlayerHistoryRepository>
        implements PlayerHistoryService {
    public PlayerHistoryServiceImpl(PlayerHistoryRepository repository) {
        super(repository);
    }
}
