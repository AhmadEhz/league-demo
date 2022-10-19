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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public double getSalary() {
        return salary.doubleValue();
    }

    public void setSalary(double salary) {
        this.salary = BigDecimal.valueOf(salary);
    }
}
