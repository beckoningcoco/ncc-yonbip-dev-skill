/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.dap;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class RetBillVo
extends ValueObject {
    private static final long serialVersionUID = 1L;
    protected String billType = null;
    protected String billId = null;
    protected String billNo = null;

    public String getBillId() {
        return this.billId;
    }

    public String getBillNo() {
        return this.billNo;
    }

    public String getBillType() {
        return this.billType;
    }

    public String getEntityName() {
        return null;
    }

    public void setBillId(String newBillId) {
        this.billId = newBillId;
    }

    public void setBillNo(String newBillNo) {
        this.billNo = newBillNo;
    }

    public void setBillType(String newBillType) {
        this.billType = newBillType;
    }

    public void validate() throws ValidationException {
    }
}

