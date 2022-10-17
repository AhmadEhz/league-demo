package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Match;
import org.league.repository.MatchRepository;
import org.league.service.MatchService;

public class MatchServiceImpl extends BaseServiceImpl<Match, Long, MatchRepository>
        implements MatchService {
    public MatchServiceImpl(MatchRepository repository) {
        super(repository);
    }
}
