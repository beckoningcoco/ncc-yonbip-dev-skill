/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api;

import com.yonyoucloud.upc.service.api.RefConditonDTO;

public class RefDataDTO {
    private String dataType;
    private String refCode;
    private RefConditonDTO refConditonDTO;

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    public void setRefConditonDTO(RefConditonDTO refConditonDTO) {
        this.refConditonDTO = refConditonDTO;
    }

    public String getDataType() {
        return this.dataType;
    }

    public String getRefCode() {
        return this.refCode;
    }

    public RefConditonDTO getRefConditonDTO() {
        return this.refConditonDTO;
    }

    public String toString() {
        return "RefDataDTO(dataType=" + this.getDataType() + ", refCode=" + this.getRefCode() + ", refConditonDTO=" + this.getRefConditonDTO() + ")";
    }
}

