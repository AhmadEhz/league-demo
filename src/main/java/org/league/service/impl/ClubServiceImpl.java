package org.league.service.impl;

import org.league.base.service.BaseServiceImpl;
import org.league.entity.Club;
import org.league.repository.ClubRepository;
import org.league.service.ClubService;

public class ClubServiceImpl extends BaseServiceImpl<Club,Long, ClubRepository>
        implements ClubService {
    public ClubServiceImpl(ClubRepository repository) {
        super(repository);
    }
}
