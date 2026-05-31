/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api.dto;

import com.yonyoucloud.upc.service.api.dto.UserDefBaseDto;

public class UserDefBaseCountDetail
extends UserDefBaseDto {
    private Integer count;
    private Integer stringCount = 0;
    private Integer archiveCount = 0;
    private Integer doubleCount = 0;
    private Integer referArchiveCount = 0;
    private Integer custArchiveCount = 0;
    private Integer integerCount = 0;
    private Integer dateCount = 0;
    private Integer timeCount = 0;
    private Integer dateTimeCount = 0;
    private String tenantName;

    public void setCountByType(String type, Integer count) {
        switch (type) {
            case "String": {
                this.setStringCount(count);
            }
            case "Archive": {
                this.setArchiveCount(count);
            }
            case "Double": {
                this.setDoubleCount(count);
            }
            case "ReferArchive": {
                this.setReferArchiveCount(count);
            }
            case "CustArchive": {
                this.setCustArchiveCount(count);
            }
            case "Integer": {
                this.setIntegerCount(count);
            }
            case "Date": {
                this.setDateCount(count);
            }
            case "Time": {
                this.setTimeCount(count);
            }
            case "DateTime": {
                this.setDateTimeCount(count);
            }
        }
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setStringCount(Integer stringCount) {
        this.stringCount = stringCount;
    }

    public void setArchiveCount(Integer archiveCount) {
        this.archiveCount = archiveCount;
    }

    public void setDoubleCount(Integer doubleCount) {
        this.doubleCount = doubleCount;
    }

    public void setReferArchiveCount(Integer referArchiveCount) {
        this.referArchiveCount = referArchiveCount;
    }

    public void setCustArchiveCount(Integer custArchiveCount) {
        this.custArchiveCount = custArchiveCount;
    }

    public void setIntegerCount(Integer integerCount) {
        this.integerCount = integerCount;
    }

    public void setDateCount(Integer dateCount) {
        this.dateCount = dateCount;
    }

    public void setTimeCount(Integer timeCount) {
        this.timeCount = timeCount;
    }

    public void setDateTimeCount(Integer dateTimeCount) {
        this.dateTimeCount = dateTimeCount;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public Integer getCount() {
        return this.count;
    }

    public Integer getStringCount() {
        return this.stringCount;
    }

    public Integer getArchiveCount() {
        return this.archiveCount;
    }

    public Integer getDoubleCount() {
        return this.doubleCount;
    }

    public Integer getReferArchiveCount() {
        return this.referArchiveCount;
    }

    public Integer getCustArchiveCount() {
        return this.custArchiveCount;
    }

    public Integer getIntegerCount() {
        return this.integerCount;
    }

    public Integer getDateCount() {
        return this.dateCount;
    }

    public Integer getTimeCount() {
        return this.timeCount;
    }

    public Integer getDateTimeCount() {
        return this.dateTimeCount;
    }

    public String getTenantName() {
        return this.tenantName;
    }
}

