/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.billconfer;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class BillVO
extends SuperVO {
    private static final long serialVersionUID = 1L;

    public String getPk_org() {
        return (String)this.getAttributeValue("pk_org");
    }

    public void setPk_org(String newPk_org) {
        this.setAttributeValue("pk_org", newPk_org);
    }

    public String getPk_fiorg() {
        return (String)this.getAttributeValue("pk_fiorg");
    }

    public void setPk_fiorg(String newPk_fiorg) {
        this.setAttributeValue("pk_fiorg", newPk_fiorg);
    }

    public String getPk_pcorg() {
        return (String)this.getAttributeValue("pk_pcorg");
    }

    public void setPk_pcorg(String newPk_pcorg) {
        this.setAttributeValue("pk_pcorg", newPk_pcorg);
    }

    public String getPk_group() {
        return (String)this.getAttributeValue("pk_group");
    }

    public void setPk_group(String newPk_group) {
        this.setAttributeValue("pk_group", newPk_group);
    }

    public String getPk_paybill() {
        return (String)this.getAttributeValue("pk_paybill");
    }

    public void setPk_paybill(String newPk_paybill) {
        this.setAttributeValue("pk_paybill", newPk_paybill);
    }

    public String getBill_no() {
        return (String)this.getAttributeValue("bill_no");
    }

    public void setBill_no(String newBill_no) {
        this.setAttributeValue("bill_no", newBill_no);
    }

    public String getTrade_type() {
        return (String)this.getAttributeValue("trade_type");
    }

    public void setTrade_type(String newTrade_type) {
        this.setAttributeValue("trade_type", newTrade_type);
    }

    public UFDate getBill_date() {
        return (UFDate)this.getAttributeValue("bill_date");
    }

    public void setBill_date(UFDate newBill_date) {
        this.setAttributeValue("bill_date", newBill_date);
    }

    public String getSource_flag() {
        return (String)this.getAttributeValue("source_flag");
    }

    public void setSource_flag(String newSource_flag) {
        this.setAttributeValue("source_flag", newSource_flag);
    }

    public Integer getBill_status() {
        return (Integer)this.getAttributeValue("bill_status");
    }

    public void setBill_status(Integer newBill_status) {
        this.setAttributeValue("bill_status", newBill_status);
    }

    public String getPk_busiflow() {
        return (String)this.getAttributeValue("pk_busiflow");
    }

    public void setPk_busiflow(String newPk_busiflow) {
        this.setAttributeValue("pk_busiflow", newPk_busiflow);
    }

    public String getCreator() {
        return (String)this.getAttributeValue("creator");
    }

    public void setCreator(String newCreator) {
        this.setAttributeValue("creator", newCreator);
    }

    public UFDateTime getCreationtime() {
        return (UFDateTime)this.getAttributeValue("creationtime");
    }

    public void setCreationtime(UFDateTime newCreationtime) {
        this.setAttributeValue("creationtime", newCreationtime);
    }

    public String getModifier() {
        return (String)this.getAttributeValue("modifier");
    }

    public void setModifier(String newModifier) {
        this.setAttributeValue("modifier", newModifier);
    }

    public UFDateTime getModifiedtime() {
        return (UFDateTime)this.getAttributeValue("modifiedtime");
    }

    public void setModifiedtime(UFDateTime newModifiedtime) {
        this.setAttributeValue("modifiedtime", newModifiedtime);
    }

    public String getApprover() {
        return (String)this.getAttributeValue("approver");
    }

    public void setApprover(String newApprover) {
        this.setAttributeValue("approver", newApprover);
    }

    public UFDateTime getApprove_date() {
        return (UFDateTime)this.getAttributeValue("approve_date");
    }

    public void setApprove_date(UFDateTime newApprove_date) {
        this.setAttributeValue("approve_date", newApprove_date);
    }

    public String getBillmaker() {
        return (String)this.getAttributeValue("billmaker");
    }

    public void setBillmaker(String newBillmaker) {
        this.setAttributeValue("billmaker", newBillmaker);
    }

    public UFDate getBillmaker_date() {
        return (UFDate)this.getAttributeValue("billmaker_date");
    }

    public void setBillmaker_date(UFDate newBillmaker_date) {
        this.setAttributeValue("billmaker_date", newBillmaker_date);
    }

    public UFDouble getPrimal_money() {
        return (UFDouble)this.getAttributeValue("primal_money");
    }

    public void setPrimal_money(UFDouble newPrimal_money) {
        this.setAttributeValue("primal_money", newPrimal_money);
    }

    public UFDouble getLocal_money() {
        return (UFDouble)this.getAttributeValue("local_money");
    }

    public void setLocal_money(UFDouble newLocal_money) {
        this.setAttributeValue("local_money", newLocal_money);
    }

    public String getDef1() {
        return (String)this.getAttributeValue("def1");
    }

    public void setDef1(String newDef1) {
        this.setAttributeValue("def1", newDef1);
    }

    public String getDef2() {
        return (String)this.getAttributeValue("def2");
    }

    public void setDef2(String newDef2) {
        this.setAttributeValue("def2", newDef2);
    }

    public String getDef3() {
        return (String)this.getAttributeValue("def3");
    }

    public void setDef3(String newDef3) {
        this.setAttributeValue("def3", newDef3);
    }

    public String getDef4() {
        return (String)this.getAttributeValue("def4");
    }

    public void setDef4(String newDef4) {
        this.setAttributeValue("def4", newDef4);
    }

    public String getDef5() {
        return (String)this.getAttributeValue("def5");
    }

    public void setDef5(String newDef5) {
        this.setAttributeValue("def5", newDef5);
    }

    public String getDef6() {
        return (String)this.getAttributeValue("def6");
    }

    public void setDef6(String newDef6) {
        this.setAttributeValue("def6", newDef6);
    }

    public String getDef7() {
        return (String)this.getAttributeValue("def7");
    }

    public void setDef7(String newDef7) {
        this.setAttributeValue("def7", newDef7);
    }

    public String getDef8() {
        return (String)this.getAttributeValue("def8");
    }

    public void setDef8(String newDef8) {
        this.setAttributeValue("def8", newDef8);
    }

    public String getDef9() {
        return (String)this.getAttributeValue("def9");
    }

    public void setDef9(String newDef9) {
        this.setAttributeValue("def9", newDef9);
    }

    public String getDef10() {
        return (String)this.getAttributeValue("def10");
    }

    public void setDef10(String newDef10) {
        this.setAttributeValue("def10", newDef10);
    }

    public String getDef11() {
        return (String)this.getAttributeValue("def11");
    }

    public void setDef11(String newDef11) {
        this.setAttributeValue("def11", newDef11);
    }

    public String getDef12() {
        return (String)this.getAttributeValue("def12");
    }

    public void setDef12(String newDef12) {
        this.setAttributeValue("def12", newDef12);
    }

    public String getDef13() {
        return (String)this.getAttributeValue("def13");
    }

    public void setDef13(String newDef13) {
        this.setAttributeValue("def13", newDef13);
    }

    public String getDef14() {
        return (String)this.getAttributeValue("def14");
    }

    public void setDef14(String newDef14) {
        this.setAttributeValue("def14", newDef14);
    }

    public String getDef15() {
        return (String)this.getAttributeValue("def15");
    }

    public void setDef15(String newDef15) {
        this.setAttributeValue("def15", newDef15);
    }

    public String getDef16() {
        return (String)this.getAttributeValue("def16");
    }

    public void setDef16(String newDef16) {
        this.setAttributeValue("def16", newDef16);
    }

    public String getDef17() {
        return (String)this.getAttributeValue("def17");
    }

    public void setDef17(String newDef17) {
        this.setAttributeValue("def17", newDef17);
    }

    public String getDef18() {
        return (String)this.getAttributeValue("def18");
    }

    public void setDef18(String newDef18) {
        this.setAttributeValue("def18", newDef18);
    }

    public String getDef19() {
        return (String)this.getAttributeValue("def19");
    }

    public void setDef19(String newDef19) {
        this.setAttributeValue("def19", newDef19);
    }

    public String getDef20() {
        return (String)this.getAttributeValue("def20");
    }

    public void setDef20(String newDef20) {
        this.setAttributeValue("def20", newDef20);
    }

    public String getBill_accounting_year() {
        return (String)this.getAttributeValue("bill_accounting_year");
    }

    public void setBill_accounting_year(String newBill_accounting_year) {
        this.setAttributeValue("bill_accounting_year", newBill_accounting_year);
    }

    public String getBill_accounting_period() {
        return (String)this.getAttributeValue("bill_accounting_period");
    }

    public void setBill_accounting_period(String newBill_accounting_period) {
        this.setAttributeValue("bill_accounting_period", newBill_accounting_period);
    }

    public String getAudit_accounting_year() {
        return (String)this.getAttributeValue("audit_accounting_year");
    }

    public void setAudit_accounting_year(String newAudit_accounting_year) {
        this.setAttributeValue("audit_accounting_year", newAudit_accounting_year);
    }

    public String getAudit_accounting_period() {
        return (String)this.getAttributeValue("audit_accounting_period");
    }

    public void setAudit_accounting_period(String newAudit_accounting_period) {
        this.setAttributeValue("audit_accounting_period", newAudit_accounting_period);
    }

    public String getPk_signer() {
        return (String)this.getAttributeValue("pk_signer");
    }

    public void setPk_signer(String newPk_signer) {
        this.setAttributeValue("pk_signer", newPk_signer);
    }

    public UFDate getPk_signdate() {
        return (UFDate)this.getAttributeValue("pk_signdate");
    }

    public void setPk_signdate(UFDate newPk_signdate) {
        this.setAttributeValue("pk_signdate", newPk_signdate);
    }

    public String getMemo() {
        return (String)this.getAttributeValue("memo");
    }

    public void setMemo(String newMemo) {
        this.setAttributeValue("memo", newMemo);
    }

    public String getBill_type() {
        return (String)this.getAttributeValue("bill_type");
    }

    public void setBill_type(String newBill_type) {
        this.setAttributeValue("bill_type", newBill_type);
    }

    public Integer getAppendix_no() {
        return (Integer)this.getAttributeValue("appendix_no");
    }

    public void setAppendix_no(Integer newAppendix_no) {
        this.setAttributeValue("appendix_no", newAppendix_no);
    }

    public String getPk_officialprinter() {
        return (String)this.getAttributeValue("pk_officialprinter");
    }

    public void setPk_officialprinter(String newPk_officialprinter) {
        this.setAttributeValue("pk_officialprinter", newPk_officialprinter);
    }

    public UFDate getOfficialprint_date() {
        return (UFDate)this.getAttributeValue("officialprint_date");
    }

    public void setOfficialprint_date(UFDate newOfficialprint_date) {
        this.setAttributeValue("officialprint_date", newOfficialprint_date);
    }

    public String getPk_comfirmer() {
        return (String)this.getAttributeValue("pk_comfirmer");
    }

    public void setPk_comfirmer(String newPk_comfirmer) {
        this.setAttributeValue("pk_comfirmer", newPk_comfirmer);
    }

    public String getBank_comfirm_year() {
        return (String)this.getAttributeValue("bank_comfirm_year");
    }

    public void setBank_comfirm_year(String newBank_comfirm_year) {
        this.setAttributeValue("bank_comfirm_year", newBank_comfirm_year);
    }

    public String getBank_comfirm_period() {
        return (String)this.getAttributeValue("bank_comfirm_period");
    }

    public void setBank_comfirm_period(String newBank_comfirm_period) {
        this.setAttributeValue("bank_comfirm_period", newBank_comfirm_period);
    }

    public String getPk_effect_user() {
        return (String)this.getAttributeValue("pk_effect_user");
    }

    public void setPk_effect_user(String newPk_effect_user) {
        this.setAttributeValue("pk_effect_user", newPk_effect_user);
    }

    public Integer getEffect_flag() {
        return (Integer)this.getAttributeValue("effect_flag");
    }

    public void setEffect_flag(Integer newEffect_flag) {
        this.setAttributeValue("effect_flag", newEffect_flag);
    }

    public String getEffect_year() {
        return (String)this.getAttributeValue("effect_year");
    }

    public void setEffect_year(String newEffect_year) {
        this.setAttributeValue("effect_year", newEffect_year);
    }

    public String getEffect_period() {
        return (String)this.getAttributeValue("effect_period");
    }

    public void setEffect_period(String newEffect_period) {
        this.setAttributeValue("effect_period", newEffect_period);
    }

    public UFDate getEffect_date() {
        return (UFDate)this.getAttributeValue("effect_date");
    }

    public void setEffect_date(UFDate newEffect_date) {
        this.setAttributeValue("effect_date", newEffect_date);
    }

    public String getDef21() {
        return (String)this.getAttributeValue("def21");
    }

    public void setDef21(String newDef21) {
        this.setAttributeValue("def21", newDef21);
    }

    public String getDef23() {
        return (String)this.getAttributeValue("def23");
    }

    public void setDef23(String newDef23) {
        this.setAttributeValue("def23", newDef23);
    }

    public String getDef24() {
        return (String)this.getAttributeValue("def24");
    }

    public void setDef24(String newDef24) {
        this.setAttributeValue("def24", newDef24);
    }

    public String getDef25() {
        return (String)this.getAttributeValue("def25");
    }

    public void setDef25(String newDef25) {
        this.setAttributeValue("def25", newDef25);
    }

    public String getDef26() {
        return (String)this.getAttributeValue("def26");
    }

    public void setDef26(String newDef26) {
        this.setAttributeValue("def26", newDef26);
    }

    public String getDef27() {
        return (String)this.getAttributeValue("def27");
    }

    public void setDef27(String newDef27) {
        this.setAttributeValue("def27", newDef27);
    }

    public String getDef28() {
        return (String)this.getAttributeValue("def28");
    }

    public void setDef28(String newDef28) {
        this.setAttributeValue("def28", newDef28);
    }

    public String getDef29() {
        return (String)this.getAttributeValue("def29");
    }

    public void setDef29(String newDef29) {
        this.setAttributeValue("def29", newDef29);
    }

    public String getDef30() {
        return (String)this.getAttributeValue("def30");
    }

    public void setDef30(String newDef30) {
        this.setAttributeValue("def30", newDef30);
    }

    public String getDef22() {
        return (String)this.getAttributeValue("def22");
    }

    public void setDef22(String newDef22) {
        this.setAttributeValue("def22", newDef22);
    }

    public String getPayman() {
        return (String)this.getAttributeValue("payman");
    }

    public void setPayman(String newPayman) {
        this.setAttributeValue("payman", newPayman);
    }

    public Integer getPayway() {
        return (Integer)this.getAttributeValue("payway");
    }

    public void setPayway(Integer newPayway) {
        this.setAttributeValue("payway", newPayway);
    }

    public Integer getPaystatus() {
        return (Integer)this.getAttributeValue("paystatus");
    }

    public void setPaystatus(Integer newPaystatus) {
        this.setAttributeValue("paystatus", newPaystatus);
    }

    public UFDate getPaydate() {
        return (UFDate)this.getAttributeValue("paydate");
    }

    public void setPaydate(UFDate newPaydate) {
        this.setAttributeValue("paydate", newPaydate);
    }

    public String getSettlenum() {
        return (String)this.getAttributeValue("settlenum");
    }

    public void setSettlenum(String newSettlenum) {
        this.setAttributeValue("settlenum", newSettlenum);
    }

    public UFBoolean getIsnetready() {
        return (UFBoolean)this.getAttributeValue("isnetready");
    }

    public void setIsnetready(UFBoolean newIsnetready) {
        this.setAttributeValue("isnetready", newIsnetready);
    }

    public UFBoolean getIsreded() {
        return (UFBoolean)this.getAttributeValue("isreded");
    }

    public void setIsreded(UFBoolean newIsreded) {
        this.setAttributeValue("isreded", newIsreded);
    }

    public String getPk_upbill() {
        return (String)this.getAttributeValue("pk_upbill");
    }

    public void setPk_upbill(String newPk_upbill) {
        this.setAttributeValue("pk_upbill", newPk_upbill);
    }

    public String getUp_tradetype() {
        return (String)this.getAttributeValue("up_tradetype");
    }

    public void setUp_tradetype(String newUp_tradetype) {
        this.setAttributeValue("up_tradetype", newUp_tradetype);
    }

    public String getUp_billtype() {
        return (String)this.getAttributeValue("up_billtype");
    }

    public void setUp_billtype(String newUp_billtype) {
        this.setAttributeValue("up_billtype", newUp_billtype);
    }

    public String getPk_downbill() {
        return (String)this.getAttributeValue("pk_downbill");
    }

    public void setPk_downbill(String newPk_downbill) {
        this.setAttributeValue("pk_downbill", newPk_downbill);
    }

    public String getDown_tradetype() {
        return (String)this.getAttributeValue("down_tradetype");
    }

    public void setDown_tradetype(String newDown_tradetype) {
        this.setAttributeValue("down_tradetype", newDown_tradetype);
    }

    public String getDown_billtype() {
        return (String)this.getAttributeValue("down_billtype");
    }

    public void setDown_billtype(String newDown_billtype) {
        this.setAttributeValue("down_billtype", newDown_billtype);
    }

    public String getPk_org_v() {
        return (String)this.getAttributeValue("pk_org_v");
    }

    public void setPk_org_v(String newPk_org_v) {
        this.setAttributeValue("pk_org_v", newPk_org_v);
    }

    public String getPk_fiorg_v() {
        return (String)this.getAttributeValue("pk_fiorg_v");
    }

    public void setPk_fiorg_v(String newPk_fiorg_v) {
        this.setAttributeValue("pk_fiorg_v", newPk_fiorg_v);
    }

    public String getPk_pcorg_v() {
        return (String)this.getAttributeValue("pk_pcorg_v");
    }

    public void setPk_pcorg_v(String newPk_pcorg_v) {
        this.setAttributeValue("pk_pcorg_v", newPk_pcorg_v);
    }

    public UFDouble getGroup_local() {
        return (UFDouble)this.getAttributeValue("group_local");
    }

    public void setGroup_local(UFDouble newGroup_local) {
        this.setAttributeValue("group_local", newGroup_local);
    }

    public UFDouble getGlobal_local() {
        return (UFDouble)this.getAttributeValue("global_local");
    }

    public void setGlobal_local(UFDouble newGlobal_local) {
        this.setAttributeValue("global_local", newGlobal_local);
    }

    public UFDouble getGroup_rate() {
        return (UFDouble)this.getAttributeValue("group_rate");
    }

    public void setGroup_rate(UFDouble newGroup_rate) {
        this.setAttributeValue("group_rate", newGroup_rate);
    }

    public UFDouble getGlobal_rate() {
        return (UFDouble)this.getAttributeValue("global_rate");
    }

    public void setGlobal_rate(UFDouble newGlobal_rate) {
        this.setAttributeValue("global_rate", newGlobal_rate);
    }

    public String getVoucher() {
        return (String)this.getAttributeValue("voucher");
    }

    public void setVoucher(String newVoucher) {
        this.setAttributeValue("voucher", newVoucher);
    }

    public Integer getObjecttype() {
        return (Integer)this.getAttributeValue("objecttype");
    }

    public void setObjecttype(Integer newObjecttype) {
        this.setAttributeValue("objecttype", newObjecttype);
    }

    public String getPk_subjct() {
        return (String)this.getAttributeValue("pk_subjct");
    }

    public void setPk_subjct(String newPk_subjct) {
        this.setAttributeValue("pk_subjct", newPk_subjct);
    }

    public String getPk_dept() {
        return (String)this.getAttributeValue("pk_dept");
    }

    public void setPk_dept(String newPk_dept) {
        this.setAttributeValue("pk_dept", newPk_dept);
    }

    public String getPk_customer() {
        return (String)this.getAttributeValue("pk_customer");
    }

    public void setPk_customer(String newPk_customer) {
        this.setAttributeValue("pk_customer", newPk_customer);
    }

    public String getPk_supplier() {
        return (String)this.getAttributeValue("pk_supplier");
    }

    public void setPk_supplier(String newPk_supplier) {
        this.setAttributeValue("pk_supplier", newPk_supplier);
    }

    public String getPk_busiman() {
        return (String)this.getAttributeValue("pk_busiman");
    }

    public void setPk_busiman(String newPk_busiman) {
        this.setAttributeValue("pk_busiman", newPk_busiman);
    }

    public String getPk_balatype() {
        return (String)this.getAttributeValue("pk_balatype");
    }

    public void setPk_balatype(String newPk_balatype) {
        this.setAttributeValue("pk_balatype", newPk_balatype);
    }

    public String getPk_account() {
        return (String)this.getAttributeValue("pk_account");
    }

    public void setPk_account(String newPk_account) {
        this.setAttributeValue("pk_account", newPk_account);
    }

    public String getPk_oppaccount() {
        return (String)this.getAttributeValue("pk_oppaccount");
    }

    public void setPk_oppaccount(String newPk_oppaccount) {
        this.setAttributeValue("pk_oppaccount", newPk_oppaccount);
    }

    public String getPk_currtype() {
        return (String)this.getAttributeValue("pk_currtype");
    }

    public void setPk_currtype(String newPk_currtype) {
        this.setAttributeValue("pk_currtype", newPk_currtype);
    }

    public UFDouble getLocal_rate() {
        return (UFDouble)this.getAttributeValue("local_rate");
    }

    public void setLocal_rate(UFDouble newLocal_rate) {
        this.setAttributeValue("local_rate", newLocal_rate);
    }

    public UFDateTime getDz_date() {
        return (UFDateTime)this.getAttributeValue("dz_date");
    }

    public void setDz_date(UFDateTime newDz_date) {
        this.setAttributeValue("dz_date", newDz_date);
    }

    public String getPayperson() {
        return (String)this.getAttributeValue("payperson");
    }

    public void setPayperson(String newPayperson) {
        this.setAttributeValue("payperson", newPayperson);
    }

    public String getRes_issue() {
        return (String)this.getAttributeValue("res_issue");
    }

    public void setRes_issue(String newRes_issue) {
        this.setAttributeValue("res_issue", newRes_issue);
    }

    public String getNote_no() {
        return (String)this.getAttributeValue("note_no");
    }

    public void setNote_no(String newNote_no) {
        this.setAttributeValue("note_no", newNote_no);
    }

    public String getNote_type() {
        return (String)this.getAttributeValue("note_type");
    }

    public void setNote_type(String newNote_type) {
        this.setAttributeValue("note_type", newNote_type);
    }

    public String getPk_recproject() {
        return (String)this.getAttributeValue("pk_recproject");
    }

    public void setPk_recproject(String newPk_recproject) {
        this.setAttributeValue("pk_recproject", newPk_recproject);
    }

    public String getCash_item() {
        return (String)this.getAttributeValue("cash_item");
    }

    public void setCash_item(String newCash_item) {
        this.setAttributeValue("cash_item", newCash_item);
    }

    public String getBankroll_projet() {
        return (String)this.getAttributeValue("bankroll_projet");
    }

    public void setBankroll_projet(String newBankroll_projet) {
        this.setAttributeValue("bankroll_projet", newBankroll_projet);
    }

    public UFBoolean getIsrefused() {
        return (UFBoolean)this.getAttributeValue("isrefused");
    }

    public void setIsrefused(UFBoolean newIsrefused) {
        this.setAttributeValue("isrefused", newIsrefused);
    }

    public UFDate getJz_date() {
        return (UFDate)this.getAttributeValue("jz_date");
    }

    public void setJz_date(UFDate newJz_date) {
        this.setAttributeValue("jz_date", newJz_date);
    }

    public String getYs_period() {
        return (String)this.getAttributeValue("ys_period");
    }

    public void setYs_period(String newYs_period) {
        this.setAttributeValue("ys_period", newYs_period);
    }

    public UFDate getSavedate() {
        return (UFDate)this.getAttributeValue("savedate");
    }

    public void setSavedate(UFDate newSavedate) {
        this.setAttributeValue("savedate", newSavedate);
    }

    public UFBoolean getIs_cf() {
        return (UFBoolean)this.getAttributeValue("is_cf");
    }

    public void setIs_cf(UFBoolean newIs_cf) {
        this.setAttributeValue("is_cf", newIs_cf);
    }

    public String getPk_jobid() {
        return (String)this.getAttributeValue("pk_jobid");
    }

    public void setPk_jobid(String newPk_jobid) {
        this.setAttributeValue("pk_jobid", newPk_jobid);
    }

    public String getMon_account() {
        return (String)this.getAttributeValue("mon_account");
    }

    public void setMon_account(String newMon_account) {
        this.setAttributeValue("mon_account", newMon_account);
    }

    public Integer getDr() {
        return (Integer)this.getAttributeValue("dr");
    }

    public void setDr(Integer newDr) {
        this.setAttributeValue("dr", newDr);
    }

    public UFDateTime getTs() {
        return (UFDateTime)this.getAttributeValue("ts");
    }

    public void setTs(UFDateTime newTs) {
        this.setAttributeValue("ts", newTs);
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return "pk_paybill";
    }

    public String getTableName() {
        return "cmp_paybill";
    }

    public UFDate getCf_begindate() {
        return (UFDate)this.getAttributeValue("cf_begindate");
    }

    public void setCf_begindate(UFDate newCf_begindate) {
        this.setAttributeValue("cf_begindate", newCf_begindate);
    }

    public UFDate getCf_enddate() {
        return (UFDate)this.getAttributeValue("cf_enddate");
    }

    public void setCf_enddate(UFDate newCf_enddate) {
        this.setAttributeValue("cf_enddate", newCf_enddate);
    }

    public IVOMeta getMetaData() {
        IVOMeta meta = VOMetaFactory.getInstance().getVOMeta("cmp.cmp_paybill");
        return meta;
    }
}

