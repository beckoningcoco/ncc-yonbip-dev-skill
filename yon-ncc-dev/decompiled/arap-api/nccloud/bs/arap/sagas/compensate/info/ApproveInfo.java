/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 */
package nccloud.bs.arap.sagas.compensate.info;

import java.io.Serializable;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;

public class ApproveInfo
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String primaryKey;
    private Integer billstatus;
    private String approver;
    private Integer approvestatus;
    private String approvenote;
    private UFDateTime approvedate;
    private String officialprintuser;
    private UFDate officialprintdate;

    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Integer getBillstatus() {
        return this.billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public String getApprover() {
        return this.approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Integer getApprovestatus() {
        return this.approvestatus;
    }

    public void setApprovestatus(Integer approvestatus) {
        this.approvestatus = approvestatus;
    }

    public String getApprovenote() {
        return this.approvenote;
    }

    public void setApprovenote(String approvenote) {
        this.approvenote = approvenote;
    }

    public UFDateTime getApprovedate() {
        return this.approvedate;
    }

    public void setApprovedate(UFDateTime approvedate) {
        this.approvedate = approvedate;
    }

    public String getOfficialprintuser() {
        return this.officialprintuser;
    }

    public void setOfficialprintuser(String officialprintuser) {
        this.officialprintuser = officialprintuser;
    }

    public UFDate getOfficialprintdate() {
        return this.officialprintdate;
    }

    public void setOfficialprintdate(UFDate officialprintdate) {
        this.officialprintdate = officialprintdate;
    }
}

