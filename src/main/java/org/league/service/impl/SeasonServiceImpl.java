package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Season;
import org.league.repository.SeasonRepository;
import org.league.service.SeasonService;

public class SeasonServiceImpl extends BaseServiceImpl<Season,Long, SeasonRepository>
        implements SeasonService {
    public SeasonServiceImpl(SeasonRepository repository) {
        super(repository);
    }
}
