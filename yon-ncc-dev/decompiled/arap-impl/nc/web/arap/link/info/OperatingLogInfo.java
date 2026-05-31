/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.fip.operatinglogs.OperatingLogVO
 */
package nc.web.arap.link.info;

import nc.vo.fip.operatinglogs.OperatingLogVO;

public class OperatingLogInfo
extends OperatingLogVO {
    private static final long serialVersionUID = 1L;
    private String scence;
    private String pk_bill;
    private String billType;

    public String getScence() {
        return this.scence;
    }

    public void setScence(String scence) {
        this.scence = scence;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String pk_bill) {
        this.pk_bill = pk_bill;
    }

    public String getBillType() {
        return this.billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
}

