/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.receivable;

import java.util.ArrayList;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class UnSettReceivalbeBillVO
extends SuperVO {
    private static final String PK_SUPCUSM = "pk_supcusm";
    private static final long serialVersionUID = 1L;
    private String billno;
    private UFDate billdate;
    private String customer;
    private String pk_deptid;
    private String pk_psndoc;
    private String pk_subjcode;
    private String pk_balatype;
    private String pk_currtype;
    private UFDouble money_bal;

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate billdate) {
        this.billdate = billdate;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPk_deptid() {
        return this.pk_deptid;
    }

    public void setPk_deptid(String pkDeptid) {
        this.pk_deptid = pkDeptid;
    }

    public String getPk_psndoc() {
        return this.pk_psndoc;
    }

    public void setPk_psndoc(String pkPsndoc) {
        this.pk_psndoc = pkPsndoc;
    }

    public String getPk_subjcode() {
        return this.pk_subjcode;
    }

    public void setPk_subjcode(String pkSubjcode) {
        this.pk_subjcode = pkSubjcode;
    }

    public String getPk_balatype() {
        return this.pk_balatype;
    }

    public void setPk_balatype(String pkBalatype) {
        this.pk_balatype = pkBalatype;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
    }

    public UFDouble getMoney_bal() {
        return this.money_bal;
    }

    public void setMoney_bal(UFDouble moneyBal) {
        this.money_bal = moneyBal;
    }

    public static String getPkSupcusm() {
        return PK_SUPCUSM;
    }

    public String[] getAttributeNames() {
        String[] tempAttrs = super.getAttributeNames();
        int count = tempAttrs.length;
        ArrayList<String> attributeNames = new ArrayList<String>(count - 1);
        for (int i = 0; i < count; ++i) {
            if (tempAttrs[i].equals("primarykey")) continue;
            attributeNames.add(tempAttrs[i]);
        }
        return attributeNames.toArray(new String[0]);
    }
}

