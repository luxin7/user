package com.vacation.java.user.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by luxin on 2016/7/17.
 */
@Entity
@Table(name="fx_ClosingCost")
public class ClosingCost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11)
    private int id;
    @Column(length = 11)
    private int number;
    @Column(length=11)
    private double repaircost;
    @Column(length=11)
    private double materialcost;
    private String promise;
    private String attention;
    private Date date;

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public double getRepaircost() {
        return repaircost;
    }

    public double getMaterialcost() {
        return materialcost;
    }

    public String getPromise() {
        return promise;
    }

    public String getAttention() {
        return attention;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRepaircost(double repaircost) {
        this.repaircost = repaircost;
    }

    public void setMaterialcost(double materialcost) {
        this.materialcost = materialcost;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
