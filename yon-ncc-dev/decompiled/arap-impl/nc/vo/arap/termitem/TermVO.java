/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.termitem;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class TermVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String supplier;
    private String pk_group;
    private String pk_org;
    private String pk_bill;
    private String pk_billtype;
    private String pk_item;
    private String pk_termitem;
    private UFBoolean prepay = UFBoolean.FALSE;
    private String pk_term_b;
    private UFDouble money_de = UF_DOUBLE_ZERO;
    private UFDouble local_money_de = UF_DOUBLE_ZERO;
    private UFDouble quantity_de = UF_DOUBLE_ZERO;
    private UFDouble quantity_cr = UF_DOUBLE_ZERO;
    private UFDouble local_money_cr = UF_DOUBLE_ZERO;
    private UFDouble money_cr = UF_DOUBLE_ZERO;
    private UFDouble money_bal = UF_DOUBLE_ZERO;
    private UFDouble local_money_bal = UF_DOUBLE_ZERO;
    private UFDouble quantity_bal = UF_DOUBLE_ZERO;
    private UFDate expiredate;
    private UFDate lastdiscountdate;
    private UFDate innerctldeferdays;
    private UFDouble lastdiscount = UF_DOUBLE_ZERO;
    private UFBoolean insurance = UFBoolean.FALSE;
    private UFDouble grouplocal = UF_DOUBLE_ZERO;
    private UFDouble globallocal = UF_DOUBLE_ZERO;
    private UFDouble groupdebit = UF_DOUBLE_ZERO;
    private UFDouble groupcredit = UF_DOUBLE_ZERO;
    private UFDouble globaldebit = UF_DOUBLE_ZERO;
    private UFDouble globalcredit = UF_DOUBLE_ZERO;
    private UFDouble groupbalance = UF_DOUBLE_ZERO;
    private UFDouble globalbalance = UF_DOUBLE_ZERO;
    private UFDouble occupationmny = UF_DOUBLE_ZERO;
    private String accRate = "" + UF_DOUBLE_ONE.multiply(100.0).setScale(2, 0);
    private String showorder;
    private String balatype;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final UFDouble UF_DOUBLE_ZERO = UFDouble.ZERO_DBL;
    public static final UFDouble UF_DOUBLE_ONE = UFDouble.ONE_DBL;
    public static final String PK_GROUP = "pk_group";
    public static final String SUPPLIER = "supplier";
    public static final String PK_ORG = "pk_org";
    public static final String PK_BILL = "pk_bill";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String PK_ITEM = "pk_item";
    public static final String PK_TERMITEM = "pk_termitem";
    public static final String MONEY_DE = "money_de";
    public static final String LOCAL_MONEY_DE = "local_money_de";
    public static final String QUANTITY_DE = "quantity_de";
    public static final String QUANTITY_CR = "quantity_cr";
    public static final String LOCAL_MONEY_CR = "local_money_cr";
    public static final String MONEY_CR = "money_cr";
    public static final String MONEY_BAL = "money_bal";
    public static final String LOCAL_MONEY_BAL = "local_money_bal";
    public static final String QUANTITY_BAL = "quantity_bal";
    public static final String EXPIREDATE = "expiredate";
    public static final String LASTDISCOUNTDATE = "lastdiscountdate";
    public static final String LASTDISCOUNT = "lastdiscount";
    public static final String GROUPLOCAL = "grouplocal";
    public static final String GLOBALLOCAL = "globallocal";
    public static final String GROUPDEBIT = "groupdebit";
    public static final String GROUPCREDIT = "groupcredit";
    public static final String GLOBALDEBIT = "globaldebit";
    public static final String GLOBALCREDIT = "globalcredit";
    public static final String GROUPBALANCE = "groupbalance";
    public static final String GLOBALBALANCE = "globalbalance";
    public static final String INSURANCE = "insurance";
    public static final String INNERCTLDEFERDAYS = "innerctldeferdays";
    public static final String ACCRATE = "accRate";
    public static final String SHOWORDER = "showorder";
    public static final String OCCUPATIONMNY = "occupationmny";

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String newPk_group) {
        this.pk_group = newPk_group;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String newPk_org) {
        this.pk_org = newPk_org;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String newPk_bill) {
        this.pk_bill = newPk_bill;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPk_billtype() {
        return this.pk_billtype;
    }

    public void setPk_billtype(String pkBilltype) {
        this.pk_billtype = pkBilltype;
    }

    public String getPk_item() {
        return this.pk_item;
    }

    public void setPk_item(String newPk_item) {
        this.pk_item = newPk_item;
    }

    public String getPk_termitem() {
        return this.pk_termitem;
    }

    public void setPk_termitem(String newPk_termitem) {
        this.pk_termitem = newPk_termitem;
    }

    public UFDouble getMoney_de() {
        if (this.money_de == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.money_de;
    }

    public void setMoney_de(UFDouble newMoney_de) {
        this.money_de = newMoney_de;
    }

    public UFDouble getLocal_money_de() {
        if (this.local_money_de == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.local_money_de;
    }

    public void setLocal_money_de(UFDouble newLocal_money_de) {
        this.local_money_de = newLocal_money_de;
    }

    public UFDouble getQuantity_de() {
        if (this.quantity_de == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.quantity_de;
    }

    public void setQuantity_de(UFDouble newQuantity_de) {
        this.quantity_de = newQuantity_de;
    }

    public UFDouble getQuantity_cr() {
        if (this.quantity_cr == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.quantity_cr;
    }

    public void setQuantity_cr(UFDouble newQuantity_cr) {
        this.quantity_cr = newQuantity_cr;
    }

    public UFDouble getLocal_money_cr() {
        if (this.local_money_cr == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.local_money_cr;
    }

    public void setLocal_money_cr(UFDouble newLocal_money_cr) {
        this.local_money_cr = newLocal_money_cr;
    }

    public UFDouble getMoney_cr() {
        if (this.money_cr == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.money_cr;
    }

    public void setMoney_cr(UFDouble newMoney_cr) {
        this.money_cr = newMoney_cr;
    }

    public UFDouble getMoney_bal() {
        if (this.money_bal == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.money_bal;
    }

    public void setMoney_bal(UFDouble newMoney_bal) {
        this.money_bal = newMoney_bal;
    }

    public UFDouble getLocal_money_bal() {
        if (this.local_money_bal == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.local_money_bal;
    }

    public void setLocal_money_bal(UFDouble newLocal_money_bal) {
        this.local_money_bal = newLocal_money_bal;
    }

    public UFDouble getQuantity_bal() {
        if (this.quantity_bal == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.quantity_bal;
    }

    public void setQuantity_bal(UFDouble newQuantity_bal) {
        this.quantity_bal = newQuantity_bal;
    }

    public UFDate getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(UFDate newExpiredate) {
        this.expiredate = newExpiredate;
    }

    public UFDate getLastdiscountdate() {
        return this.lastdiscountdate;
    }

    public void setLastdiscountdate(UFDate newLastdiscountdate) {
        this.lastdiscountdate = newLastdiscountdate;
    }

    public UFDouble getLastdiscount() {
        return this.lastdiscount;
    }

    public void setLastdiscount(UFDouble newLastdiscount) {
        this.lastdiscount = newLastdiscount;
    }

    public UFDouble getGrouplocal() {
        if (this.grouplocal == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.grouplocal;
    }

    public void setGrouplocal(UFDouble grouplocal) {
        this.grouplocal = grouplocal;
    }

    public UFDouble getGloballocal() {
        if (this.globallocal == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.globallocal;
    }

    public void setGloballocal(UFDouble globallocal) {
        this.globallocal = globallocal;
    }

    public UFDouble getGroupdebit() {
        if (this.groupdebit == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.groupdebit;
    }

    public void setGroupdebit(UFDouble groupdebit) {
        this.groupdebit = groupdebit;
    }

    public UFDouble getGroupcredit() {
        if (this.groupcredit == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.groupcredit;
    }

    public void setGroupcredit(UFDouble groupcredit) {
        this.groupcredit = groupcredit;
    }

    public UFDouble getGlobaldebit() {
        if (this.globaldebit == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.globaldebit;
    }

    public void setGlobaldebit(UFDouble globaldebit) {
        this.globaldebit = globaldebit;
    }

    public UFDouble getGlobalcredit() {
        if (this.globalcredit == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.globalcredit;
    }

    public void setGlobalcredit(UFDouble globalcredit) {
        this.globalcredit = globalcredit;
    }

    public UFDouble getGroupbalance() {
        if (this.groupbalance == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.groupbalance;
    }

    public void setGroupbalance(UFDouble groupbalance) {
        this.groupbalance = groupbalance;
    }

    public UFDouble getGlobalbalance() {
        if (this.globalbalance == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.globalbalance;
    }

    public void setGlobalbalance(UFDouble globalbalance) {
        this.globalbalance = globalbalance;
    }

    public UFDouble getOccupationmny() {
        if (this.occupationmny == null) {
            return UFDouble.ZERO_DBL;
        }
        return this.occupationmny;
    }

    public void setOccupationmny(UFDouble occupationmny) {
        this.occupationmny = occupationmny;
    }

    public UFBoolean getInsurance() {
        return this.insurance;
    }

    public void setInsurance(UFBoolean newInsurance) {
        this.insurance = newInsurance;
    }

    public UFDate getInnerctldeferdays() {
        return this.innerctldeferdays;
    }

    public void setInnerctldeferdays(UFDate innerctldeferdays) {
        this.innerctldeferdays = innerctldeferdays;
    }

    public String getAccRate() {
        return this.accRate;
    }

    public void setAccRate(String accRate) {
        this.accRate = accRate;
    }

    public String getBalatype() {
        return this.balatype;
    }

    public void setBalatype(String balatype) {
        this.balatype = balatype;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return PK_TERMITEM;
    }

    public String getTableName() {
        return "arap_termitem";
    }

    public String getPk_term_b() {
        return this.pk_term_b;
    }

    public void setPk_term_b(String pkTermB) {
        this.pk_term_b = pkTermB;
    }

    public UFBoolean getPrepay() {
        return this.prepay;
    }

    public void setPrepay(UFBoolean prepay) {
        this.prepay = prepay;
    }

    public String getShoworder() {
        return this.showorder;
    }

    public void setShoworder(String showorder) {
        this.showorder = showorder;
    }
}

