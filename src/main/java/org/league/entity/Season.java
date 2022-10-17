package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Season extends BaseEntity {
    private int year;
    @ManyToOne
    private Club club;
    private int score;
    private int goalFor;
    private int goalAgainst;
    private int win;
    private int draw;
    private int lose;
    @OneToOne(mappedBy = "club")
    private Coach coach;
    private String city;
    private String stadium;
}
