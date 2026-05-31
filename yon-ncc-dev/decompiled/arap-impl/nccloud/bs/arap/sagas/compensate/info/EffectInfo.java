/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 */
package nccloud.bs.arap.sagas.compensate.info;

import java.io.Serializable;
import java.util.Map;
import nc.vo.pub.lang.UFDate;

public class EffectInfo
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String primaryKey;
    private Integer billstatus;
    private Integer effectstatus;
    private UFDate effectdate;
    private String effectuser;
    private UFDate signdate;
    private String signuser;
    private Integer settleflag;
    private Map<String, Integer> bodyspayflag;
    private Integer approvestatus;
    private Map<String, Integer> bodyscommpaytype;
    private Map<String, Integer> bodyscommpaystatus;
    private String payman;
    private UFDate paydate;
    private String signyear;
    private String signperiod;

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

    public Integer getEffectstatus() {
        return this.effectstatus;
    }

    public void setEffectstatus(Integer effectstatus) {
        this.effectstatus = effectstatus;
    }

    public UFDate getEffectdate() {
        return this.effectdate;
    }

    public void setEffectdate(UFDate effectdate) {
        this.effectdate = effectdate;
    }

    public String getEffectuser() {
        return this.effectuser;
    }

    public void setEffectuser(String effectuser) {
        this.effectuser = effectuser;
    }

    public UFDate getSigndate() {
        return this.signdate;
    }

    public void setSigndate(UFDate signdate) {
        this.signdate = signdate;
    }

    public String getSignuser() {
        return this.signuser;
    }

    public void setSignuser(String signuser) {
        this.signuser = signuser;
    }

    public Integer getSettleflag() {
        return this.settleflag;
    }

    public void setSettleflag(Integer settleflag) {
        this.settleflag = settleflag;
    }

    public Map<String, Integer> getBodyspayflag() {
        return this.bodyspayflag;
    }

    public void setBodyspayflag(Map<String, Integer> bodyspayflag) {
        this.bodyspayflag = bodyspayflag;
    }

    public Integer getApprovestatus() {
        return this.approvestatus;
    }

    public void setApprovestatus(Integer approvestatus) {
        this.approvestatus = approvestatus;
    }

    public Map<String, Integer> getBodyscommpaytype() {
        return this.bodyscommpaytype;
    }

    public void setBodyscommpaytype(Map<String, Integer> bodyscommpaytype) {
        this.bodyscommpaytype = bodyscommpaytype;
    }

    public Map<String, Integer> getBodyscommpaystatus() {
        return this.bodyscommpaystatus;
    }

    public void setBodyscommpaystatus(Map<String, Integer> bodyscommpaystatus) {
        this.bodyscommpaystatus = bodyscommpaystatus;
    }

    public String getPayman() {
        return this.payman;
    }

    public void setPayman(String payman) {
        this.payman = payman;
    }

    public UFDate getPaydate() {
        return this.paydate;
    }

    public void setPaydate(UFDate paydate) {
        this.paydate = paydate;
    }

    public String getSignyear() {
        return this.signyear;
    }

    public void setSignyear(String signyear) {
        this.signyear = signyear;
    }

    public String getSignperiod() {
        return this.signperiod;
    }

    public void setSignperiod(String signperiod) {
        this.signperiod = signperiod;
    }
}

