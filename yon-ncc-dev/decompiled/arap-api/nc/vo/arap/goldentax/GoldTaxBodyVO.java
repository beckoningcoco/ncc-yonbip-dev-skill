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
package nc.vo.arap.goldentax;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class GoldTaxBodyVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    public static final String CCURRENCYID = "ccurrencyid";
    public static final String CUNITID = "cunitid";
    public static final String DISCOUNTMNY = "discountmny";
    public static final String DISCOUNTRATE = "discountrate";
    public static final String DISCOUNTTAXMNY = "discounttaxmny";
    public static final String DR = "dr";
    public static final String INVBASEID = "invbaseid";
    public static final String INVCLASSID = "invclassid";
    public static final String INVCLASSNAME = "invclassname";
    public static final String INVNAME = "invname";
    public static final String INVSPEC = "invspec";
    public static final String MONEY = "money";
    public static final String NOTAXMNY = "notaxmny";
    public static final String NOTAXPRICE = "notaxprice";
    public static final String QUENTITY = "quentity";
    public static final String PK_GOLDTAX = "pk_goldtax";
    public static final String PK_GOLDTAX_B = "pk_goldtax_b";
    public static final String PRICE = "price";
    public static final String PRICEMODE = "pricemode";
    public static final String QUOTEUNITNAME = "quoteunitname";
    public static final String TAXITEMS = "taxitems";
    public static final String TAXMNY = "taxmny";
    public static final String TAXRATE = "taxrate";
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

    public String getCcurrencyid() {
        return (String)this.getAttributeValue(CCURRENCYID);
    }

    public String getCunitid() {
        return (String)this.getAttributeValue(CUNITID);
    }

    public UFDouble getDiscountmny() {
        return (UFDouble)this.getAttributeValue(DISCOUNTMNY);
    }

    public UFDouble getDiscountrate() {
        return (UFDouble)this.getAttributeValue(DISCOUNTRATE);
    }

    public UFDouble getDiscounttaxmny() {
        return (UFDouble)this.getAttributeValue(DISCOUNTTAXMNY);
    }

    public Integer getDr() {
        return (Integer)this.getAttributeValue(DR);
    }

    public String getInvbaseid() {
        return (String)this.getAttributeValue(INVBASEID);
    }

    public String getInvclassid() {
        return (String)this.getAttributeValue(INVCLASSID);
    }

    public String getInvclassname() {
        return (String)this.getAttributeValue(INVCLASSNAME);
    }

    public String getInvname() {
        return (String)this.getAttributeValue(INVNAME);
    }

    public String getInvspec() {
        return (String)this.getAttributeValue(INVSPEC);
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arapgoldentax_b");
    }

    public UFDouble getMoney() {
        return (UFDouble)this.getAttributeValue(MONEY);
    }

    public UFDouble getNotaxmny() {
        return (UFDouble)this.getAttributeValue(NOTAXMNY);
    }

    public UFDouble getNotaxprice() {
        return (UFDouble)this.getAttributeValue(NOTAXPRICE);
    }

    public UFDouble getQuentity() {
        return (UFDouble)this.getAttributeValue(QUENTITY);
    }

    public String getPk_goldtax() {
        return (String)this.getAttributeValue(PK_GOLDTAX);
    }

    public String getPk_goldtax_b() {
        return (String)this.getAttributeValue(PK_GOLDTAX_B);
    }

    public UFDouble getPrice() {
        return (UFDouble)this.getAttributeValue(PRICE);
    }

    public UFDouble getPricemode() {
        return (UFDouble)this.getAttributeValue(PRICEMODE);
    }

    public String getQuoteunitname() {
        return (String)this.getAttributeValue(QUOTEUNITNAME);
    }

    public String getTaxitems() {
        return (String)this.getAttributeValue(TAXITEMS);
    }

    public UFDouble getTaxmny() {
        return (UFDouble)this.getAttributeValue(TAXMNY);
    }

    public UFDouble getTaxrate() {
        return (UFDouble)this.getAttributeValue(TAXRATE);
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

    public void setCcurrencyid(String ccurrencyid) {
        this.setAttributeValue(CCURRENCYID, ccurrencyid);
    }

    public void setCunitid(String cunitid) {
        this.setAttributeValue(CUNITID, cunitid);
    }

    public void setDiscountmny(UFDouble discountmny) {
        this.setAttributeValue(DISCOUNTMNY, discountmny);
    }

    public void setDiscountrate(UFDouble discountrate) {
        this.setAttributeValue(DISCOUNTRATE, discountrate);
    }

    public void setDiscounttaxmny(UFDouble discounttaxmny) {
        this.setAttributeValue(DISCOUNTTAXMNY, discounttaxmny);
    }

    public void setDr(Integer dr) {
        this.setAttributeValue(DR, dr);
    }

    public void setInvbaseid(String invbaseid) {
        this.setAttributeValue(INVBASEID, invbaseid);
    }

    public void setInvclassid(String invclassid) {
        this.setAttributeValue(INVCLASSID, invclassid);
    }

    public void setInvclassname(String invclassname) {
        this.setAttributeValue(INVCLASSNAME, invclassname);
    }

    public void setInvname(String invname) {
        this.setAttributeValue(INVNAME, invname);
    }

    public void setInvspec(String invspec) {
        this.setAttributeValue(INVSPEC, invspec);
    }

    public void setMoney(UFDouble money) {
        this.setAttributeValue(MONEY, money);
    }

    public void setNotaxmny(UFDouble notaxmny) {
        this.setAttributeValue(NOTAXMNY, notaxmny);
    }

    public void setNotaxprice(UFDouble notaxprice) {
        this.setAttributeValue(NOTAXPRICE, notaxprice);
    }

    public void setQuentity(UFDouble quentity) {
        this.setAttributeValue(QUENTITY, quentity);
    }

    public void setPk_goldtax(String pk_goldtax) {
        this.setAttributeValue(PK_GOLDTAX, pk_goldtax);
    }

    public void setPk_goldtax_b(String pk_goldtax_b) {
        this.setAttributeValue(PK_GOLDTAX_B, pk_goldtax_b);
    }

    public void setPrice(UFDouble price) {
        this.setAttributeValue(PRICE, price);
    }

    public void setPricemode(UFDouble pricemode) {
        this.setAttributeValue(PRICEMODE, pricemode);
    }

    public void setQuoteunitname(String quoteunitname) {
        this.setAttributeValue(QUOTEUNITNAME, quoteunitname);
    }

    public void setTaxitems(String taxitems) {
        this.setAttributeValue(TAXITEMS, taxitems);
    }

    public void setTaxmny(UFDouble taxmny) {
        this.setAttributeValue(TAXMNY, taxmny);
    }

    public void setTaxrate(UFDouble taxrate) {
        this.setAttributeValue(TAXRATE, taxrate);
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

