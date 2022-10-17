package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Coach;
import org.league.repository.CoachRepository;
import org.league.service.CoachService;

public class CoachServiceImpl extends BaseServiceImpl<Coach,Long, CoachRepository>
        implements CoachService {
    public CoachServiceImpl(CoachRepository repository) {
        super(repository);
    }
}
