/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.basebill;

import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public interface IArapItemFieldVO {
    public static final String PK_PCORG = "pk_pcorg";
    public static final String PK_BU = "pk_bu";
    public static final String PK_FIORG = "pk_fiorg";
    public static final String VID_PCORG = "vid_pcorg";
    public static final String VID_BU = "vid_bu";
    public static final String VID_FIORG = "vid_fiorg";
    public static final String PREPAY = "prepay";
    public static final String PK_RESCENTER = "pk_rescenter";
    public static final String CUSTOMER = "customer";
    public static final String SUPPLIER = "supplier";
    public static final String POSTUNIT = "postunit";
    public static final String POSTPRICENOTAX = "postpricenotax";
    public static final String POSTQUANTITY = "postquantity";
    public static final String POSTPRICE = "postprice";
    public static final String CHECKDIRECTION = "checkdirection";
    public static final String COORDFLAG = "coordflag";
    public static final String DEALNO = "dealno";
    public static final String ITEMSTYLE = "itemstyle";
    public static final String EQUIPMENTCODE = "equipmentcode";
    public static final String DSTLSUBCS = "dstlsubcs";
    public static final String PRODUCTLINE = "productline";
    public static final String CASHITEM = "cashitem";
    public static final String PAYFLAG = "payflag";
    public static final String OCCUPATIONMNY = "occupationmny";
    public static final String BANKROLLPROJET = "bankrollprojet";
    public static final String ISVERIFYFINISHED = "isverifyfinished";
    public static final String PAUSETRANSACT = "pausetransact";
    public static final String BILLDATE = "billdate";
    public static final String PAYMAN = "payman";
    public static final String PAYDATE = "paydate";
    public static final String VERIFYFINISHEDDATE = "verifyfinisheddate";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String BILLCLASS = "billclass";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String ISPAYTERMMODIFIED = "ispaytermmodified";
    public static final String BUSIDATE = "busidate";
    public static final String PK_DEPTID_RES = "pk_deptid_res";
    public static final String PK_SUBJCODE = "pk_subjcode";
    public static final String BILLNO = "billno";
    public static final String OBJTYPE = "objtype";
    public static final String ROWNO = "rowno";
    public static final String TRANSFERFLAG = "transferflag";
    public static final String ROWTYPE = "rowtype";
    public static final String DIRECTION = "direction";
    public static final String CHECKTYPE = "checktype";
    public static final String PK_SSITEM = "pk_ssitem";
    public static final String COMMENT = "scomment";
    public static final String SUBJCODE = "subjcode";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String RATE = "rate";
    public static final String PK_DEPTID = "pk_deptid";
    public static final String PK_DEPTID_V = "pk_deptid_v";
    public static final String PK_PSNDOC = "pk_psndoc";
    public static final String MONEY_DE = "money_de";
    public static final String LOCAL_MONEY_DE = "local_money_de";
    public static final String COSTCENTER = "costcenter";
    public static final String CASHACCOUNT = "cashaccount";
    public static final String GROUPDEBIT = "groupdebit";
    public static final String GLOBALDEBIT = "globaldebit";
    public static final String GROUPRATE = "grouprate";
    public static final String GLOBALRATE = "globalrate";
    public static final String GROUPBALANCE = "groupbalance";
    public static final String GLOBALBALANCE = "globalbalance";
    public static final String GROUPTAX_CR = "grouptax_cr";
    public static final String GLOBALTAX_CR = "globaltax_cr";
    public static final String GROUPNOTAX_CR = "groupnotax_cr";
    public static final String GLOBALNOTTAX_CR = "globalnotax_cr";
    public static final String GROUPTAX_DE = "grouptax_de";
    public static final String GLOBALTAX_DE = "globaltax_de";
    public static final String GROUPNOTAX_DE = "groupnotax_de";
    public static final String GLOBALNOTTAX_DE = "globalnotax_de";
    public static final String GROUPCREDIT = "groupcredit";
    public static final String GLOBALCREDIT = "globalcredit";
    public static final String QUANTITY_DE = "quantity_de";
    public static final String QUANTITY_CR = "quantity_cr";
    public static final String LOCAL_MONEY_CR = "local_money_cr";
    public static final String MONEY_CR = "money_cr";
    public static final String MONEY_BAL = "money_bal";
    public static final String LOCAL_MONEY_BAL = "local_money_bal";
    public static final String QUANTITY_BAL = "quantity_bal";
    public static final String LOCAL_TAX_DE = "local_tax_de";
    public static final String NOTAX_DE = "notax_de";
    public static final String LOCAL_NOTAX_DE = "local_notax_de";
    public static final String LOCAL_TAX_CR = "local_tax_cr";
    public static final String NOTAX_CR = "notax_cr";
    public static final String LOCAL_NOTAX_CR = "local_notax_cr";
    public static final String PK_INVENTORY = "pk_inventory";
    public static final String PRICE = "price";
    public static final String TAXPRICE = "taxprice";
    public static final String TAXRATE = "taxrate";
    public static final String TAXNUM = "taxnum";
    public static final String TRANSFERDATE = "transferdate";
    public static final String PK_BALATYPE = "pk_balatype";
    public static final String TOP_BILLID = "top_billid";
    public static final String TOP_ITEMID = "top_itemid";
    public static final String TOP_BILLTYPE = "top_billtype";
    public static final String TOP_TRADETYPE = "top_tradetype";
    public static final String SRC_TRADETYPE = "src_tradetype";
    public static final String SRC_BILLTYPE = "src_billtype";
    public static final String SRC_BILLID = "src_billid";
    public static final String SRC_ITEMID = "src_itemid";
    public static final String TAXTYPE = "taxtype";
    public static final String PK_PAYTERM = "pk_payterm";
    public static final String CHECKNO = "checkno";
    public static final String PAYACCOUNT = "payaccount";
    public static final String RECACCOUNT = "recaccount";
    public static final String ORDERCUBASDOC = "ordercubasdoc";
    public static final String PRODUCEORDER = "produceorder";
    public static final String INNERORDERNO = "innerorderno";
    public static final String ASSETPACTNO = "assetpactno";
    public static final String CONTRACTNO = "contractno";
    public static final String FREECUST = "freecust";
    public static final String PK_BANKRECEIVE = "pk_bankreceive";
    public static final String FACARD = "facard";
    public static final String PURCHASEORDER = "purchaseorder";
    public static final String INVOICENO = "invoiceno";
    public static final String OUTSTORENO = "outstoreno";
    public static final String PK_JOBPHASE = "pk_jobphase";
    public static final String PK_JOB = "pk_job";
    public static final String DEF30 = "def30";
    public static final String DEF29 = "def29";
    public static final String DEF28 = "def28";
    public static final String DEF27 = "def27";
    public static final String DEF26 = "def26";
    public static final String DEF25 = "def25";
    public static final String DEF24 = "def24";
    public static final String DEF23 = "def23";
    public static final String DEF22 = "def22";
    public static final String DEF21 = "def21";
    public static final String DEF20 = "def20";
    public static final String DEF19 = "def19";
    public static final String DEF18 = "def18";
    public static final String DEF17 = "def17";
    public static final String DEF16 = "def16";
    public static final String DEF15 = "def15";
    public static final String DEF14 = "def14";
    public static final String DEF13 = "def13";
    public static final String DEF12 = "def12";
    public static final String DEF11 = "def11";
    public static final String DEF10 = "def10";
    public static final String DEF9 = "def9";
    public static final String DEF8 = "def8";
    public static final String DEF7 = "def7";
    public static final String DEF6 = "def6";
    public static final String DEF5 = "def5";
    public static final String DEF4 = "def4";
    public static final String DEF3 = "def3";
    public static final String DEF2 = "def2";
    public static final String DEF1 = "def1";
    public static final String CHECKELEMENT = "checkelement";
    public static final String PACTNO = "pactno";
    public static final String ORDERNO = "orderno";
    public static final String CUSTOMER_V = "customer_v";
    public static final String SUPPLIER_V = "supplier_v";
    public static final String ORDERCUBASDOC_V = "ordercubasdoc_v";

    public Integer getPrepay();

    public void setPrepay(Integer var1);

    public String getPk_rescenter();

    public void setPk_rescenter(String var1);

    public String getCustomer();

    public void setCustomer(String var1);

    public String getSupplier();

    public void setSupplier(String var1);

    public String getPostunit();

    public void setPostunit(String var1);

    public UFDouble getPostpricenotax();

    public void setPostpricenotax(UFDouble var1);

    public UFDouble getPostquantity();

    public void setPostquantity(UFDouble var1);

    public UFDouble getPostprice();

    public void setPostprice(UFDouble var1);

    public void setProject(String var1);

    public String getProjectelement();

    public void setProjectelement(String var1);

    public String getCheckdirection();

    public void setCheckdirection(String var1);

    public Integer getCoordflag();

    public void setCoordflag(Integer var1);

    public String getSeqnum();

    public void setSeqnum(String var1);

    public String getItemstyle();

    public void setItemstyle(String var1);

    public String getEquipmentcode();

    public void setEquipmentcode(String var1);

    public String getDstlsubcs();

    public void setDstlsubcs(String var1);

    public String getProductline();

    public void setProductline(String var1);

    public String getCashitem();

    public void setCashitem(String var1);

    public Integer getPayflag();

    public void setPayflag(Integer var1);

    public UFDouble getOccupationmny();

    public void setOccupationmny(UFDouble var1);

    public String getBankrollprojet();

    public void setBankrollprojet(String var1);

    public UFBoolean getIsverifyfinished();

    public void setIsverifyfinished(UFBoolean var1);

    public UFBoolean getPausetransact();

    public void setPausetransact(UFBoolean var1);

    public UFDate getBilldate();

    public void setBilldate(UFDate var1);

    public String getPayman();

    public void setPayman(String var1);

    public UFDate getPaydate();

    public void setPaydate(UFDate var1);

    public UFDate getVerifyfinisheddate();

    public void setVerifyfinisheddate(UFDate var1);

    public String getPk_group();

    public void setPk_group(String var1);

    public String getPk_org();

    public void setPk_org(String var1);

    public String getPk_billtype();

    public void setPk_billtype(String var1);

    public String getBillclass();

    public void setBillclass(String var1);

    public String getPk_tradetype();

    public void setPk_tradetype(String var1);

    public UFBoolean getIspaytermmodified();

    public void setIspaytermmodified(UFBoolean var1);

    public UFDate getBusidate();

    public void setBusidate(UFDate var1);

    public String getParentPK();

    public void setParentPK(String var1);

    public String getChildrenPK();

    public void setChildrenPK(String var1);

    public String getPk_deptid_res();

    public void setPk_deptid_res(String var1);

    public String getPk_subjcode();

    public void setPk_subjcode(String var1);

    public String getBillno();

    public void setBillno(String var1);

    public Integer getObjtype();

    public void setObjtype(Integer var1);

    public Integer getRowno();

    public void setRowno(Integer var1);

    public Integer getTransferflag();

    public void setTransferflag(Integer var1);

    public Integer getRowtype();

    public void setRowtype(Integer var1);

    public Integer getDirection();

    public void setDirection(Integer var1);

    public String getChecktype();

    public void setChecktype(String var1);

    public String getPk_ssitem();

    public void setPk_ssitem(String var1);

    public String getScomment();

    public void setScomment(String var1);

    public String getSubjcode();

    public void setSubjcode(String var1);

    public String getPk_currtype();

    public void setPk_currtype(String var1);

    public UFDouble getRate();

    public void setRate(UFDouble var1);

    public String getPk_deptid();

    public void setPk_deptid(String var1);

    public String getPk_psndoc();

    public void setPk_psndoc(String var1);

    public UFDouble getMoney_de();

    public void setMoney_de(UFDouble var1);

    public UFDouble getLocal_money_de();

    public void setLocal_money_de(UFDouble var1);

    public UFDouble getQuantity_de();

    public void setQuantity_de(UFDouble var1);

    public UFDouble getQuantity_cr();

    public void setQuantity_cr(UFDouble var1);

    public UFDouble getLocal_money_cr();

    public void setLocal_money_cr(UFDouble var1);

    public UFDouble getMoney_cr();

    public void setMoney_cr(UFDouble var1);

    public UFDouble getMoney_bal();

    public void setMoney_bal(UFDouble var1);

    public UFDouble getLocal_money_bal();

    public void setLocal_money_bal(UFDouble var1);

    public UFDouble getQuantity_bal();

    public void setQuantity_bal(UFDouble var1);

    public UFDouble getLocal_tax_de();

    public void setLocal_tax_de(UFDouble var1);

    public UFDouble getNotax_de();

    public void setNotax_de(UFDouble var1);

    public UFDouble getLocal_notax_de();

    public void setLocal_notax_de(UFDouble var1);

    public String getPk_inventory();

    public void setPk_inventory(String var1);

    public UFDouble getPrice();

    public void setPrice(UFDouble var1);

    public UFDouble getTaxprice();

    public void setTaxprice(UFDouble var1);

    public UFDouble getTaxrate();

    public void setTaxrate(UFDouble var1);

    public String getTaxnum();

    public void setTaxnum(String var1);

    public UFDate getTransferdate();

    public void setTransferdate(UFDate var1);

    public String getPk_balatype();

    public void setPk_balatype(String var1);

    public String getTop_billid();

    public void setTop_billid(String var1);

    public String getTop_itemid();

    public void setTop_itemid(String var1);

    public String getTop_billtype();

    public void setTop_billtype(String var1);

    public String getTop_tradetype();

    public void setTop_tradetype(String var1);

    public String getSrc_tradetype();

    public void setSrc_tradetype(String var1);

    public String getSrc_billtype();

    public void setSrc_billtype(String var1);

    public String getSrc_billid();

    public void setSrc_billid(String var1);

    public String getSrc_itemid();

    public void setSrc_itemid(String var1);

    public Integer getTaxtype();

    public void setTaxtype(Integer var1);

    public String getPk_payterm();

    public void setPk_payterm(String var1);

    public String getCheckno();

    public void setCheckno(String var1);

    public String getPayaccount();

    public void setPayaccount(String var1);

    public String getRecaccount();

    public void setRecaccount(String var1);

    public String getOrdercubasdoc();

    public void setOrdercubasdoc(String var1);

    public String getProduceorder();

    public void setProduceorder(String var1);

    public String getInnerorderno();

    public void setInnerorderno(String var1);

    public String getAssetpactno();

    public void setAssetpactno(String var1);

    public String getContractno();

    public void setContractno(String var1);

    public String getFreecust();

    public void setFreecust(String var1);

    public String getPk_bankreceive();

    public void setPk_bankreceive(String var1);

    public String getFacard();

    public void setFacard(String var1);

    public String getPurchaseorder();

    public void setPurchaseorder(String var1);

    public String getInvoiceno();

    public void setInvoiceno(String var1);

    public String getOutstoreno();

    public void setOutstoreno(String var1);

    public String getPk_jobphase();

    public void setPk_jobphase(String var1);

    public String getPk_job();

    public void setPk_job(String var1);

    public String getDef30();

    public void setDef30(String var1);

    public String getDef29();

    public void setDef29(String var1);

    public String getDef28();

    public void setDef28(String var1);

    public String getDef27();

    public void setDef27(String var1);

    public String getDef26();

    public void setDef26(String var1);

    public String getDef25();

    public void setDef25(String var1);

    public String getDef24();

    public void setDef24(String var1);

    public String getDef23();

    public void setDef23(String var1);

    public String getDef22();

    public void setDef22(String var1);

    public String getDef21();

    public void setDef21(String var1);

    public String getDef20();

    public void setDef20(String var1);

    public String getDef19();

    public void setDef19(String var1);

    public String getDef18();

    public void setDef18(String var1);

    public String getDef17();

    public void setDef17(String var1);

    public String getDef16();

    public void setDef16(String var1);

    public String getDef15();

    public void setDef15(String var1);

    public String getDef14();

    public void setDef14(String var1);

    public String getDef13();

    public void setDef13(String var1);

    public String getDef12();

    public void setDef12(String var1);

    public String getDef11();

    public void setDef11(String var1);

    public String getDef10();

    public void setDef10(String var1);

    public String getDef9();

    public void setDef9(String var1);

    public String getDef8();

    public void setDef8(String var1);

    public String getDef7();

    public void setDef7(String var1);

    public String getDef6();

    public void setDef6(String var1);

    public String getDef5();

    public void setDef5(String var1);

    public String getDef4();

    public void setDef4(String var1);

    public String getDef3();

    public void setDef3(String var1);

    public String getDef2();

    public void setDef2(String var1);

    public String getDef1();

    public void setDef1(String var1);

    public Integer getDr();

    public void setDr(Integer var1);

    public UFDateTime getTs();

    public void setTs(UFDateTime var1);

    public String getCheckelement();

    public void setCheckelement(String var1);

    public String getParentPKFieldName();

    public String getPKFieldName();

    public String getTableName();
}

