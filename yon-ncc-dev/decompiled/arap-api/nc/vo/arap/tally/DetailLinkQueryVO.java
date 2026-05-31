/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.tally;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class DetailLinkQueryVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_detaillinkquery;
    private String pk_group;
    private String pk_org;
    private String code_org;
    private String org;
    private String qryobj0pk;
    private String qryobj0code;
    private String qryobj0;
    private String qryobj1pk;
    private String qryobj1code;
    private String qryobj1;
    private String qryobj2pk;
    private String qryobj2code;
    private String qryobj2;
    private String qryobj3pk;
    private String qryobj3code;
    private String qryobj3;
    private String qryobj4pk;
    private String qryobj4code;
    private String qryobj4;
    private String billclass;
    private String pk_billtype;
    private String billtype;
    private String pk_tradetype;
    private String pk_tradetypeid;
    private String pk_currtype;
    private UFDate tallydate;
    private UFDate billdate;
    private UFDate confirmdate;
    private UFDate effectdate;
    private String invoiceno;
    private String voucherid;
    private String brief;
    private String pk_bill;
    private String billno;
    private String dealflag;
    private String pk_dealnum;
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
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String PK_DETAILLINKQUERY = "pk_detaillinkquery";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String CODE_ORG = "code_org";
    public static final String ORG = "org";
    public static final String QRYOBJ0PK = "qryobj0pk";
    public static final String QRYOBJ0CODE = "qryobj0code";
    public static final String QRYOBJ0 = "qryobj0";
    public static final String QRYOBJ1PK = "qryobj1pk";
    public static final String QRYOBJ1CODE = "qryobj1code";
    public static final String QRYOBJ1 = "qryobj1";
    public static final String QRYOBJ2PK = "qryobj2pk";
    public static final String QRYOBJ2CODE = "qryobj2code";
    public static final String QRYOBJ2 = "qryobj2";
    public static final String QRYOBJ3PK = "qryobj3pk";
    public static final String QRYOBJ3CODE = "qryobj3code";
    public static final String QRYOBJ3 = "qryobj3";
    public static final String QRYOBJ4PK = "qryobj4pk";
    public static final String QRYOBJ4CODE = "qryobj4code";
    public static final String QRYOBJ4 = "qryobj4";
    public static final String BILLCLASS = "billclass";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String BILLTYPE = "billtype";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String PK_TRADETYPEID = "pk_tradetypeid";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String TALLYDATE = "tallydate";
    public static final String BILLDATE = "billdate";
    public static final String CONFIRMDATE = "confirmdate";
    public static final String EFFECTDATE = "effectdate";
    public static final String INVOICENO = "invoiceno";
    public static final String VOUCHERID = "voucherid";
    public static final String BRIEF = "brief";
    public static final String PK_BILL = "pk_bill";
    public static final String BILLNO = "billno";
    public static final String DEALFLAG = "dealflag";
    public static final String PK_DEALNUM = "pk_dealnum";
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

    public String getPk_detaillinkquery() {
        return this.pk_detaillinkquery;
    }

    public void setPk_detaillinkquery(String newPk_detaillinkquery) {
        this.pk_detaillinkquery = newPk_detaillinkquery;
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

    public String getCode_org() {
        return this.code_org;
    }

    public void setCode_org(String newCode_org) {
        this.code_org = newCode_org;
    }

    public String getOrg() {
        return this.org;
    }

    public void setOrg(String newOrg) {
        this.org = newOrg;
    }

    public String getQryobj0pk() {
        return this.qryobj0pk;
    }

    public void setQryobj0pk(String newQryobj0pk) {
        this.qryobj0pk = newQryobj0pk;
    }

    public String getQryobj0code() {
        return this.qryobj0code;
    }

    public void setQryobj0code(String newQryobj0code) {
        this.qryobj0code = newQryobj0code;
    }

    public String getQryobj0() {
        return this.qryobj0;
    }

    public void setQryobj0(String newQryobj0) {
        this.qryobj0 = newQryobj0;
    }

    public String getQryobj1pk() {
        return this.qryobj1pk;
    }

    public void setQryobj1pk(String newQryobj1pk) {
        this.qryobj1pk = newQryobj1pk;
    }

    public String getQryobj1code() {
        return this.qryobj1code;
    }

    public void setQryobj1code(String newQryobj1code) {
        this.qryobj1code = newQryobj1code;
    }

    public String getQryobj1() {
        return this.qryobj1;
    }

    public void setQryobj1(String newQryobj1) {
        this.qryobj1 = newQryobj1;
    }

    public String getQryobj2pk() {
        return this.qryobj2pk;
    }

    public void setQryobj2pk(String newQryobj2pk) {
        this.qryobj2pk = newQryobj2pk;
    }

    public String getQryobj2code() {
        return this.qryobj2code;
    }

    public void setQryobj2code(String newQryobj2code) {
        this.qryobj2code = newQryobj2code;
    }

    public String getQryobj2() {
        return this.qryobj2;
    }

    public void setQryobj2(String newQryobj2) {
        this.qryobj2 = newQryobj2;
    }

    public String getQryobj3pk() {
        return this.qryobj3pk;
    }

    public void setQryobj3pk(String newQryobj3pk) {
        this.qryobj3pk = newQryobj3pk;
    }

    public String getQryobj3code() {
        return this.qryobj3code;
    }

    public void setQryobj3code(String newQryobj3code) {
        this.qryobj3code = newQryobj3code;
    }

    public String getQryobj3() {
        return this.qryobj3;
    }

    public void setQryobj3(String newQryobj3) {
        this.qryobj3 = newQryobj3;
    }

    public String getQryobj4pk() {
        return this.qryobj4pk;
    }

    public void setQryobj4pk(String newQryobj4pk) {
        this.qryobj4pk = newQryobj4pk;
    }

    public String getQryobj4code() {
        return this.qryobj4code;
    }

    public void setQryobj4code(String newQryobj4code) {
        this.qryobj4code = newQryobj4code;
    }

    public String getQryobj4() {
        return this.qryobj4;
    }

    public void setQryobj4(String newQryobj4) {
        this.qryobj4 = newQryobj4;
    }

    public String getBillclass() {
        return this.billclass;
    }

    public void setBillclass(String newBillclass) {
        this.billclass = newBillclass;
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

    public void setBilltype(String newBilltype) {
        this.billtype = newBilltype;
    }

    public String getPk_tradetype() {
        return this.pk_tradetype;
    }

    public void setPk_tradetype(String newPk_tradetype) {
        this.pk_tradetype = newPk_tradetype;
    }

    public String getPk_tradetypeid() {
        return this.pk_tradetypeid;
    }

    public void setPk_tradetypeid(String newPk_tradetypeid) {
        this.pk_tradetypeid = newPk_tradetypeid;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public UFDate getTallydate() {
        return this.tallydate;
    }

    public void setTallydate(UFDate newTallydate) {
        this.tallydate = newTallydate;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate newBilldate) {
        this.billdate = newBilldate;
    }

    public UFDate getConfirmdate() {
        return this.confirmdate;
    }

    public void setConfirmdate(UFDate newConfirmdate) {
        this.confirmdate = newConfirmdate;
    }

    public UFDate getEffectdate() {
        return this.effectdate;
    }

    public void setEffectdate(UFDate newEffectdate) {
        this.effectdate = newEffectdate;
    }

    public String getInvoiceno() {
        return this.invoiceno;
    }

    public void setInvoiceno(String newInvoiceno) {
        this.invoiceno = newInvoiceno;
    }

    public String getVoucherid() {
        return this.voucherid;
    }

    public void setVoucherid(String voucherid) {
        this.voucherid = voucherid;
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

    public String getDealflag() {
        return this.dealflag;
    }

    public void setDealflag(String newDealflag) {
        this.dealflag = newDealflag;
    }

    public String getPk_dealnum() {
        return this.pk_dealnum;
    }

    public void setPk_dealnum(String newPk_dealnum) {
        this.pk_dealnum = newPk_dealnum;
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
        return PK_DETAILLINKQUERY;
    }

    public String getTableName() {
        return "arap_detaillinkquery";
    }

    public static String getDefaultTableName() {
        return "arap_detaillinkquery";
    }
}

