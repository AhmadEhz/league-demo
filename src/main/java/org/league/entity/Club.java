package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Club extends BaseEntity {
    private String name;
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
    @OneToMany(mappedBy = "club")
    private Set<Player> players;
}
