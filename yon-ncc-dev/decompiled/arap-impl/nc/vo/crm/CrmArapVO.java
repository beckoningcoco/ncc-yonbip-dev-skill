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

public class CrmArapVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_org;
    private String pk_org_pk;
    private String pk_currtype;
    private String pk_bill;
    private String billno;
    private String billdate;
    private String objtype;
    private String customer;
    private String pk_deptid;
    private String pk_psndoc;
    private UFDouble money = UFDouble.ZERO_DBL;
    private UFDouble local_money = UFDouble.ZERO_DBL;
    private UFDouble grouplocal = UFDouble.ZERO_DBL;
    private UFDouble globallocal = UFDouble.ZERO_DBL;
    private String pk_balatype;
    private String recaccount;
    private String payaccount;
    private UFDouble pre_init = UFDouble.ZERO_DBL;
    private UFDouble pre_money = UFDouble.ZERO_DBL;
    private UFDouble pre_bal = UFDouble.ZERO_DBL;
    private UFDouble gathering_init = UFDouble.ZERO_DBL;
    private UFDouble gathering_money = UFDouble.ZERO_DBL;
    private UFDouble gathering_bal = UFDouble.ZERO_DBL;
    private UFDouble rec_init = UFDouble.ZERO_DBL;
    private UFDouble rec_money = UFDouble.ZERO_DBL;
    private UFDouble rec_bal = UFDouble.ZERO_DBL;

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String pkBill) {
        this.pk_bill = pkBill;
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

    public UFDouble getGrouplocal() {
        return this.grouplocal;
    }

    public void setGrouplocal(UFDouble grouplocal) {
        this.grouplocal = grouplocal;
    }

    public UFDouble getGloballocal() {
        return this.globallocal;
    }

    public void setGloballocal(UFDouble globallocal) {
        this.globallocal = globallocal;
    }

    public String getPk_balatype() {
        return this.pk_balatype;
    }

    public void setPk_balatype(String pkBalatype) {
        this.pk_balatype = pkBalatype;
    }

    public String getRecaccount() {
        return this.recaccount;
    }

    public void setRecaccount(String recaccount) {
        this.recaccount = recaccount;
    }

    public UFDouble getPre_init() {
        return this.pre_init;
    }

    public void setPre_init(UFDouble preInit) {
        this.pre_init = preInit;
    }

    public UFDouble getPre_money() {
        return this.pre_money;
    }

    public void setPre_money(UFDouble preMoney) {
        this.pre_money = preMoney;
    }

    public UFDouble getPre_bal() {
        return this.pre_bal;
    }

    public void setPre_bal(UFDouble preBal) {
        this.pre_bal = preBal;
    }

    public UFDouble getGathering_init() {
        return this.gathering_init;
    }

    public void setGathering_init(UFDouble gatheringInit) {
        this.gathering_init = gatheringInit;
    }

    public UFDouble getGathering_money() {
        return this.gathering_money;
    }

    public void setGathering_money(UFDouble gatheringMoney) {
        this.gathering_money = gatheringMoney;
    }

    public UFDouble getGathering_bal() {
        return this.gathering_bal;
    }

    public void setGathering_bal(UFDouble gatheringBal) {
        this.gathering_bal = gatheringBal;
    }

    public UFDouble getRec_init() {
        return this.rec_init;
    }

    public void setRec_init(UFDouble recInit) {
        this.rec_init = recInit;
    }

    public UFDouble getRec_money() {
        return this.rec_money;
    }

    public void setRec_money(UFDouble recMoney) {
        this.rec_money = recMoney;
    }

    public UFDouble getRec_bal() {
        return this.rec_bal;
    }

    public void setRec_bal(UFDouble recBal) {
        this.rec_bal = recBal;
    }

    public String getPayaccount() {
        return this.payaccount;
    }

    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount;
    }

    public String getPk_org_pk() {
        return this.pk_org_pk;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
    }

    public void setPk_org_pk(String pkOrgPk) {
        this.pk_org_pk = pkOrgPk;
    }
}

