/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.docmerge.model;

import java.util.List;

public class BusinessCheckResult {
    private int totalMicroServiceCount = 0;
    private int sucessMicroServiceCount = 0;
    private int errorMicroServiceCount = 0;
    private List<String> allResultMessages;
    private List<String> errorMessages;

    public int getTotalMicroServiceCount() {
        return this.totalMicroServiceCount;
    }

    public BusinessCheckResult setTotalMicroServiceCount(int totalMicroServiceCount) {
        this.totalMicroServiceCount = totalMicroServiceCount;
        return this;
    }

    public int getSucessMicroServiceCount() {
        return this.sucessMicroServiceCount;
    }

    public BusinessCheckResult setSucessMicroServiceCount(int sucessMicroServiceCount) {
        this.sucessMicroServiceCount = sucessMicroServiceCount;
        return this;
    }

    public int getErrorMicroServiceCount() {
        return this.errorMicroServiceCount;
    }

    public BusinessCheckResult setErrorMicroServiceCount(int errorMicroServiceCount) {
        this.errorMicroServiceCount = errorMicroServiceCount;
        return this;
    }

    public List<String> getAllResultMessages() {
        return this.allResultMessages;
    }

    public BusinessCheckResult setAllResultMessages(List<String> allResultMessages) {
        this.allResultMessages = allResultMessages;
        return this;
    }

    public List<String> getErrorMessages() {
        return this.errorMessages;
    }

    public BusinessCheckResult setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }
}

