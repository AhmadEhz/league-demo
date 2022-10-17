package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class PlayerHistory extends BaseEntity {
    private int year;
    @ManyToOne
    private Player player;
    @ManyToOne
    private Club club;
    private BigDecimal salary;
}
