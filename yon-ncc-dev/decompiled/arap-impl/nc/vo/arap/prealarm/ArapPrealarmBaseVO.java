/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BeanHelper
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.prealarm;

import nc.vo.pub.BeanHelper;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFDouble;

public abstract class ArapPrealarmBaseVO
extends CircularlyAccessibleValueObject {
    private static final long serialVersionUID = 3765656440421070100L;
    private String dept = null;
    private String psndoc = null;
    private String billno = null;
    private String billdate = null;
    private String brief = null;
    private String currency = null;
    private String invoceno = null;
    private UFDouble money = null;
    private String pk_orgs = null;
    private String billtype = null;
    private UFDouble localmoney = null;
    private UFDouble moneybal = null;
    private UFDouble localmoneybal = null;

    public String[] getAttributeNames() {
        return BeanHelper.getPropertys((Object)((Object)this)).toArray(new String[0]);
    }

    public Object getAttributeValue(String name) {
        return BeanHelper.getProperty((Object)((Object)this), (String)name);
    }

    public void setAttributeValue(String name, Object value) {
        BeanHelper.setProperty((Object)((Object)this), (String)name, (Object)value);
    }

    public String getEntityName() {
        return null;
    }

    public void validate() throws ValidationException {
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPsndoc() {
        return this.psndoc;
    }

    public void setPsndoc(String psndoc) {
        this.psndoc = psndoc;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getBilldate() {
        return this.billdate;
    }

    public void setBilldate(String billdate) {
        this.billdate = billdate;
    }

    public String getBrief() {
        return this.brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getInvoceno() {
        return this.invoceno;
    }

    public void setInvoceno(String invoceno) {
        this.invoceno = invoceno;
    }

    public UFDouble getMoney() {
        return this.money;
    }

    public void setMoney(UFDouble money) {
        this.money = money;
    }

    public UFDouble getLocalmoney() {
        return this.localmoney;
    }

    public void setLocalmoney(UFDouble localmoney) {
        this.localmoney = localmoney;
    }

    public UFDouble getMoneybal() {
        return this.moneybal;
    }

    public void setMoneybal(UFDouble moneybal) {
        this.moneybal = moneybal;
    }

    public UFDouble getLocalmoneybal() {
        return this.localmoneybal;
    }

    public void setLocalmoneybal(UFDouble localmoneybal) {
        this.localmoneybal = localmoneybal;
    }

    public String getPk_orgs() {
        return this.pk_orgs;
    }

    public void setPk_orgs(String pk_orgs) {
        this.pk_orgs = pk_orgs;
    }

    public String getBilltype() {
        return this.billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }
}

