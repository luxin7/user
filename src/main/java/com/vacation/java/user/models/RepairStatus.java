package com.vacation.java.user.models;

import javax.persistence.*;

/**
 * Created by luxin on 2016/7/17.
 */
@Entity
@Table(name="fx_RepairStatus")
public class RepairStatus {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int no;
    private String status;

    public int getNo() {
        return no;
    }
    public String getStatus() {
        return status;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
