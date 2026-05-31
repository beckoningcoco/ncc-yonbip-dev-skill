/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.linkdeal;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class LinkDealVO
extends SuperVO {
    private static final long serialVersionUID = -6935280795997422831L;
    public String billno;
    public String billtype;
    public String billtype_dy;
    public String tradetype;
    public String tradetype_dy;
    public String pk_bill;
    public String pk_item;
    public String billno_dy;
    public String pk_bill_dy;
    public UFDouble money_bal;
    public UFDouble local_money_bal;
    public UFDouble money;
    public UFDouble local_money;
    public UFDouble money_de;
    public UFDouble local_money_de;
    public UFDouble money_cr;
    public UFDouble local_money_cr;
    public UFDouble sum_money_bal;
    public UFDouble sum_local_money_bal;
    public UFDouble sum_money;
    public UFDouble sum_local_money;
    public UFDouble sum_money_de;
    public UFDouble sum_local_money_de;
    public UFDouble sum_money_cr;
    public UFDouble sum_local_money_cr;
    public String scomment;
    public UFDate busidate;
    public String pk_org;
    public String pk_currtype;
    public String pk_dealnum;

    public String getTradetype() {
        return this.tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    public String getTradetype_dy() {
        return this.tradetype_dy;
    }

    public void setTradetype_dy(String tradetypeDy) {
        this.tradetype_dy = tradetypeDy;
    }

    public String getPk_dealnum() {
        return this.pk_dealnum;
    }

    public void setPk_dealnum(String pkDealnum) {
        this.pk_dealnum = pkDealnum;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
    }

    public String getBilltype_dy() {
        return this.billtype_dy;
    }

    public void setBilltype_dy(String billtypeDy) {
        this.billtype_dy = billtypeDy;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
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

    public String getPk_item() {
        return this.pk_item;
    }

    public void setPk_item(String pkItem) {
        this.pk_item = pkItem;
    }

    public String getBillno_dy() {
        return this.billno_dy;
    }

    public void setBillno_dy(String billnoDy) {
        this.billno_dy = billnoDy;
    }

    public String getPk_bill_dy() {
        return this.pk_bill_dy;
    }

    public void setPk_bill_dy(String pkBillDy) {
        this.pk_bill_dy = pkBillDy;
    }

    public UFDouble getMoney_bal() {
        return this.money_bal;
    }

    public void setMoney_bal(UFDouble moneyBal) {
        this.money_bal = moneyBal;
    }

    public UFDouble getLocal_money_bal() {
        return this.local_money_bal;
    }

    public void setLocal_money_bal(UFDouble localMoneyBal) {
        this.local_money_bal = localMoneyBal;
    }

    public UFDouble getMoney() {
        return this.money;
    }

    public void setMoney(UFDouble money) {
        this.money = money;
    }

    public UFDouble getLocal_money() {
        return this.local_money;
    }

    public void setLocal_money(UFDouble localMoney) {
        this.local_money = localMoney;
    }

    public UFDouble getMoney_de() {
        return this.money_de;
    }

    public void setMoney_de(UFDouble moneyDe) {
        this.money_de = moneyDe;
    }

    public UFDouble getLocal_money_de() {
        return this.local_money_de;
    }

    public void setLocal_money_de(UFDouble localMoneyDe) {
        this.local_money_de = localMoneyDe;
    }

    public UFDouble getMoney_cr() {
        return this.money_cr;
    }

    public void setMoney_cr(UFDouble moneyCr) {
        this.money_cr = moneyCr;
    }

    public UFDouble getLocal_money_cr() {
        return this.local_money_cr;
    }

    public void setLocal_money_cr(UFDouble localMoneyCr) {
        this.local_money_cr = localMoneyCr;
    }

    public String getScomment() {
        return this.scomment;
    }

    public void setScomment(String scomment) {
        this.scomment = scomment;
    }

    public UFDate getBusidate() {
        return this.busidate;
    }

    public void setBusidate(UFDate busidate) {
        this.busidate = busidate;
    }

    public UFDouble getSum_money_bal() {
        return this.sum_money_bal;
    }

    public void setSum_money_bal(UFDouble sumMoneyBal) {
        this.sum_money_bal = sumMoneyBal;
    }

    public UFDouble getSum_local_money_bal() {
        return this.sum_local_money_bal;
    }

    public void setSum_local_money_bal(UFDouble sumLocalMoneyBal) {
        this.sum_local_money_bal = sumLocalMoneyBal;
    }

    public UFDouble getSum_money() {
        return this.sum_money;
    }

    public void setSum_money(UFDouble sumMoney) {
        this.sum_money = sumMoney;
    }

    public UFDouble getSum_local_money() {
        return this.sum_local_money;
    }

    public void setSum_local_money(UFDouble sumLocalMoney) {
        this.sum_local_money = sumLocalMoney;
    }

    public UFDouble getSum_money_de() {
        return this.sum_money_de;
    }

    public void setSum_money_de(UFDouble sumMoneyDe) {
        this.sum_money_de = sumMoneyDe;
    }

    public UFDouble getSum_local_money_de() {
        return this.sum_local_money_de;
    }

    public void setSum_local_money_de(UFDouble sumLocalMoneyDe) {
        this.sum_local_money_de = sumLocalMoneyDe;
    }

    public UFDouble getSum_money_cr() {
        return this.sum_money_cr;
    }

    public void setSum_money_cr(UFDouble sumMoneyCr) {
        this.sum_money_cr = sumMoneyCr;
    }

    public UFDouble getSum_local_money_cr() {
        return this.sum_local_money_cr;
    }

    public void setSum_local_money_cr(UFDouble sumLocalMoneyCr) {
        this.sum_local_money_cr = sumLocalMoneyCr;
    }
}

