package org.league.entity;

import org.league.base.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
public class Coach extends BaseEntity {
    private String name;
    @OneToOne
    private Club club;
    private BigDecimal salary;
}
