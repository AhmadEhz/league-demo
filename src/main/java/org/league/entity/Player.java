package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class Player extends BaseEntity {
    private String name;
    @ManyToOne
    private Club club;
    private BigDecimal salary;
    private int age;
}
