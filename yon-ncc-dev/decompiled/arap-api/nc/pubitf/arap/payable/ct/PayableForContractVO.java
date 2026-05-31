/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.payable.ct;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;

public class PayableForContractVO
extends SuperVO {
    private static final long serialVersionUID = -2927385323937600217L;
    private UFDouble money;
    private String contractNo;
    private UFDouble verifyMoney;
    private String pk_currency;

    public UFDouble getMoney() {
        return this.money;
    }

    public void setMoney(UFDouble money) {
        this.money = money;
    }

    public UFDouble getVerifyMoney() {
        return this.verifyMoney;
    }

    public void setVerifyMoney(UFDouble verifyMoney) {
        this.verifyMoney = verifyMoney;
    }

    public String getPk_currency() {
        return this.pk_currency;
    }

    public void setPk_currency(String pkCurrency) {
        this.pk_currency = pkCurrency;
    }

    public String getContractNo() {
        return this.contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }
}

