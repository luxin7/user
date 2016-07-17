package com.vacation.java.user.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by luxin on 2016/7/17.
 */
@Entity
@Table(name="fx_LoginRecord")
public class LoginRecord {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int loginid;
    private int no;
    private String role;
    private Date time;

    public int getLoginid() {
        return loginid;
    }

    public int getNo() {
        return no;
    }

    public String getRole() {
        return role;
    }

    public Date getTime() {
        return time;
    }

    public void setLoginid(int loginid) {
        this.loginid = loginid;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
