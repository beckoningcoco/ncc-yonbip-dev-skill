/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.bill;

public class BillFieldUpdateInfoDTO {
    private String fieldCode;
    private String referenceCode;
    private Object beforeValue;
    private Object afterValue;

    public BillFieldUpdateInfoDTO() {
    }

    public BillFieldUpdateInfoDTO(String fieldCode, String referenceCode, Object beforeValue, Object afterValue) {
        this.fieldCode = fieldCode;
        this.referenceCode = referenceCode;
        this.beforeValue = beforeValue;
        this.afterValue = afterValue;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public void setBeforeValue(Object beforeValue) {
        this.beforeValue = beforeValue;
    }

    public void setAfterValue(Object afterValue) {
        this.afterValue = afterValue;
    }

    public String getFieldCode() {
        return this.fieldCode;
    }

    public String getReferenceCode() {
        return this.referenceCode;
    }

    public Object getBeforeValue() {
        return this.beforeValue;
    }

    public Object getAfterValue() {
        return this.afterValue;
    }
}

