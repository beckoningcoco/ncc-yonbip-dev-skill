/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api.dto;

import com.yonyoucloud.upc.service.api.dto.UserDefBaseDto;

public class ArchiveDefPreCheck
extends UserDefBaseDto {
    private String enumValueLackCheck;
    private String formatCheck;
    private String lackDataCheck;
    private String repeatDataCheck;
    private String errMsg;

    public void setEnumValueLackCheck(String enumValueLackCheck) {
        this.enumValueLackCheck = enumValueLackCheck;
    }

    public void setFormatCheck(String formatCheck) {
        this.formatCheck = formatCheck;
    }

    public void setLackDataCheck(String lackDataCheck) {
        this.lackDataCheck = lackDataCheck;
    }

    public void setRepeatDataCheck(String repeatDataCheck) {
        this.repeatDataCheck = repeatDataCheck;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getEnumValueLackCheck() {
        return this.enumValueLackCheck;
    }

    public String getFormatCheck() {
        return this.formatCheck;
    }

    public String getLackDataCheck() {
        return this.lackDataCheck;
    }

    public String getRepeatDataCheck() {
        return this.repeatDataCheck;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}

