/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.arap.pub;

import java.io.Serializable;
import nc.vo.pub.lang.UFDate;

public class RateTypeInfoVO
implements Serializable {
    private static final long serialVersionUID = -5039331730754798103L;
    private String pk_org;
    private String src_pk_currtype;
    private String pk_billtype;
    private UFDate billdate;
    private String customer;
    private String supplier;
    private String itemPk;
    private String billPk;
    private String editKey;
    private String pk_rateType;

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public String getSrc_pk_currtype() {
        return this.src_pk_currtype;
    }

    public void setSrc_pk_currtype(String src_pk_currtype) {
        this.src_pk_currtype = src_pk_currtype;
    }

    public String getPk_billtype() {
        return this.pk_billtype;
    }

    public void setPk_billtype(String pk_billtype) {
        this.pk_billtype = pk_billtype;
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

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getItemPk() {
        return this.itemPk;
    }

    public void setItemPk(String itemPk) {
        this.itemPk = itemPk;
    }

    public String getBillPk() {
        return this.billPk;
    }

    public void setBillPk(String billPk) {
        this.billPk = billPk;
    }

    public String getEditKey() {
        return this.editKey;
    }

    public void setEditKey(String editKey) {
        this.editKey = editKey;
    }

    public String getPk_rateType() {
        return this.pk_rateType;
    }

    public void setPk_rateType(String pk_rateType) {
        this.pk_rateType = pk_rateType;
    }
}

