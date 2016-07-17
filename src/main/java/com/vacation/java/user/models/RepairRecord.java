package com.vacation.java.user.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by luxin on 2016/7/17.
 */
@Entity
@Table(name="fx_RepairRecord")
public class RepairRecord {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String repairpersonnel;
    private String inspectionrecord;
    private String repairrecord;
    private Date repairinspectiontime;
    private String workload;
    private String device;
    private String status;

    public int getId() {
        return id;
    }

    public String getRepairpersonnel() {
        return repairpersonnel;
    }

    public String getInspectionrecord() {
        return inspectionrecord;
    }

    public String getRepairrecord() {
        return repairrecord;
    }

    public Date getRepairinspectiontime() {
        return repairinspectiontime;
    }

    public String getWorkload() {
        return workload;
    }

    public String getDevice() {
        return device;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRepairpersonnel(String repairpersonnel) {
        this.repairpersonnel = repairpersonnel;
    }

    public void setInspectionrecord(String inspectionrecord) {
        this.inspectionrecord = inspectionrecord;
    }

    public void setRepairrecord(String repairrecord) {
        this.repairrecord = repairrecord;
    }

    public void setRepairinspectiontime(Date repairinspectiontime) {
        this.repairinspectiontime = repairinspectiontime;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
