package org.league.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class PlayerTransfer extends BaseEntity {
    @ManyToOne
    private Player player;
    @ManyToOne
    private Club sourceClub;
    @ManyToOne
    private Club destinationClub;
    private BigDecimal price;
    private int contract;
    @CreationTimestamp
    private LocalDate date;

    public PlayerTransfer() {
    }

    public PlayerTransfer(Player player, Club sourceClub, Club destinationClub, BigDecimal price, int contract) {
        this.player = player;
        this.sourceClub = sourceClub;
        this.destinationClub = destinationClub;
        this.price = price;
        this.contract = contract;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Club getSourceClub() {
        return sourceClub;
    }

    public void setSourceClub(Club sourceClub) {
        this.sourceClub = sourceClub;
    }

    public Club getDestinationClub() {
        return destinationClub;
    }

    public void setDestinationClub(Club destinationClub) {
        this.destinationClub = destinationClub;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
