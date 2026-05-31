/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ResultList
 */
package com.yonyoucloud.upc.service.operationalTools;

import com.yonyou.ucf.mdd.common.model.ResultList;

public class DeleteToolDto {
    String targetYTenantId;
    String targetTenantName;
    String sourceTenantId;
    String sourceYTenantId;
    String sourceUserName;
    String sourceUserId;
    String batchDealCode;
    String rootFullName;
    String billName;
    String analyzeKey;
    String domain;
    String asyncKey;
    StringBuilder SQLForOneRecord;
    private int expireTime;
    ResultList resultList = new ResultList();

    public String getTargetYTenantId() {
        return this.targetYTenantId;
    }

    public String getTargetTenantName() {
        return this.targetTenantName;
    }

    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

    public String getSourceYTenantId() {
        return this.sourceYTenantId;
    }

    public String getSourceUserName() {
        return this.sourceUserName;
    }

    public String getSourceUserId() {
        return this.sourceUserId;
    }

    public String getBatchDealCode() {
        return this.batchDealCode;
    }

    public String getRootFullName() {
        return this.rootFullName;
    }

    public String getBillName() {
        return this.billName;
    }

    public String getAnalyzeKey() {
        return this.analyzeKey;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getAsyncKey() {
        return this.asyncKey;
    }

    public StringBuilder getSQLForOneRecord() {
        return this.SQLForOneRecord;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public ResultList getResultList() {
        return this.resultList;
    }

    public void setTargetYTenantId(String targetYTenantId) {
        this.targetYTenantId = targetYTenantId;
    }

    public void setTargetTenantName(String targetTenantName) {
        this.targetTenantName = targetTenantName;
    }

    public void setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
    }

    public void setSourceYTenantId(String sourceYTenantId) {
        this.sourceYTenantId = sourceYTenantId;
    }

    public void setSourceUserName(String sourceUserName) {
        this.sourceUserName = sourceUserName;
    }

    public void setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
    }

    public void setBatchDealCode(String batchDealCode) {
        this.batchDealCode = batchDealCode;
    }

    public void setRootFullName(String rootFullName) {
        this.rootFullName = rootFullName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public void setAnalyzeKey(String analyzeKey) {
        this.analyzeKey = analyzeKey;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setAsyncKey(String asyncKey) {
        this.asyncKey = asyncKey;
    }

    public void setSQLForOneRecord(StringBuilder SQLForOneRecord) {
        this.SQLForOneRecord = SQLForOneRecord;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public void setResultList(ResultList resultList) {
        this.resultList = resultList;
    }
}

