/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.tally;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class RecStatementItemVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_recstatement;
    private String pk_recstatementitem;
    private String pk_group;
    private String pk_org;
    private String tallydate;
    private String pk_customer;
    private String pk_customer_v;
    private String pk_supplier;
    private String pk_supplier_v;
    private String pk_deptid;
    private String pk_psndoc;
    private String pk_currtype;
    private String pk_billtype;
    private String billtype;
    private String pk_tradetypeid;
    private String brief;
    private String pk_bill;
    private String billno;
    private String invoiceno;
    private UFDouble debt_qua;
    private UFDouble debt_ori;
    private UFDouble debt_loc;
    private UFDouble gr_debt_loc;
    private UFDouble gl_debt_loc;
    private UFDouble credit_qua;
    private UFDouble credit_ori;
    private UFDouble credit_loc;
    private UFDouble gr_credit_loc;
    private UFDouble gl_credit_loc;
    private UFDouble bal_qua;
    private UFDouble bal_ori;
    private UFDouble bal_loc;
    private UFDouble gr_bal_loc;
    private UFDouble gl_bal_loc;
    private Integer dealflag;
    private String pk_dealnum;
    private Integer markperiod;
    private Integer dr = 0;
    private UFDateTime ts;
    private String matcustcode;
    private String project;
    public static final String PK_RECSTATEMENT = "pk_recstatement";
    public static final String PK_RECSTATEMENTITEM = "pk_recstatementitem";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String TALLYDATE = "tallydate";
    public static final String PK_CUSTOMER = "pk_customer";
    public static final String PK_SUPPLIER = "pk_supplier";
    public static final String PK_CUSTOMER_V = "pk_customer_v";
    public static final String PK_SUPPLIER_V = "pk_supplier_v";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String BILLTYPE = "billtype";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String BRIEF = "brief";
    public static final String PK_BILL = "pk_bill";
    public static final String BILLNO = "billno";
    public static final String INVOICENO = "invoiceno";
    public static final String DEBT_QUA = "debt_qua";
    public static final String DEBT_ORI = "debt_ori";
    public static final String DEBT_LOC = "debt_loc";
    public static final String GR_DEBT_LOC = "gr_debt_loc";
    public static final String GL_DEBT_LOC = "gl_debt_loc";
    public static final String CREDIT_QUA = "credit_qua";
    public static final String CREDIT_ORI = "credit_ori";
    public static final String CREDIT_LOC = "credit_loc";
    public static final String GR_CREDIT_LOC = "gr_credit_loc";
    public static final String GL_CREDIT_LOC = "gl_credit_loc";
    public static final String BAL_QUA = "bal_qua";
    public static final String BAL_ORI = "bal_ori";
    public static final String BAL_LOC = "bal_loc";
    public static final String GR_BAL_LOC = "gr_bal_loc";
    public static final String GL_BAL_LOC = "gl_bal_loc";
    public static final String DEALFLAG = "dealflag";
    public static final String PK_DEALNUM = "pk_dealnum";
    public static final String MARKPERIOD = "markperiod";
    public static final String MATCUSTCODE = "matcustcode";
    public static final String PROJECT = "project";

    public String getPk_recstatement() {
        return this.pk_recstatement;
    }

    public void setPk_recstatement(String newPk_recstatement) {
        this.pk_recstatement = newPk_recstatement;
    }

    public String getPk_recstatementitem() {
        return this.pk_recstatementitem;
    }

    public void setPk_recstatementitem(String newPk_recstatementitem) {
        this.pk_recstatementitem = newPk_recstatementitem;
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

    public String getTallydate() {
        return this.tallydate;
    }

    public void setTallydate(String newTallydate) {
        this.tallydate = newTallydate;
    }

    public String getPk_customer() {
        return this.pk_customer;
    }

    public void setPk_customer(String newPk_customer) {
        this.pk_customer = newPk_customer;
    }

    public String getPk_supplier() {
        return this.pk_supplier;
    }

    public void setPk_supplier(String newPk_supplier) {
        this.pk_supplier = newPk_supplier;
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

    public String getPk_billtype() {
        return this.pk_billtype;
    }

    public void setPk_billtype(String newPk_billtype) {
        this.pk_billtype = newPk_billtype;
    }

    public String getBilltype() {
        return this.billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    public String getPk_tradetypeid() {
        return this.pk_tradetypeid;
    }

    public void setPk_tradetypeid(String newPk_tradetypeid) {
        this.pk_tradetypeid = newPk_tradetypeid;
    }

    public String getBrief() {
        return this.brief;
    }

    public void setBrief(String newBrief) {
        this.brief = newBrief;
    }

    public String getPk_bill() {
        return this.pk_bill;
    }

    public void setPk_bill(String newPk_bill) {
        this.pk_bill = newPk_bill;
    }

    public String getBillno() {
        return this.billno;
    }

    public void setBillno(String newBillno) {
        this.billno = newBillno;
    }

    public String getInvoiceno() {
        return this.invoiceno;
    }

    public void setInvoiceno(String newInvoiceno) {
        this.invoiceno = newInvoiceno;
    }

    public UFDouble getDebt_qua() {
        return this.debt_qua;
    }

    public void setDebt_qua(UFDouble newDebt_qua) {
        this.debt_qua = newDebt_qua;
    }

    public UFDouble getDebt_ori() {
        return this.debt_ori;
    }

    public void setDebt_ori(UFDouble newDebt_ori) {
        this.debt_ori = newDebt_ori;
    }

    public UFDouble getDebt_loc() {
        return this.debt_loc;
    }

    public void setDebt_loc(UFDouble newDebt_loc) {
        this.debt_loc = newDebt_loc;
    }

    public UFDouble getGr_debt_loc() {
        return this.gr_debt_loc;
    }

    public void setGr_debt_loc(UFDouble newGr_debt_loc) {
        this.gr_debt_loc = newGr_debt_loc;
    }

    public UFDouble getGl_debt_loc() {
        return this.gl_debt_loc;
    }

    public void setGl_debt_loc(UFDouble newGl_debt_loc) {
        this.gl_debt_loc = newGl_debt_loc;
    }

    public UFDouble getCredit_qua() {
        return this.credit_qua;
    }

    public void setCredit_qua(UFDouble newCredit_qua) {
        this.credit_qua = newCredit_qua;
    }

    public UFDouble getCredit_ori() {
        return this.credit_ori;
    }

    public void setCredit_ori(UFDouble newCredit_ori) {
        this.credit_ori = newCredit_ori;
    }

    public UFDouble getCredit_loc() {
        return this.credit_loc;
    }

    public void setCredit_loc(UFDouble newCredit_loc) {
        this.credit_loc = newCredit_loc;
    }

    public UFDouble getGr_credit_loc() {
        return this.gr_credit_loc;
    }

    public void setGr_credit_loc(UFDouble newGr_credit_loc) {
        this.gr_credit_loc = newGr_credit_loc;
    }

    public UFDouble getGl_credit_loc() {
        return this.gl_credit_loc;
    }

    public void setGl_credit_loc(UFDouble newGl_credit_loc) {
        this.gl_credit_loc = newGl_credit_loc;
    }

    public UFDouble getBal_qua() {
        return this.bal_qua;
    }

    public void setBal_qua(UFDouble newBal_qua) {
        this.bal_qua = newBal_qua;
    }

    public UFDouble getBal_ori() {
        return this.bal_ori;
    }

    public void setBal_ori(UFDouble newBal_ori) {
        this.bal_ori = newBal_ori;
    }

    public UFDouble getBal_loc() {
        return this.bal_loc;
    }

    public void setBal_loc(UFDouble newBal_loc) {
        this.bal_loc = newBal_loc;
    }

    public UFDouble getGr_bal_loc() {
        return this.gr_bal_loc;
    }

    public void setGr_bal_loc(UFDouble newGr_bal_loc) {
        this.gr_bal_loc = newGr_bal_loc;
    }

    public UFDouble getGl_bal_loc() {
        return this.gl_bal_loc;
    }

    public void setGl_bal_loc(UFDouble newGl_bal_loc) {
        this.gl_bal_loc = newGl_bal_loc;
    }

    public Integer getDealflag() {
        return this.dealflag;
    }

    public void setDealflag(Integer newDealflag) {
        this.dealflag = newDealflag;
    }

    public String getPk_dealnum() {
        return this.pk_dealnum;
    }

    public void setPk_dealnum(String newPk_dealnum) {
        this.pk_dealnum = newPk_dealnum;
    }

    public Integer getMarkperiod() {
        return this.markperiod;
    }

    public void setMarkperiod(Integer newMarkperiod) {
        this.markperiod = newMarkperiod;
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
        return PK_RECSTATEMENT;
    }

    public String getMatcustcode() {
        return this.matcustcode;
    }

    public void setMatcustcode(String matcustcode) {
        this.matcustcode = matcustcode;
    }

    public String getPKFieldName() {
        return PK_RECSTATEMENTITEM;
    }

    public String getTableName() {
        return "arap_recstatementitem";
    }

    public static String getDefaultTableName() {
        return "arap_recstatementitem";
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arap_recstatementitem");
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProject() {
        return this.project;
    }

    public String getPk_customer_v() {
        return this.pk_customer_v;
    }

    public void setPk_customer_v(String pk_customer_v) {
        this.pk_customer_v = pk_customer_v;
    }

    public String getPk_supplier_v() {
        return this.pk_supplier_v;
    }

    public void setPk_supplier_v(String pk_supplier_v) {
        this.pk_supplier_v = pk_supplier_v;
    }
}

