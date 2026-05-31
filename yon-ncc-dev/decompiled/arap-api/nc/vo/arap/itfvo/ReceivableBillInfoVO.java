/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.itfvo;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;

public class ReceivableBillInfoVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_billid = null;
    private String pk_itemid = null;
    private UFDouble quantity_de = null;
    private UFDouble quantity_bal = null;
    private UFDouble money_de = null;
    private UFDouble money_bal = null;
    private UFDouble local_money_de = null;
    private UFDouble local_money_bal = null;
    private UFDouble groupdebit = null;
    private UFDouble groupbalance = null;
    private UFDouble globaldebit = null;
    private UFDouble globalbalance = null;
    private UFDouble local_notax_de = null;
    private UFDouble local_tax_de = null;

    public String getPk_billid() {
        return this.pk_billid;
    }

    public void setPk_billid(String pk_billid) {
        this.pk_billid = pk_billid;
    }

    public String getPk_itemid() {
        return this.pk_itemid;
    }

    public void setPk_itemid(String pk_itemid) {
        this.pk_itemid = pk_itemid;
    }

    public UFDouble getQuantity_de() {
        return this.quantity_de;
    }

    public void setQuantity_de(UFDouble quantityDe) {
        this.quantity_de = quantityDe;
    }

    public UFDouble getQuantity_bal() {
        return this.quantity_bal;
    }

    public void setQuantity_bal(UFDouble quantityBal) {
        this.quantity_bal = quantityBal;
    }

    public UFDouble getMoney_de() {
        return this.money_de;
    }

    public void setMoney_de(UFDouble moneyDe) {
        this.money_de = moneyDe;
    }

    public UFDouble getMoney_bal() {
        return this.money_bal;
    }

    public void setMoney_bal(UFDouble moneyBal) {
        this.money_bal = moneyBal;
    }

    public UFDouble getLocal_money_de() {
        return this.local_money_de;
    }

    public void setLocal_money_de(UFDouble localMoneyDe) {
        this.local_money_de = localMoneyDe;
    }

    public UFDouble getLocal_money_bal() {
        return this.local_money_bal;
    }

    public void setLocal_money_bal(UFDouble localMoneyBal) {
        this.local_money_bal = localMoneyBal;
    }

    public UFDouble getGroupdebit() {
        return this.groupdebit;
    }

    public void setGroupdebit(UFDouble groupdebit) {
        this.groupdebit = groupdebit;
    }

    public UFDouble getGroupbalance() {
        return this.groupbalance;
    }

    public void setGroupbalance(UFDouble groupbalance) {
        this.groupbalance = groupbalance;
    }

    public UFDouble getGlobaldebit() {
        return this.globaldebit;
    }

    public void setGlobaldebit(UFDouble globaldebit) {
        this.globaldebit = globaldebit;
    }

    public UFDouble getGlobalbalance() {
        return this.globalbalance;
    }

    public void setGlobalbalance(UFDouble globalbalance) {
        this.globalbalance = globalbalance;
    }

    public UFDouble getLocal_notax_de() {
        return this.local_notax_de;
    }

    public void setLocal_notax_de(UFDouble localNotaxDe) {
        this.local_notax_de = localNotaxDe;
    }

    public UFDouble getLocal_tax_de() {
        return this.local_tax_de;
    }

    public void setLocal_tax_de(UFDouble localTaxDe) {
        this.local_tax_de = localTaxDe;
    }
}

