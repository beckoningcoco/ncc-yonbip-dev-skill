/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.tally;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class BalanceVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_balance;
    private String compondmd5;
    private String pk_group;
    private String pk_org;
    private String pk_org_v;
    private String accyear;
    private String accmonth;
    private String accperiod;
    private Integer objtype;
    private String customer;
    private String supplier;
    private String pk_deptid;
    private String pk_psndoc;
    private String pk_currtype;
    private String billclass;
    private Integer billstatus;
    private Integer effectstatus;
    private UFDouble quantity_de;
    private UFDouble money_de;
    private UFDouble local_money_de;
    private UFDouble grouplocal_money_de;
    private UFDouble globallocal_money_de;
    private UFDouble quantity_cr;
    private UFDouble money_cr;
    private UFDouble local_money_cr;
    private UFDouble grouplocal_money_cr;
    private UFDouble globallocal_money_cr;
    private String def1;
    private String def2;
    private String def3;
    private String def4;
    private String def5;
    private String def6;
    private Integer dr = 0;
    private UFDateTime ts;
    private UFBoolean isrefund;
    public static final String PK_BALANCE = "pk_balance";
    public static final String COMPONDMD5 = "compondmd5";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String PK_ORG_V = "pk_org_v";
    public static final String ACCYEAR = "accyear";
    public static final String ACCMONTH = "accmonth";
    public static final String ACCPERIOD = "accperiod";
    public static final String OBJTYPE = "objtype";
    public static final String CUSTOMER = "customer";
    public static final String SUPPLIER = "supplier";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String BILLCLASS = "billclass";
    public static final String BILLSTATUS = "billstatus";
    public static final String EFFECTSTATUS = "effectstatus";
    public static final String QUANTITY_DE = "quantity_de";
    public static final String MONEY_DE = "money_de";
    public static final String LOCAL_MONEY_DE = "local_money_de";
    public static final String GROUPLOCAL_MONEY_DE = "grouplocal_money_de";
    public static final String GLOBALLOCAL_MONEY_DE = "globallocal_money_de";
    public static final String QUANTITY_CR = "quantity_cr";
    public static final String MONEY_CR = "money_cr";
    public static final String LOCAL_MONEY_CR = "local_money_cr";
    public static final String GROUPLOCAL_MONEY_CR = "grouplocal_money_cr";
    public static final String GLOBALLOCAL_MONEY_CR = "globallocal_money_cr";
    public static final String DEF1 = "def1";
    public static final String DEF2 = "def2";
    public static final String DEF3 = "def3";
    public static final String DEF4 = "def4";
    public static final String DEF5 = "def5";
    public static final String DEF6 = "def6";
    public static final String ISREFUND = "isrefund";

    public String getPk_balance() {
        return this.pk_balance;
    }

    public void setPk_balance(String newPk_balance) {
        this.pk_balance = newPk_balance;
    }

    public String getCompondmd5() {
        return this.compondmd5;
    }

    public void setCompondmd5(String newCompondmd5) {
        this.compondmd5 = newCompondmd5;
    }

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

    public String getPk_org_v() {
        return this.pk_org_v;
    }

    public void setPk_org_v(String newPk_org_v) {
        this.pk_org_v = newPk_org_v;
    }

    public String getAccyear() {
        return this.accyear;
    }

    public void setAccyear(String newAccyear) {
        this.accyear = newAccyear;
    }

    public String getAccmonth() {
        return this.accmonth;
    }

    public void setAccmonth(String newAccmonth) {
        this.accmonth = newAccmonth;
    }

    public String getAccperiod() {
        return this.accperiod;
    }

    public void setAccperiod(String newAccperiod) {
        this.accperiod = newAccperiod;
    }

    public Integer getObjtype() {
        return this.objtype;
    }

    public void setObjtype(Integer newObjtype) {
        this.objtype = newObjtype;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String newCustomer) {
        this.customer = newCustomer;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String newSupplier) {
        this.supplier = newSupplier;
    }

    public String getPk_deptid() {
        return this.pk_deptid;
    }

    public void setPk_deptid(String newPk_deptid) {
        this.pk_deptid = newPk_deptid;
    }

    public String getPk_psndoc() {
        return this.pk_psndoc;
    }

    public void setPk_psndoc(String newPk_psndoc) {
        this.pk_psndoc = newPk_psndoc;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public String getBillclass() {
        return this.billclass;
    }

    public void setBillclass(String newBillclass) {
        this.billclass = newBillclass;
    }

    public Integer getBillstatus() {
        return this.billstatus;
    }

    public void setBillstatus(Integer newBillstatus) {
        this.billstatus = newBillstatus;
    }

    public Integer getEffectstatus() {
        return this.effectstatus;
    }

    public void setEffectstatus(Integer newEffectstatus) {
        this.effectstatus = newEffectstatus;
    }

    public UFDouble getQuantity_de() {
        return this.quantity_de;
    }

    public void setQuantity_de(UFDouble newQuantity_de) {
        this.quantity_de = newQuantity_de;
    }

    public UFDouble getMoney_de() {
        return this.money_de;
    }

    public void setMoney_de(UFDouble newMoney_de) {
        this.money_de = newMoney_de;
    }

    public UFDouble getLocal_money_de() {
        return this.local_money_de;
    }

    public void setLocal_money_de(UFDouble newLocal_money_de) {
        this.local_money_de = newLocal_money_de;
    }

    public UFDouble getGrouplocal_money_de() {
        return this.grouplocal_money_de;
    }

    public void setGrouplocal_money_de(UFDouble newGrouplocal_money_de) {
        this.grouplocal_money_de = newGrouplocal_money_de;
    }

    public UFDouble getGloballocal_money_de() {
        return this.globallocal_money_de;
    }

    public void setGloballocal_money_de(UFDouble newGloballocal_money_de) {
        this.globallocal_money_de = newGloballocal_money_de;
    }

    public UFDouble getQuantity_cr() {
        return this.quantity_cr;
    }

    public void setQuantity_cr(UFDouble newQuantity_cr) {
        this.quantity_cr = newQuantity_cr;
    }

    public UFDouble getMoney_cr() {
        return this.money_cr;
    }

    public void setMoney_cr(UFDouble newMoney_cr) {
        this.money_cr = newMoney_cr;
    }

    public UFDouble getLocal_money_cr() {
        return this.local_money_cr;
    }

    public void setLocal_money_cr(UFDouble newLocal_money_cr) {
        this.local_money_cr = newLocal_money_cr;
    }

    public UFDouble getGrouplocal_money_cr() {
        return this.grouplocal_money_cr;
    }

    public void setGrouplocal_money_cr(UFDouble newGrouplocal_money_cr) {
        this.grouplocal_money_cr = newGrouplocal_money_cr;
    }

    public UFDouble getGloballocal_money_cr() {
        return this.globallocal_money_cr;
    }

    public void setGloballocal_money_cr(UFDouble newGloballocal_money_cr) {
        this.globallocal_money_cr = newGloballocal_money_cr;
    }

    public String getDef1() {
        return this.def1;
    }

    public void setDef1(String newDef1) {
        this.def1 = newDef1;
    }

    public String getDef2() {
        return this.def2;
    }

    public void setDef2(String newDef2) {
        this.def2 = newDef2;
    }

    public String getDef3() {
        return this.def3;
    }

    public void setDef3(String newDef3) {
        this.def3 = newDef3;
    }

    public String getDef4() {
        return this.def4;
    }

    public void setDef4(String newDef4) {
        this.def4 = newDef4;
    }

    public String getDef5() {
        return this.def5;
    }

    public void setDef5(String newDef5) {
        this.def5 = newDef5;
    }

    public String getDef6() {
        return this.def6;
    }

    public void setDef6(String newDef6) {
        this.def6 = newDef6;
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

    public UFBoolean getIsrefund() {
        return this.isrefund;
    }

    public void setIsrefund(UFBoolean isrefund) {
        this.isrefund = isrefund;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return PK_BALANCE;
    }

    public String getTableName() {
        return "arap_balance";
    }

    public static String getDefaultTableName() {
        return "arap_balance";
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arap_balance");
    }
}

