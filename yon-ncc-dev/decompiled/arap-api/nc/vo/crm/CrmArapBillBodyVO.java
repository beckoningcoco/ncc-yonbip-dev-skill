/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.crm;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;

public class CrmArapBillBodyVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String contractno;
    private String purchaseorder;
    private String invoiceno;
    private String objtype;
    private String customer;
    private String pk_deptid;
    private String pk_psndoc;
    private String pk_org;
    private String prepay;
    private String pk_currtype;
    private String so_org;
    private UFDouble rate;
    private UFDouble money_cr = UFDouble.ZERO_DBL;
    private UFDouble local_money_cr = UFDouble.ZERO_DBL;
    private String so_ordertype;
    private String so_transtype;
    private String so_deptid;
    private String so_psndoc;
    private String pk_balatype;
    private String checktype;
    private String checkno;
    private String payaccount;
    private String recaccount;
    private String ordercubasdoc;
    private UFDouble money_bal = UFDouble.ZERO_DBL;
    private UFDouble grouprate = UFDouble.ZERO_DBL;
    private UFDouble globalrate = UFDouble.ZERO_DBL;
    private UFDouble groupcrebit = UFDouble.ZERO_DBL;
    private UFDouble globalcrebit = UFDouble.ZERO_DBL;
    private UFDouble local_price = UFDouble.ZERO_DBL;
    private UFDouble groupbalance = UFDouble.ZERO_DBL;
    private UFDouble globalbalance = UFDouble.ZERO_DBL;
    private String project;
    private String supplier;
    private UFDouble money_de = UFDouble.ZERO_DBL;
    private UFDouble local_money_de = UFDouble.ZERO_DBL;
    private String pu_org;
    private String pu_deptid;
    private String pu_psndoc;
    private String cashaccount;
    private String productline;
    private UFDouble groupdebit = UFDouble.ZERO_DBL;
    private UFDouble globaldebit = UFDouble.ZERO_DBL;
    private UFDouble local_money_bal = UFDouble.ZERO_DBL;
    private String pk_org_pk;
    private String pk_currtype_pk;

    public String getContractno() {
        return this.contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public String getPurchaseorder() {
        return this.purchaseorder;
    }

    public void setPurchaseorder(String purchaseorder) {
        this.purchaseorder = purchaseorder;
    }

    public String getInvoiceno() {
        return this.invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public String getObjtype() {
        return this.objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype;
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

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getPrepay() {
        return this.prepay;
    }

    public void setPrepay(String prepay) {
        this.prepay = prepay;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
    }

    public String getSo_org() {
        return this.so_org;
    }

    public void setSo_org(String soOrg) {
        this.so_org = soOrg;
    }

    public UFDouble getRate() {
        return this.rate;
    }

    public void setRate(UFDouble rate) {
        this.rate = rate;
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

    public String getSo_ordertype() {
        return this.so_ordertype;
    }

    public void setSo_ordertype(String soOrdertype) {
        this.so_ordertype = soOrdertype;
    }

    public String getSo_transtype() {
        return this.so_transtype;
    }

    public void setSo_transtype(String soTranstype) {
        this.so_transtype = soTranstype;
    }

    public String getSo_deptid() {
        return this.so_deptid;
    }

    public void setSo_deptid(String soDeptid) {
        this.so_deptid = soDeptid;
    }

    public String getSo_psndoc() {
        return this.so_psndoc;
    }

    public void setSo_psndoc(String soPsndoc) {
        this.so_psndoc = soPsndoc;
    }

    public String getPk_balatype() {
        return this.pk_balatype;
    }

    public void setPk_balatype(String pkBalatype) {
        this.pk_balatype = pkBalatype;
    }

    public String getChecktype() {
        return this.checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype;
    }

    public String getCheckno() {
        return this.checkno;
    }

    public void setCheckno(String checkno) {
        this.checkno = checkno;
    }

    public String getPayaccount() {
        return this.payaccount;
    }

    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount;
    }

    public String getRecaccount() {
        return this.recaccount;
    }

    public void setRecaccount(String recaccount) {
        this.recaccount = recaccount;
    }

    public String getOrdercubasdoc() {
        return this.ordercubasdoc;
    }

    public void setOrdercubasdoc(String ordercubasdoc) {
        this.ordercubasdoc = ordercubasdoc;
    }

    public UFDouble getMoney_bal() {
        return this.money_bal;
    }

    public void setMoney_bal(UFDouble moneyBal) {
        this.money_bal = moneyBal;
    }

    public UFDouble getGrouprate() {
        return this.grouprate;
    }

    public void setGrouprate(UFDouble grouprate) {
        this.grouprate = grouprate;
    }

    public UFDouble getGlobalrate() {
        return this.globalrate;
    }

    public void setGlobalrate(UFDouble globalrate) {
        this.globalrate = globalrate;
    }

    public UFDouble getGroupcrebit() {
        return this.groupcrebit;
    }

    public void setGroupcrebit(UFDouble groupcrebit) {
        this.groupcrebit = groupcrebit;
    }

    public UFDouble getGlobalcrebit() {
        return this.globalcrebit;
    }

    public void setGlobalcrebit(UFDouble globalcrebit) {
        this.globalcrebit = globalcrebit;
    }

    public UFDouble getLocal_price() {
        return this.local_price;
    }

    public void setLocal_price(UFDouble localPrice) {
        this.local_price = localPrice;
    }

    public UFDouble getGroupbalance() {
        return this.groupbalance;
    }

    public void setGroupbalance(UFDouble groupbalance) {
        this.groupbalance = groupbalance;
    }

    public UFDouble getGlobalbalance() {
        return this.globalbalance;
    }

    public void setGlobalbalance(UFDouble globalbalance) {
        this.globalbalance = globalbalance;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
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

    public String getPu_org() {
        return this.pu_org;
    }

    public void setPu_org(String puOrg) {
        this.pu_org = puOrg;
    }

    public String getPu_deptid() {
        return this.pu_deptid;
    }

    public void setPu_deptid(String puDeptid) {
        this.pu_deptid = puDeptid;
    }

    public String getPu_psndoc() {
        return this.pu_psndoc;
    }

    public void setPu_psndoc(String puPsndoc) {
        this.pu_psndoc = puPsndoc;
    }

    public String getCashaccount() {
        return this.cashaccount;
    }

    public void setCashaccount(String cashaccount) {
        this.cashaccount = cashaccount;
    }

    public String getProductline() {
        return this.productline;
    }

    public void setProductline(String productline) {
        this.productline = productline;
    }

    public UFDouble getGroupdebit() {
        return this.groupdebit;
    }

    public void setGroupdebit(UFDouble groupdebit) {
        this.groupdebit = groupdebit;
    }

    public UFDouble getGlobaldebit() {
        return this.globaldebit;
    }

    public void setGlobaldebit(UFDouble globaldebit) {
        this.globaldebit = globaldebit;
    }

    public UFDouble getLocal_money_bal() {
        return this.local_money_bal;
    }

    public void setLocal_money_bal(UFDouble localMoneyBal) {
        this.local_money_bal = localMoneyBal;
    }

    public String getPk_org_pk() {
        return this.pk_org_pk;
    }

    public void setPk_org_pk(String pkOrgPk) {
        this.pk_org_pk = pkOrgPk;
    }

    public String getPk_currtype_pk() {
        return this.pk_currtype_pk;
    }

    public void setPk_currtype_pk(String pkCurrtypePk) {
        this.pk_currtype_pk = pkCurrtypePk;
    }
}

