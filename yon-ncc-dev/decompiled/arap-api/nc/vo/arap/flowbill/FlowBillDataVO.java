/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.flowbill;

import java.io.Serializable;
import nc.vo.pub.lang.UFDouble;

public class FlowBillDataVO
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String billtype;
    private String pk_bill;
    private String pk_billitem;
    private String pk_termitem;
    private UFDouble mnychanged;

    public String getPk_termitem() {
        return this.pk_termitem;
    }

    public void setPk_termitem(String pk_termitem) {
        this.pk_termitem = pk_termitem;
    }

    public String getBilltype() {
        return this.billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String pkBill) {
        this.pk_bill = pkBill;
    }

    public String getPk_billitem() {
        return this.pk_billitem;
    }

    public void setPk_billitem(String pkBillitem) {
        this.pk_billitem = pkBillitem;
    }

    public UFDouble getMnychanged() {
        return this.mnychanged;
    }

    public void setMnychanged(UFDouble mnychanged) {
        this.mnychanged = mnychanged;
    }
}

