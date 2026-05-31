/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.enums;

public enum BillNumAndActionEnum {
    PRODUCT_SAVE("pc_product", "save");

    private String billNum;
    private String action;

    private BillNumAndActionEnum(String billNum, String action) {
        this.billNum = billNum;
        this.action = action;
    }

    public String getBillNum() {
        return this.billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

