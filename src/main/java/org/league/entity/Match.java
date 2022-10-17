package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Match extends BaseEntity {
    private int year;
    @ManyToOne
    private Club homeClub;
    private int homeClubGoals;
    @ManyToOne
    private Club awayClub;
    private int awayClubGoals;
}
