package org.league.service;

import org.league.base.service.BaseService;
import org.league.entity.Coach;
import org.league.repository.CoachRepository;

import java.util.List;

public interface CoachService extends BaseService<Coach,Long, CoachRepository> {
    List<Coach> getCoachList();
}
