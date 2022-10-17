package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Transfer extends BaseEntity {
    @ManyToOne
    private Player player;
    @ManyToOne
    private Club sourceClub;
    @ManyToOne
    private Club destinationClub;
    private BigDecimal price;
    private int contract;
    private int year;
}
