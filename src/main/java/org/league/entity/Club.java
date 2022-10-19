package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getGoalFor() {
        return goalFor;
    }

    public void setGoalFor(int goalFor) {
        this.goalFor = goalFor;
    }

    public void addGoalFor(int goal) {
        goalFor += goal;
    }

    public int getGoalAgainst() {
        return goalAgainst;
    }

    public void setGoalAgainst(int goalAgainst) {
        this.goalAgainst = goalAgainst;
    }

    public void addGoalAgainst(int goal) {
        goalAgainst += goal;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void addWin() {
        win++;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void addDraw() {
        draw++;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void addLose() {
        lose++;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public Set<Player> getPlayers() {
        if (players == null)
            players = new HashSet<>();
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        if (players == null)
            players = new HashSet<>();
        players.add(player);
    }

    public void removePlayer(Player player) {
        if (players == null)
            players = new HashSet<>();
        players.remove(player);
    }
}
