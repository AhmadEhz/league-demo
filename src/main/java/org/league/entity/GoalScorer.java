package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class GoalScorer extends BaseEntity {
    @OneToOne
    private Player player;
    @ManyToOne
    private Match match;
    private int goals;
}
