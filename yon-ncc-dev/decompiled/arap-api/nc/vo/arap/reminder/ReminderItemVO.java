/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.reminder;

import java.util.HashMap;
import java.util.Map;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class ReminderItemVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_reminderitem;
    private String pk_billtype = "";
    private UFDate billdate;
    private UFDate expiredate;
    private String material = "";
    private String pk_tradetype = "";
    private UFDouble money_de;
    private UFDouble money_done;
    private UFDouble quantity_bal;
    private UFDouble money_bal;
    private String billno;
    private String invoiceno;
    private String outstoreno;
    private String pk_currtype = "";
    private String propertyid;
    private String pk_recbill;
    private String pk_group;
    private UFDate anadate;
    private UFDouble accage;
    private Integer dr = 0;
    private UFDateTime ts;
    private UFDouble term_money_de;
    private UFDouble term_money_done;
    private UFDouble term_quantity_bal;
    private UFDouble term_money_bal;
    private Map<String, UFDouble> time_money_bal;
    private UFDouble expiredmny;
    private UFDouble unexpiremny;
    private String project;
    public static final String PK_REMINDERITEM = "pk_reminderitem";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String BILLDATE = "billdate";
    public static final String EXPIREDATE = "expiredate";
    public static final String MATERIAL = "material";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String MONEY_DE = "money_de";
    public static final String MONEY_DONE = "money_done";
    public static final String QUANTITY_BAL = "quantity_bal";
    public static final String MONEY_BAL = "money_bal";
    public static final String BILLNO = "billno";
    public static final String INVOICENO = "invoiceno";
    public static final String OUTSTORENO = "outstoreno";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String PROPERTYID = "propertyid";
    public static final String PK_RECBILL = "pk_recbill";
    public static final String PK_GROUP = "pk_group";
    public static final String ACCAGE = "accage";
    public static final String ANADATE = "anadate";
    public static final String EXPIREDMNY = "expiredmny";
    public static final String UNEXPIREMNY = "unexpiremny";
    public static final String PROJECT = "project";
    public static final String TERM_MONEY_DE = "term_money_de";
    public static final String TERM_MONEY_DONE = "term_money_done";
    public static final String TERM_MONEY_BAL = "term_money_bal";
    public static final String TERM_QUANTITY_BAL = "term_quantity_bal";

    public UFDouble getTerm_money_de() {
        return this.term_money_de;
    }

    public void setTerm_money_de(UFDouble termMoneyDe) {
        this.term_money_de = termMoneyDe;
    }

    public UFDouble getTerm_money_done() {
        return this.term_money_done;
    }

    public void setTerm_money_done(UFDouble termMoneyDone) {
        this.term_money_done = termMoneyDone;
    }

    public UFDouble getTerm_quantity_bal() {
        return this.term_quantity_bal;
    }

    public void setTerm_quantity_bal(UFDouble termQuantityBal) {
        this.term_quantity_bal = termQuantityBal;
    }

    public UFDouble getTerm_money_bal() {
        return this.term_money_bal;
    }

    public void setTerm_money_bal(UFDouble termMoneyBal) {
        this.term_money_bal = termMoneyBal;
    }

    public UFDate getAnadate() {
        return this.anadate;
    }

    public void setAnadate(UFDate anadate) {
        this.anadate = anadate;
    }

    public UFDouble getAccage() {
        return this.accage;
    }

    public void setAccage(UFDouble accage) {
        this.accage = accage;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String pkGroup) {
        this.pk_group = pkGroup;
    }

    public Map<String, UFDouble> getTime_money_bal() {
        if (this.time_money_bal == null) {
            this.time_money_bal = new HashMap<String, UFDouble>();
        }
        return this.time_money_bal;
    }

    public void setTime_money_bal(Map<String, UFDouble> timeMoneyBal) {
        this.time_money_bal = timeMoneyBal;
    }

    public String getPk_reminderitem() {
        return this.pk_reminderitem;
    }

    public void setPk_reminderitem(String newPk_reminderitem) {
        this.pk_reminderitem = newPk_reminderitem;
    }

    public String getPk_billtype() {
        return this.pk_billtype;
    }

    public void setPk_billtype(String newPk_billtype) {
        this.pk_billtype = newPk_billtype;
    }

    public UFDate getBilldate() {
        return this.billdate;
    }

    public void setBilldate(UFDate newBilldate) {
        this.billdate = newBilldate;
    }

    public UFDate getExpiredate() {
        return this.expiredate;
    }

    public void setExpiredate(UFDate newExpiredate) {
        this.expiredate = newExpiredate;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String newMaterial) {
        this.material = newMaterial;
    }

    public String getPk_tradetype() {
        return this.pk_tradetype;
    }

    public void setPk_tradetype(String newPk_tradetype) {
        this.pk_tradetype = newPk_tradetype;
    }

    public UFDouble getMoney_de() {
        return this.money_de;
    }

    public void setMoney_de(UFDouble newMoney_de) {
        this.money_de = newMoney_de;
    }

    public UFDouble getMoney_done() {
        return this.money_done;
    }

    public void setMoney_done(UFDouble newMoney_done) {
        this.money_done = newMoney_done;
    }

    public UFDouble getQuantity_bal() {
        return this.quantity_bal;
    }

    public void setQuantity_bal(UFDouble newQuantity_bal) {
        this.quantity_bal = newQuantity_bal;
    }

    public UFDouble getMoney_bal() {
        return this.money_bal;
    }

    public void setMoney_bal(UFDouble newMoney_bal) {
        this.money_bal = newMoney_bal;
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

    public String getOutstoreno() {
        return this.outstoreno;
    }

    public void setOutstoreno(String newOutstoreno) {
        this.outstoreno = newOutstoreno;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public String getPropertyid() {
        return this.propertyid;
    }

    public void setPropertyid(String newPropertyid) {
        this.propertyid = newPropertyid;
    }

    public String getPk_recbill() {
        return this.pk_recbill;
    }

    public void setPk_recbill(String newPk_recbill) {
        this.pk_recbill = newPk_recbill;
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
        return PK_REMINDERITEM;
    }

    public String getTableName() {
        return "reminderitem";
    }

    public static String getDefaultTableName() {
        return "reminderitem";
    }

    public void setUnexpiremny(UFDouble unexpiremny) {
        this.unexpiremny = unexpiremny;
    }

    public UFDouble getUnexpiremny() {
        return this.unexpiremny;
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("arap.ReminderItemVO");
        return meta;
    }

    public Object getAttributeValue(String arg0) {
        return super.getAttributeValue(arg0);
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProject() {
        return this.project;
    }

    public void setExpiredmny(UFDouble expiredmny) {
        this.expiredmny = expiredmny;
    }

    public UFDouble getExpiredmny() {
        return this.expiredmny;
    }
}

