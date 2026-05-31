/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.goldentax;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class GoldTaxHeadVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    public static final String ACCOUNT = "account";
    public static final String BANKNAME = "bankname";
    public static final String BILLDATE = "billdate";
    public static final String CHECKER = "checker";
    public static final String CODE = "code";
    public static final String CUSTOMERID = "customerid";
    public static final String CUSTOMERNAME = "customername";
    public static final String DR = "dr";
    public static final String MEMO = "memo";
    public static final String PAYEE = "payee";
    public static final String PK_GOLDTAX = "pk_goldtax";
    public static final String ROWINVNAME = "rowinvname";
    public static final String BODYNUM = "bodynum";
    public static final String SALEADDR = "saleaddr";
    public static final String SALEPHONE = "salephone";
    public static final String SELLACCOUNT = "sellaccount";
    public static final String SELLCORPNAME = "sellcorpname";
    public static final String TAXBILLNO = "taxbillno";
    public static final String TAXPAYERID = "taxpayerid";
    public static final String TS = "ts";
    public static final String VDEF1 = "vdef1";
    public static final String VDEF10 = "vdef10";
    public static final String VDEF11 = "vdef11";
    public static final String VDEF12 = "vdef12";
    public static final String VDEF13 = "vdef13";
    public static final String VDEF14 = "vdef14";
    public static final String VDEF15 = "vdef15";
    public static final String VDEF16 = "vdef16";
    public static final String VDEF17 = "vdef17";
    public static final String VDEF18 = "vdef18";
    public static final String VDEF19 = "vdef19";
    public static final String VDEF2 = "vdef2";
    public static final String VDEF20 = "vdef20";
    public static final String VDEF3 = "vdef3";
    public static final String VDEF4 = "vdef4";
    public static final String VDEF5 = "vdef5";
    public static final String VDEF6 = "vdef6";
    public static final String VDEF7 = "vdef7";
    public static final String VDEF8 = "vdef8";
    public static final String VDEF9 = "vdef9";

    public String getAccount() {
        return (String)this.getAttributeValue(ACCOUNT);
    }

    public String getBankname() {
        return (String)this.getAttributeValue(BANKNAME);
    }

    public String getBilldate() {
        return (String)this.getAttributeValue(BILLDATE);
    }

    public String getChecker() {
        return (String)this.getAttributeValue(CHECKER);
    }

    public String getCode() {
        return (String)this.getAttributeValue(CODE);
    }

    public String getCustomerid() {
        return (String)this.getAttributeValue(CUSTOMERID);
    }

    public String getCustomername() {
        return (String)this.getAttributeValue(CUSTOMERNAME);
    }

    public Integer getDr() {
        return (Integer)this.getAttributeValue(DR);
    }

    public String getMemo() {
        return (String)this.getAttributeValue(MEMO);
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arapgoldentax");
    }

    public String getPayee() {
        return (String)this.getAttributeValue(PAYEE);
    }

    public String getPk_goldtax() {
        return (String)this.getAttributeValue(PK_GOLDTAX);
    }

    public String getRowinvname() {
        return (String)this.getAttributeValue(ROWINVNAME);
    }

    public Integer getBodynum() {
        return (Integer)this.getAttributeValue(BODYNUM);
    }

    public String getSaleaddr() {
        return (String)this.getAttributeValue(SALEADDR);
    }

    public String getSalephone() {
        return (String)this.getAttributeValue(SALEPHONE);
    }

    public String getSellaccount() {
        return (String)this.getAttributeValue(SELLACCOUNT);
    }

    public String getSellcorpname() {
        return (String)this.getAttributeValue(SELLCORPNAME);
    }

    public String getTaxbillno() {
        return (String)this.getAttributeValue(TAXBILLNO);
    }

    public String getTaxpayerid() {
        return (String)this.getAttributeValue(TAXPAYERID);
    }

    public UFDateTime getTs() {
        return (UFDateTime)this.getAttributeValue(TS);
    }

    public String getVdef1() {
        return (String)this.getAttributeValue(VDEF1);
    }

    public String getVdef10() {
        return (String)this.getAttributeValue(VDEF10);
    }

    public String getVdef11() {
        return (String)this.getAttributeValue(VDEF11);
    }

    public String getVdef12() {
        return (String)this.getAttributeValue(VDEF12);
    }

    public String getVdef13() {
        return (String)this.getAttributeValue(VDEF13);
    }

    public String getVdef14() {
        return (String)this.getAttributeValue(VDEF14);
    }

    public String getVdef15() {
        return (String)this.getAttributeValue(VDEF15);
    }

    public String getVdef16() {
        return (String)this.getAttributeValue(VDEF16);
    }

    public String getVdef17() {
        return (String)this.getAttributeValue(VDEF17);
    }

    public String getVdef18() {
        return (String)this.getAttributeValue(VDEF18);
    }

    public String getVdef19() {
        return (String)this.getAttributeValue(VDEF19);
    }

    public String getVdef2() {
        return (String)this.getAttributeValue(VDEF2);
    }

    public String getVdef20() {
        return (String)this.getAttributeValue(VDEF20);
    }

    public String getVdef3() {
        return (String)this.getAttributeValue(VDEF3);
    }

    public String getVdef4() {
        return (String)this.getAttributeValue(VDEF4);
    }

    public String getVdef5() {
        return (String)this.getAttributeValue(VDEF5);
    }

    public String getVdef6() {
        return (String)this.getAttributeValue(VDEF6);
    }

    public String getVdef7() {
        return (String)this.getAttributeValue(VDEF7);
    }

    public String getVdef8() {
        return (String)this.getAttributeValue(VDEF8);
    }

    public String getVdef9() {
        return (String)this.getAttributeValue(VDEF9);
    }

    public void setAccount(String account) {
        this.setAttributeValue(ACCOUNT, account);
    }

    public void setBankname(String bankname) {
        this.setAttributeValue(BANKNAME, bankname);
    }

    public void setBilldate(String billdate) {
        this.setAttributeValue(BILLDATE, billdate);
    }

    public void setChecker(String checker) {
        this.setAttributeValue(CHECKER, checker);
    }

    public void setCode(String code) {
        this.setAttributeValue(CODE, code);
    }

    public void setCustomerid(String customerid) {
        this.setAttributeValue(CUSTOMERID, customerid);
    }

    public void setCustomername(String customername) {
        this.setAttributeValue(CUSTOMERNAME, customername);
    }

    public void setDr(Integer dr) {
        this.setAttributeValue(DR, dr);
    }

    public void setMemo(String memo) {
        this.setAttributeValue(MEMO, memo);
    }

    public void setPayee(String payee) {
        this.setAttributeValue(PAYEE, payee);
    }

    public void setPk_goldtax(String pk_goldtax) {
        this.setAttributeValue(PK_GOLDTAX, pk_goldtax);
    }

    public void setRowinvname(String rowinvname) {
        this.setAttributeValue(ROWINVNAME, rowinvname);
    }

    public void setBodynum(Integer bodynum) {
        this.setAttributeValue(BODYNUM, bodynum);
    }

    public void setSaleaddr(String saleaddr) {
        this.setAttributeValue(SALEADDR, saleaddr);
    }

    public void setSalephone(String salephone) {
        this.setAttributeValue(SALEPHONE, salephone);
    }

    public void setSellaccount(String sellaccount) {
        this.setAttributeValue(SELLACCOUNT, sellaccount);
    }

    public void setSellcorpname(String sellcorpname) {
        this.setAttributeValue(SELLCORPNAME, sellcorpname);
    }

    public void setTaxbillno(String taxbillno) {
        this.setAttributeValue(TAXBILLNO, taxbillno);
    }

    public void setTaxpayerid(String taxpayerid) {
        this.setAttributeValue(TAXPAYERID, taxpayerid);
    }

    public void setTs(UFDateTime ts) {
        this.setAttributeValue(TS, ts);
    }

    public void setVdef1(String vdef1) {
        this.setAttributeValue(VDEF1, vdef1);
    }

    public void setVdef10(String vdef10) {
        this.setAttributeValue(VDEF10, vdef10);
    }

    public void setVdef11(String vdef11) {
        this.setAttributeValue(VDEF11, vdef11);
    }

    public void setVdef12(String vdef12) {
        this.setAttributeValue(VDEF12, vdef12);
    }

    public void setVdef13(String vdef13) {
        this.setAttributeValue(VDEF13, vdef13);
    }

    public void setVdef14(String vdef14) {
        this.setAttributeValue(VDEF14, vdef14);
    }

    public void setVdef15(String vdef15) {
        this.setAttributeValue(VDEF15, vdef15);
    }

    public void setVdef16(String vdef16) {
        this.setAttributeValue(VDEF16, vdef16);
    }

    public void setVdef17(String vdef17) {
        this.setAttributeValue(VDEF17, vdef17);
    }

    public void setVdef18(String vdef18) {
        this.setAttributeValue(VDEF18, vdef18);
    }

    public void setVdef19(String vdef19) {
        this.setAttributeValue(VDEF19, vdef19);
    }

    public void setVdef2(String vdef2) {
        this.setAttributeValue(VDEF2, vdef2);
    }

    public void setVdef20(String vdef20) {
        this.setAttributeValue(VDEF20, vdef20);
    }

    public void setVdef3(String vdef3) {
        this.setAttributeValue(VDEF3, vdef3);
    }

    public void setVdef4(String vdef4) {
        this.setAttributeValue(VDEF4, vdef4);
    }

    public void setVdef5(String vdef5) {
        this.setAttributeValue(VDEF5, vdef5);
    }

    public void setVdef6(String vdef6) {
        this.setAttributeValue(VDEF6, vdef6);
    }

    public void setVdef7(String vdef7) {
        this.setAttributeValue(VDEF7, vdef7);
    }

    public void setVdef8(String vdef8) {
        this.setAttributeValue(VDEF8, vdef8);
    }

    public void setVdef9(String vdef9) {
        this.setAttributeValue(VDEF9, vdef9);
    }
}

