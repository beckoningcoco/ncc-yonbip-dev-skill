/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 */
package nc.vo.arap.pub;

import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;

public class TransferInfo {
    private String key;
    private UFDate date;
    private String pk_ratetype;
    private String pk_org;
    private String pk_curr;
    private UFDouble rate;
    private UFLiteralDate ratedate;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UFDate getDate() {
        return this.date;
    }

    public void setDate(UFDate date) {
        this.date = date;
    }

    public String getPk_ratetype() {
        return this.pk_ratetype;
    }

    public void setPk_ratetype(String pk_ratetype) {
        this.pk_ratetype = pk_ratetype;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public String getPk_curr() {
        return this.pk_curr;
    }

    public void setPk_curr(String pk_curr) {
        this.pk_curr = pk_curr;
    }

    public UFDouble getRate() {
        return this.rate;
    }

    public void setRate(UFDouble rate) {
        this.rate = rate;
    }

    public UFLiteralDate getRatedate() {
        return this.ratedate;
    }

    public void setRatedate(UFLiteralDate ratedate) {
        this.ratedate = ratedate;
    }
}

