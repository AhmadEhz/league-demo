package org.league.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class CoachTransfer extends BaseEntity {
    @ManyToOne
    private Coach coach;
    @ManyToOne
    private Club sourceClub;
    @ManyToOne
    private Club destinationClub;
    private BigDecimal price;
    private int contract;
    @CreationTimestamp
    private LocalDate date;
    public CoachTransfer () {}

    public CoachTransfer(Coach coach, Club sourceClub, Club destinationClub, double price, int contract) {
        this.coach = coach;
        this.sourceClub = sourceClub;
        this.destinationClub = destinationClub;
        this.price = BigDecimal.valueOf(price);
        this.contract = contract;
    }
}
