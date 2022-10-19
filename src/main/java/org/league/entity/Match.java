package org.league.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Match extends BaseEntity {
    @ManyToOne
    private Club homeClub;
    private int homeClubGoals;
    @ManyToOne
    private Club awayClub;
    private int awayClubGoals;
    @OneToMany
    private Set<Player> homeClubPlayers;
    @OneToMany
    private Set<Player> awayClubPlayers;
    @CreationTimestamp
    private LocalDate date;

    public Match() {
    }

    public Match(Club homeClub, int homeClubGoals, Club awayClub, int awayClubGoals) {
        this.homeClub = homeClub;
        this.homeClubGoals = homeClubGoals;
        this.awayClub = awayClub;
        this.awayClubGoals = awayClubGoals;
    }

    public Club getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(Club homeClub) {
        this.homeClub = homeClub;
    }

    public int getHomeClubGoals() {
        return homeClubGoals;
    }

    public void setHomeClubGoals(int homeClubGoals) {
        this.homeClubGoals = homeClubGoals;
    }

    public Club getAwayClub() {
        return awayClub;
    }

    public void setAwayClub(Club awayClub) {
        this.awayClub = awayClub;
    }

    public int getAwayClubGoals() {
        return awayClubGoals;
    }

    public void setAwayClubGoals(int awayClubGoals) {
        this.awayClubGoals = awayClubGoals;
    }

    public Set<Player> getHomeClubPlayers() {
        return homeClubPlayers;
    }

    public void setHomeClubPlayers(Set<Player> homeClubPlayers) {
        this.homeClubPlayers = homeClubPlayers;
    }

    public Set<Player> getAwayClubPlayers() {
        return awayClubPlayers;
    }

    public void setAwayClubPlayers(Set<Player> awayClubPlayers) {
        this.awayClubPlayers = awayClubPlayers;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
