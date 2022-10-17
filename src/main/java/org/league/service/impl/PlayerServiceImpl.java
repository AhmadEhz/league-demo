package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Player;
import org.league.repository.PlayerRepository;
import org.league.service.PlayerService;

public class PlayerServiceImpl extends BaseServiceImpl<Player,Long, PlayerRepository>
        implements PlayerService {
    public PlayerServiceImpl(PlayerRepository repository) {
        super(repository);
    }
}
