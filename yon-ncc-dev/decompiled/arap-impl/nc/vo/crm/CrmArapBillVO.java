/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.crm;

import nc.vo.crm.CrmArapBillBodyVO;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;

public class CrmArapBillVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private CrmArapBillBodyVO[] crmArapBillBodyVO;
    private UFBoolean isinit = UFBoolean.FALSE;
    private String pk_org;
    private String billno;
    private UFDate billdate;
    private String objtype;
    private String customer;
    private String pk_deptid;
    private String pk_psndoc;
    private String pk_deptid_v;
    private String pk_currtype;
    private UFDouble money = UFDouble.ZERO_DBL;
    private UFDouble local_money = UFDouble.ZERO_DBL;
    private UFBoolean isreded;
    private String pk_balatype;
    private String so_org;
    private String so_deptid;
    private String so_psndoc;
    private String settleflag;
    private String invoiceno;
    private String so_org_v;
    private String effectstatus;
    private UFDouble grouplocal = UFDouble.ZERO_DBL;
    private UFDouble globallocal = UFDouble.ZERO_DBL;
    private String pu_org;
    private String pu_deptid;
    private String pu_psndoc;
    private String pu_org_v;
    private String supplier;
    private String pk_org_pk;
    private String pk_currtype_pk;

    public CrmArapBillBodyVO[] getCrmArapBillBodyVO() {
        return this.crmArapBillBodyVO;
    }

    public void setCrmArapBillBodyVO(CrmArapBillBodyVO[] crmArapBillBodyVO) {
        this.crmArapBillBodyVO = crmArapBillBodyVO;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public UFBoolean getIsinit() {
        return this.isinit;
    }

    public void setIsinit(UFBoolean isinit) {
        this.isinit = isinit;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate billdate) {
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

    public String getPk_deptid_v() {
        return this.pk_deptid_v;
    }

    public void setPk_deptid_v(String pkDeptidV) {
        this.pk_deptid_v = pkDeptidV;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
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

    public UFBoolean getIsreded() {
        return this.isreded;
    }

    public void setIsreded(UFBoolean isreded) {
        this.isreded = isreded;
    }

    public String getPk_balatype() {
        return this.pk_balatype;
    }

    public void setPk_balatype(String pkBalatype) {
        this.pk_balatype = pkBalatype;
    }

    public String getSo_org() {
        return this.so_org;
    }

    public void setSo_org(String soOrg) {
        this.so_org = soOrg;
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

    public String getSettleflag() {
        return this.settleflag;
    }

    public void setSettleflag(String settleflag) {
        this.settleflag = settleflag;
    }

    public String getInvoiceno() {
        return this.invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public String getSo_org_v() {
        return this.so_org_v;
    }

    public void setSo_org_v(String soOrgV) {
        this.so_org_v = soOrgV;
    }

    public String getEffectstatus() {
        return this.effectstatus;
    }

    public void setEffectstatus(String effectstatus) {
        this.effectstatus = effectstatus;
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

    public String getPu_org_v() {
        return this.pu_org_v;
    }

    public void setPu_org_v(String puOrgV) {
        this.pu_org_v = puOrgV;
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

